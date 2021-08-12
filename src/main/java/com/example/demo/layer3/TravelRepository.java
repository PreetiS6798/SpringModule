package com.example.demo.layer3;

import java.util.List;


import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Travel;


@Repository
public interface TravelRepository {
	List<Travel> selectTravelById(int travelId);
	void insertTravel(Travel tra);
}
