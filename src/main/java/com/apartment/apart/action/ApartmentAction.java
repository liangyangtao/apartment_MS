package com.apartment.apart.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.springframework.beans.factory.annotation.Autowired;

import com.apartment.apart.service.ApartmentService;
import com.apartment.mybatis.entity.Apartment;
import com.apartment.user.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Action
public class ApartmentAction extends ActionSupport implements
		ModelDriven<Apartment> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2876710797126015198L;
	private Apartment apartment = new Apartment();
	private Map<String, Object> result = new HashMap<String, Object>();
	@Autowired
	private ApartmentService apartmentService;
	private Integer rows;// 每页显示的记录数
	private Integer page;// 当前第几页

	/**
	 * 增加公寓
	 * 
	 * @return
	 */
	public String addApartment() {
		apartment.setSurplusRoomNum(apartment.getApartRoomNum());
		boolean isSave = apartmentService.addApartment(apartment);
		if (isSave) {
			result.put("isSave", "true");
		} else {
			result.put("isSave", "false");
		}
		return SUCCESS;
	}

	/**
	 * 读取公寓列表
	 * 
	 * @return
	 */
	public String readApartment() {
		int intPage = page == 0 ? 1 : page;
		// 每页显示条数
		int number = 20;
		// 每页的开始记录 第一页为1 第二页为number +1
		int start = (intPage - 1) * number;
		List<Apartment> apartments = apartmentService.readApartment(apartment,
				start, number);
		int totalNum = countOfApartment();
		result.put("total", totalNum);
		result.put("rows", apartments);
		return SUCCESS;
	}

	public int countOfApartment() {
		return apartmentService.countOfApartment();
	}

	/**
	 * 更新和删除公寓信息
	 * 
	 * @return
	 */
	public String updateApartment() {
		boolean isUpdate = apartmentService.updateApartment(apartment);
		if (isUpdate) {
			result.put("isUpdate", "true");
		} else {
			result.put("isUpdate", "false");
		}
		return SUCCESS;
	}

	public Apartment getModel() {
		return apartment;
	}

	public Apartment getApartment() {
		return apartment;
	}

	public void setApartment(Apartment apartment) {
		this.apartment = apartment;
	}

	public Map<String, Object> getResult() {
		return result;
	}

	public void setResult(Map<String, Object> result) {
		this.result = result;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

}
