package com.example.demo.handler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import com.example.demo.domain.cnst.SampleErrorMessgeMap;

/**
 * Spring Securityの認証失敗時に呼ばれるハンドラクラス
 * @author 雅幸
 *
 */
public class SampleAuthenticationFailureHandler implements AuthenticationFailureHandler {


	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException exception) throws IOException, ServletException {

		String errorId = "";
		//ExceptionからエラーIDをセットする
		if (exception instanceof BadCredentialsException) {
			errorId = SampleErrorMessgeMap.MSG_ERROR_0001;
		}

		response.sendRedirect(request.getContextPath() + "/" + request.getParameter("identifier") + "/index?error=" + errorId);

	}

}
