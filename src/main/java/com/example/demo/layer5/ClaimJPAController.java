package com.example.demo.layer5;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.layer2.Claim;
import com.example.demo.layer4.ClaimServiceImpl;

@CrossOrigin
@RestController
@RequestMapping("/claim")
public class ClaimJPAController {

	public ClaimJPAController() {
		System.out.println("In Layer 5 Claim Controller");
	}

	
	@Autowired
	ClaimServiceImpl claimService;
	
	
	@GetMapping
	@ResponseBody
	@RequestMapping(value="/getClaim/{customerId}")
	public List<Claim> getClaimByCustomerId(@PathVariable int customerId){
		System.out.println("in getClaimByCustomerId() ... method");
		return claimService.selectClaimByCustomerIdService(customerId);
	}
	
	@PostMapping
	@ResponseBody
	@RequestMapping(value = "/addClaim")
	public void addTravel(@RequestBody Claim claim) {
		claimService.insertClaimService(claim);
	 }
	
	@PutMapping
	@ResponseBody
	@RequestMapping(value = "/updateClaim")
	public void updateClaimForCustomer(@RequestBody Claim claim) {
		claimService.updateClaimService(claim);
	}
	
}
