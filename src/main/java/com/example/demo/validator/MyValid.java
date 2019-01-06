package com.example.demo.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import javax.validation.Payload;

@Target({ ElementType.TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR,
		ElementType.PARAMETER })
public @interface MyValid {

	String[] message() default "入力値を入力してください"; // エラーメッセージ

	Class<?>[] groups() default {};		//引数に使う型を宣言

	Class<? extends Payload>[] payload() default {};

}
