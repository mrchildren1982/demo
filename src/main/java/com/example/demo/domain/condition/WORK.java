package com.example.demo.domain.condition;

public enum WORK {

	SEKKEI("1","設計"),
	SEKKEI_PG("2","設計/PG"),
	EIGYO("3","営業"),
	PG("4","PG"),
	KANRI("5","管理"),
	JIMU("6","一般事務");

	String code;

	String value;

	private WORK(String code, String value) {

		this.code = code;
		this.value = value;

	}


	public String getCode() {
		return this.code;
	}

	public String getValue() {
		return this.value;
	}

	public static boolean contains(String target) {
		return WORK.contains(target);
	}

}
