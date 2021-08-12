package com.example.demo.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Claim;


@Repository
public interface ClaimRepository {
	List<Claim> selectClaimByCustomerId(int customerId);
	void insertClaim(Claim claim);
	void updateClaim(Claim claim);
}
