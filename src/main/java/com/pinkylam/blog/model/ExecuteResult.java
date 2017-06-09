package com.pinkylam.blog.model;

import java.util.Date;

/**
 * @author Pinky Lam 908716835@qq.com
 * @date 2017年6月9日 下午3:03:53
 */
public class ExecuteResult<T> {
	
	private final long timeOut = 50000L;
	private boolean isSuccess;
	private T data;

	private String errorCode;
	private String errorMsg;
	private String fromUrl;

	private Long processTime;
	@SuppressWarnings("unused")
	private Long flushTimeOut;

	public T getData() {
		return data;
	}

	public String getErrorCode() {
		return errorCode == null ? "" : errorCode;
	}

	public String getErrorMsg() {
		return errorMsg == null ? "" : errorMsg;
	}

	public Date getFlushTime() {
		return new Date();
		// return flushTime;
	}

	public Long getFlushTimeOut() {
		return timeOut;
		// return flushTimeOut;
	}

	public String getFromUrl() {
		return fromUrl;
	}

	public Long getProcessTime() {
		return processTime;
	}

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setData(T data) {
		this.data = data;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public void setFlushTimeOut(Long flushTimeOut) {
		this.flushTimeOut = flushTimeOut;
	}

	public void setFromUrl(String fromUrl) {
		this.fromUrl = fromUrl;
	}

	public void setProcessTime(Long processTime) {
		this.processTime = processTime;
	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

}
