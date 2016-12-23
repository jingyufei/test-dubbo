package com.jing.response;

import java.io.Serializable;

public class ResponseResult implements Serializable {
	private static final long serialVersionUID = -1134614110776382336L;
	public ResponseResult() {
		super();
	}
	
	public ResponseResult(String code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	private String code;
	private String message;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "ResponseResult [code=" + code + ", message=" + message + "]";
	}
	
	
}
