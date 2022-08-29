package com.example.Assignment1.Exception;

import java.time.LocalDateTime;

public class Error {
	private String errorMessage;
	private Integer errorCode;
	private LocalDateTime timestamp;
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public Integer getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	public Error(String errorMessage, Integer errorCode, LocalDateTime timestamp) {
		super();
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
		this.timestamp = timestamp;
	}
	public Error() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Error [errorMessage=" + errorMessage + ", errorCode=" + errorCode + ", timestamp=" + timestamp + "]";
	}
	
	
	
}
