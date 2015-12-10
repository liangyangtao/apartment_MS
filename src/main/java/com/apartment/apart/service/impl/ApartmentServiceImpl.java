package com.apartment.apart.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.apartment.apart.dao.ApartmentDao;
import com.apartment.apart.service.ApartmentService;
import com.apartment.mybatis.entity.Apartment;

@Repository
public class ApartmentServiceImpl implements ApartmentService {
	@Autowired
	ApartmentDao apartmentDao;

	public boolean addApartment(Apartment apartment) {
		return apartmentDao.addApartment(apartment);
	}

	public List<Apartment> readApartment(Apartment apartment, int start,
			int number) {
		// TODO Auto-generated method stub
		return apartmentDao.readApartment(apartment,start,number);
	}

	public int countOfApartment() {
		// TODO Auto-generated method stub
		return apartmentDao.countOfApartment();
	}

	public boolean updateApartment(Apartment apartment) {
		// TODO Auto-generated method stub
		return apartmentDao.updateApartment(apartment);
	}

}
