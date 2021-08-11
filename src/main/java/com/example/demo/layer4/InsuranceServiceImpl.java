package com.example.demo.layer4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.layer2.Insurance;
import com.example.demo.layer2.Travel;
import com.example.demo.layer3.InsuranceRepositoryImpl;

@Service
public class InsuranceServiceImpl implements InsuranceService {

	public InsuranceServiceImpl() {
		System.out.println("In layer 4");
	}
	
	@Autowired
	InsuranceRepositoryImpl insRepo;
	
	@Override
	public void insertInsuranceService(Insurance ins) {
		insRepo.insertInsurance(ins);

	}

	@Override
	public List<Insurance> selectCustomerByIdService(int customerId) {
		System.out.println("InsuranceServiceImpl: Layer 4 ");
		return insRepo.selectCustomerById(customerId);
	}

	@Override
	public List<Travel> selectTravelByIdService(int travelId) {
		System.out.println("InsuranceServiceImpl: Layer 4 ");
		return insRepo.selectTravelById(travelId);
	}

}
