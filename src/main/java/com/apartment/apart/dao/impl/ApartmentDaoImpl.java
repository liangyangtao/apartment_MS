package com.apartment.apart.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.apartment.apart.dao.ApartmentDao;
import com.apartment.mybatis.entity.Apartment;
import com.apartment.mybatis.entity.ApartmentExample;
import com.apartment.mybatis.entity.ShuShe;
import com.apartment.mybatis.mapper.ApartmentMapper;
import com.apartment.mybatis.mapper.ShuSheMapper;

@Repository
public class ApartmentDaoImpl implements ApartmentDao {

	@Autowired
	private ApartmentMapper apartmentMapper;
	@Autowired
	private ShuSheMapper sheMapper;

	public boolean addApartment(Apartment apartment) {
		int i = apartmentMapper.insertSelective(apartment);
		if (i == 0) {
			return false;

		} else {
			// 如果保存成功，自动生成宿舍号
			crateShushe(apartment);

			return true;
		}
	}

	private void crateShushe(Apartment apartment) {
		for (int j = 0; j < apartment.getApartRoomNum(); j++) {
			try {
				ShuShe shuShe = new ShuShe();
				shuShe.setApartmentNum(apartment.getId());
				shuShe.setSusheName(apartment.getId() + "0" + j);
				shuShe.setSushePeopleNum(6);
				shuShe.setSurplusPeopleNum(6);
				sheMapper.insertSelective(shuShe);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public List<Apartment> readApartment(Apartment apartment, int start,
			int number) {

		ApartmentExample apartmentExample = new ApartmentExample();
		// 条件设置
		// apartmentExample.or().and
		apartmentExample.setOrderByClause("id limit " + start + "," + number);
		return apartmentMapper.selectByExample(apartmentExample);
	}

	public int countOfApartment() {
		ApartmentExample apartmentExample = new ApartmentExample();
		return apartmentMapper.countByExample(apartmentExample);
	}

	public boolean updateApartment(Apartment apartment) {
		ApartmentExample apartmentExample = new ApartmentExample();
		int i = apartmentMapper.updateByExampleSelective(apartment,
				apartmentExample);
		if (i == 0) {
			return false;
		} else {
			return true;
		}

	}

}
