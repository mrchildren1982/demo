package com.example.demo.domain.dto;

import java.io.Serializable;

public class MLoginUser implements Serializable{

	private String loginUserId;

	private String password;

	public MLoginUser() {
 
	}

	/**
	 * @return loginUserId
	 */
	public String getLoginUserId() {
		return loginUserId;
	}

	/**
	 * @param loginUserId セットする loginUserId
	 */
	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password セットする password
	 */
	public void setPassword(String password) {
		this.password = password;
	}


}
