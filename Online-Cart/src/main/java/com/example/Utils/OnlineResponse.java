package com.example.Utils;

import java.util.List;

import org.springframework.http.HttpStatus;

public class OnlineResponse<T> {

	private boolean status;
	private HttpStatus httpStatus;
	private String message;
	private T result;
	private List<String> errors;

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}

	public List<String> getErrors() {
		return errors;
	}

	public void setErrors(List<String> errors) {
		this.errors = errors;
	}

	public OnlineResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OnlineResponse(HttpStatus httpStatus, String message) {
		super();
		this.httpStatus = httpStatus;
		this.message = message;
	}

	public OnlineResponse(HttpStatus httpStatus, T result) {
		super();
		this.httpStatus = httpStatus;
		this.result = result;
	}

	public OnlineResponse(boolean status, HttpStatus httpStatus, String message, T result) {
		super();
		this.status = status;
		this.httpStatus = httpStatus;
		this.message = message;
		this.result = result;
	}

	public OnlineResponse(boolean status, HttpStatus httpStatus, T result) {
		super();
		this.status = status;
		this.httpStatus = httpStatus;
		this.result = result;
	}

	public OnlineResponse(boolean status, HttpStatus httpStatus, String message, T result, List<String> errors) {
		super();
		this.status = status;
		this.httpStatus = httpStatus;
		this.message = message;
		this.result = result;
		this.errors = errors;
	}

}
