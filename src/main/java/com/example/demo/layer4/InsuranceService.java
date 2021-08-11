package com.example.demo.layer4;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.layer2.Insurance;

@Service
public interface InsuranceService {

	void insertInsuranceService(Insurance ins);
	List<Insurance> selectCustomerByIdService(int customerId);
}
