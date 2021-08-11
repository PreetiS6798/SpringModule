package com.example.demo.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Insurance;


@Repository
public interface InsuranceRepository {
	void insertInsurance(Insurance ins);
	List<Insurance> selectCustomerById(int customerId);
}
