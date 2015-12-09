package com.apartment.user.action;

import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;

import org.apache.commons.lang3.RandomStringUtils;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AuthCodeAction extends ActionSupport implements
		ModelDriven<AuthCode> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private AuthCode authCode = new AuthCode();
	private ByteArrayInputStream inputStream;
	private JSONObject isAuthcode;

	/**
	 * 获取验证码
	 * 
	 * @return
	 */
	public String getAuthcode() {

		// 生成验证码
		String authcode = RandomStringUtils.random(4, true, true);
		Map<String, Object> session = ActionContext.getContext().getSession();
		session.put("checkcode", authcode);
		inputStream = new AuthCodeImgCreater().createAuthcode(authcode);
		return SUCCESS;

	}

	/**
	 * 校验验证码
	 * 
	 * @return
	 */
	public String checkAuthcode() {
		Map<String, Object> jsonMap = new HashMap<String, Object>();
		jsonMap.put("isAuthcode", "false");// rows键 存放每页记录 list
		Map<String, Object> session = ActionContext.getContext().getSession();
		String authcode = (String) session.get("checkcode");
		if (authcode == null) {
			jsonMap.put("isAuthcode", "false");
		} else {

			// 定义map

			if (authCode.getCode().toLowerCase().equals(authcode.toLowerCase())) {
				jsonMap.put("isAuthcode", "true");
			}
		}

		// jsonMap.put("success", true);
		isAuthcode = JSONObject.fromObject(jsonMap);

		return SUCCESS;
	}

	public AuthCode getModel() {
		return authCode;
	}

	public ByteArrayInputStream getInputStream() {
		return inputStream;
	}

	public void setInputStream(ByteArrayInputStream inputStream) {
		this.inputStream = inputStream;
	}

	public AuthCode getAuthCode() {
		return authCode;
	}

	public void setAuthCode(AuthCode authCode) {
		this.authCode = authCode;
	}

	public JSONObject getIsAuthcode() {
		return isAuthcode;
	}

	public void setIsAuthcode(JSONObject isAuthcode) {
		this.isAuthcode = isAuthcode;
	}

}
