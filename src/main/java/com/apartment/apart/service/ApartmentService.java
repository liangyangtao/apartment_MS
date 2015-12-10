package com.apartment.apart.service;

import java.util.List;

import com.apartment.mybatis.entity.Apartment;

public interface ApartmentService {

	boolean addApartment(Apartment apartment);

	List<Apartment> readApartment(Apartment apartment, int start, int number);

	int countOfApartment();

	boolean updateApartment(Apartment apartment);

}
