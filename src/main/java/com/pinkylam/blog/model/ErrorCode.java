package com.pinkylam.blog.model;

/**
 * @author Pinky Lam 908716835@qq.com
 * @date 2017年6月9日 下午3:07:00
 */
public enum ErrorCode {

	EXCEPTION("程序异常"),
	USERNAME_OR_PWD_ERROR("用户名或密码不正确");
	
	private String errorMsg;

	private ErrorCode(final String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

}
