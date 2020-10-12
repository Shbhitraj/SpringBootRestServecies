package com.example.demo.jwt.model;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
@Entity
@AllArgsConstructor
public class Response {

	private String tokens;
	private String message;

	public Response(String tokens, String message) {
		super();
		this.tokens = tokens;
		this.message = message;
	}

	public String getTokens() {
		return tokens;
	}

	public void setTokens(String tokens) {
		this.tokens = tokens;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Response [tokens=" + tokens + ", message=" + message + "]";
	}

}
