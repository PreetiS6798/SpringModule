package com.example.demo.layer4;

import java.util.List;


import org.springframework.stereotype.Service;

import com.example.demo.layer2.Claim;


@Service
public interface ClaimService {

	List<Claim> selectClaimByCustomerIdService(int customeId);
	void insertClaimService(Claim claim);
	void updateClaimService(Claim claim);
}
