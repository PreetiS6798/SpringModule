package com.example.demo.layer5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.layer2.Insurance;
import com.example.demo.layer4.InsuranceServiceImpl;

@CrossOrigin
@RestController
@RequestMapping("/insurance")
public class InsuranceJPAController {

	public InsuranceJPAController() {
		System.out.println("In Layer 5");
	}

	
	@Autowired
	InsuranceServiceImpl insService;
	
	@GetMapping
	@ResponseBody
	@RequestMapping(value="/getCustomer/{customerId}")
	public List<Insurance> getInsuranceByCustomerId(@PathVariable int customerId){
		System.out.println("in getInsuranceByCustomerId() ... method");
		return insService.selectCustomerByIdService(customerId);
	}
}
