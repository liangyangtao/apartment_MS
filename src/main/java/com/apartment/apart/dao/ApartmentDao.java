package com.apartment.apart.dao;

import java.util.List;

import com.apartment.mybatis.entity.Apartment;

public interface ApartmentDao {

	boolean addApartment(Apartment apartment);

	List<Apartment> readApartment(Apartment apartment, int start, int number);

	int countOfApartment();

	boolean updateApartment(Apartment apartment);

}
