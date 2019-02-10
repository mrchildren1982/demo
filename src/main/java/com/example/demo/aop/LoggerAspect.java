package com.example.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ログ出力関連のAOPクラス
 *
 * @author 雅幸
 *
 */
//@Aspect
//@Component
public class LoggerAspect {

	/** ロガー */
	private static final Logger logger = LoggerFactory.getLogger(LoggerAspect.class);

	/** Pointcut */
	private static final String EXECUTION_SERVICE = "execution(* *..*Service.*(..))";


	/**
	 * サービスクラス実行前のログ
	 *
	 * @param jp
	 */
//	@Before(EXECUTION_SERVICE)
	public void startLog(JoinPoint jp) {

		logger.debug("サービス処理開始");
		logger.debug(jp.getSignature().toString());
	}

	/**
	 * サービスクラス正常終了時のログ
	 *
	 * @param jp
	 */
//	@AfterReturning(EXECUTION_SERVICE)
	public void endLog(JoinPoint jp) {

		logger.debug("サービス処理正常終了");
		logger.debug(jp.getSignature().toString());
	}

//	@AfterThrowing(value =EXECUTION_SERVICE, throwing = "e")
	public void endWithAbnormalLog(JoinPoint jp, RuntimeException e) {

		logger.debug("サービス処理異常終了");
		logger.debug(jp.getSignature().toString());
		e.printStackTrace();

	}
}
