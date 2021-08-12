package com.example.demo.layer4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.layer2.Claim;
import com.example.demo.layer2.Insurance;
import com.example.demo.layer2.Travel;
import com.example.demo.layer3.ClaimRepositoryImpl;
import com.example.demo.layer3.InsuranceRepositoryImpl;
import com.example.demo.layer3.TravelRepository;
import com.example.demo.layer3.TravelRepositoryImpl;

@Service
public class ClaimServiceImpl implements ClaimService {

	public ClaimServiceImpl() {
		System.out.println("In layer 4 Claim");
	}

	
	@Autowired
	ClaimRepositoryImpl claimRepo;


	@Override
	public List<Claim> selectClaimByCustomerIdService(int customerId) {
		System.out.println("ClaimServiceImpl: Layer 4 ");
		return claimRepo.selectClaimByCustomerId(customerId);
	}

	@Override
	public void insertClaimService(Claim claim) {
		claimRepo.insertClaim(claim);
		
	}

	@Override
	public void updateClaimService(Claim claim) {
		claimRepo.updateClaim(claim);
		
	}

}
