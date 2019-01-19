package com.example.demo.domain.condition;

public enum BELONGING {

	DEVELOPMENT("1","開発"),
	SALES("2","営業"),
	PL("3","PL"),
	BUSINESS("4","事務");

	String code;

	String value;

	private BELONGING(String code, String value
			) {
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

		return BELONGING.contains(target);
	}

}
