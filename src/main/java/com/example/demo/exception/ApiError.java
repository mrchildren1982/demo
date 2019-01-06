package com.example.demo.exception;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApiError extends Exception implements Serializable {

	private static final long serialVersionUID = 1L;

	private String message;

	private List<String> messages;

	@JsonProperty("documentionUrl")
	private String documentionUrl;

	public void setMessage(String message) {

		this.message = message;

	}

	public String getMessage() {

		return this.message;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

	public List<String> getMessages() {
		return this.messages;
	}

	/**
	 * @return documentionUrl
	 */
	public String getDocumentionUrl() {
		return documentionUrl;
	}

	/**
	 * @param documentionUrl セットする documentionUrl
	 */
	public void setDocumentionUrl(String documentionUrl) {
		this.documentionUrl = documentionUrl;
	}



}
