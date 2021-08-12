package com.example.demo.layer4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.layer2.Insurance;
import com.example.demo.layer2.Travel;
import com.example.demo.layer3.InsuranceRepositoryImpl;
import com.example.demo.layer3.TravelRepository;
import com.example.demo.layer3.TravelRepositoryImpl;

@Service
public class TravelServiceImpl implements TravelService {

	public TravelServiceImpl() {
		System.out.println("In layer 4");
	}

	@Autowired
	TravelRepositoryImpl travelRepo;


	@Override
	public List<Travel> selectTravelByIdService(int travelId) {
		System.out.println("InsuranceServiceImpl: Layer 4 ");
		return travelRepo.selectTravelById(travelId);
	}

	@Override
	public void insertTravelService(Travel tra) {
		travelRepo.insertTravel(tra);

	}

}
