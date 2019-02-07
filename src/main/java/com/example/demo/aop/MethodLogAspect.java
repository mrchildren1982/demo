package com.example.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MethodLogAspect {

	Logger logger = LoggerFactory.getLogger(MethodLogAspect.class);

	@Before("execution(* *..*Service*.*(..))")
	public void startLog(JoinPoint joinPoint) {

		logger.debug("メソッドの実行開始： " + joinPoint.getSignature());

//		System.out.println("Before");
//
//		System.out.println("サービス開始： " + joinPoint.getSignature());

	}

//	@After("execution(* *..*Service*.*(..))")
	public void endLog(JoinPoint joinPoint) {

		System.out.println("After");
		System.out.println("サービス終了： " + joinPoint.getSignature());
	}

//	@Around("execution(* *..*Controller*.*(..))")
	public Object aroundLog(ProceedingJoinPoint joinPoint) throws Throwable {

		System.out.println("Around");

		System.out.println("コントローラメソッド開始： " + joinPoint.getSignature());
		try {
			// 対象メソッドの実行
			Object result = joinPoint.proceed();
			System.out.println("コントローラメソッドの正常終了: " + joinPoint.getSignature() + result);
			return result;

		} catch (Exception e) {
			System.out.println("コントローラメソッドの異常終了：　" + joinPoint.getSignature());
			e.printStackTrace();
			throw e;
		}
	}

//	@AfterReturning("execution(* *..*.*(..))")
	public void endLogIfNormallyEnd(JoinPoint joinPoint) {

		System.out.println("AfterReturning!!");
		System.out.println("メソッド正常終了：  " + joinPoint.getSignature());
	}

//	@AfterThrowing(value = "execution(* *..*.*(..)))", throwing = "e")
	public void endLogIfAbnormallyEnd(JoinPoint joinPoint, RuntimeException e) {

		System.out.println("メソッドい");

	}
}
