package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.OptionalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

	@Bean
	OptionalValidatorFactoryBean validator() {

		OptionalValidatorFactoryBean validator = new OptionalValidatorFactoryBean();
		//setterメソッドなどを呼び出してカスタマイズする

		return validator;
	}

	@Override
	public Validator getValidator() {
		return validator();
	}
}