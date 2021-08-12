package com.example.demo.layer4;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.layer2.Insurance;
import com.example.demo.layer2.Travel;

@Service
public interface TravelService {

	List<Travel> selectTravelByIdService(int travelId);
	void insertTravelService(Travel tra);
}
