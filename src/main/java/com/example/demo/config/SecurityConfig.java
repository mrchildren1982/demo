package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.example.demo.domain.service.UserDetailsServiceImpl;
import com.example.demo.handler.SampleAuthenticationFailureHandler;

/**
 * Spring Security設定クラス
 * @author 雅幸
 *
 */
//@Configuration
//@EnableWebMvcSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	public void configure(WebSecurity web) throws  Exception {

		//セキュリテ設定を無視するリクエスト設定
		//静的リソース(images, css, javascript)に対するアクセスはセキュリティ設定を無視する
		web.ignoring().antMatchers(
				"/images/**",
				"/css/**",
				"/javascript/**",
				"/webjars/**"
				);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		//認可の設定
		http.authorizeRequests().antMatchers("/","/index").permitAll()		//indexは全ユーザアクセス許可
		.anyRequest().authenticated();										//それ以外はすべて認証なしのアクセス不許可

		//ログイン設定
		http.formLogin()
		.loginProcessingUrl("/login")
		.loginPage("/index")
		.failureHandler(new SampleAuthenticationFailureHandler())	//認証失敗時に呼ばれるハンドラクラス
		.defaultSuccessUrl("/menu")	//認証成功時の遷移先
		.usernameParameter("login_id").passwordParameter("login_password")		//ユーザ名・パスワード
		.and();

		//ログアウト設定
		http.logout()
		.logoutRequestMatcher(new AntPathRequestMatcher("/logout**"))		//ログアウト処理のパス
		.logoutSuccessUrl("/index");											//ログアウト完了時のパス


	}

	@Configuration
	protected static class uthenticationConfiguration extends GlobalAuthenticationConfigurerAdapter{

		@Autowired
		UserDetailsServiceImpl userDetailsService;

		@Override
		public void init(AuthenticationManagerBuilder auth) throws Exception {

			//認証するユーザーを設定する
			auth.userDetailsService( userDetailsService)
			//入力値をbcryptでハッシュ化した値でパスワード認証を行う
			.passwordEncoder(new BCryptPasswordEncoder());

		}
	}

}
