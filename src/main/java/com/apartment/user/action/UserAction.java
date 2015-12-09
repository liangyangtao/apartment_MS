package com.apartment.user.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.springframework.beans.factory.annotation.Autowired;

import com.apartment.mybatis.entity.User;
import com.apartment.user.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Action
public class UserAction extends ActionSupport implements ModelDriven<User> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	private UserService userService;
	private User user = new User();

	private Map<String, Object> commMap = new HashMap<String, Object>();
	private Map<String, Object> userMap = new HashMap<String, Object>();

	/**
	 * 注册用户
	 * 
	 * @return
	 */
	public String regUser() {
		return SUCCESS;
	}

	public String checkUser() {
		Map<String, Object> session = ActionContext.getContext().getSession();
		if (session.get("USER_NAME") == null) {
			commMap.put("isLogin", "false");
		} else {
			commMap.put("isLogin", "true");
		}
		return SUCCESS;
	}

	/**
	 * 登陆
	 * 
	 * @return
	 */
	public String loginUser() {

		User u = userService.loginUser(user);

		if (u != null) {
			commMap.put("success", true);
			commMap.put("permission", u.getPermission());
			commMap.put("name", u.getUsername());
			commMap.put("dept", u.getDepartment());

			Map<String, Object> session = ActionContext.getContext()
					.getSession();
			session.put("USER_NAME", u.getUsername());
			session.put("PERMISSION", u.getPermission());
			session.put("USER_ID", u.getId());

		} else {
			commMap.put("success", false);
		}
		return SUCCESS;
	}

	public User getModel() {
		return user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Map<String, Object> getCommMap() {
		return commMap;
	}

	public void setCommMap(Map<String, Object> commMap) {
		this.commMap = commMap;
	}

	public Map<String, Object> getUserMap() {
		return userMap;
	}

	public void setUserMap(Map<String, Object> userMap) {
		this.userMap = userMap;
	}

}
