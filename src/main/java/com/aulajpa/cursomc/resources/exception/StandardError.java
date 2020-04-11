package com.aulajpa.cursomc.resources.exception;

import java.io.Serializable;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class StandardError implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private java.lang.Integer status;
	private String msg;
	private Long timestamp;
	
	public StandardError() {
		
	}
	
	public StandardError(java.lang.Integer status, String msg, Long timestamp) {
		super();
		this.status = status;
		this.msg = msg;
		this.timestamp = timestamp;
	}

	public java.lang.Integer getStatus() {
		return status;
	}
	
	public void setStatus(java.lang.Integer status) {
		this.status = status;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public Long getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
}
