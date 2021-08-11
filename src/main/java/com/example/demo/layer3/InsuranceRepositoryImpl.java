package com.example.demo.layer3;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.layer2.Insurance;


@Repository
public class InsuranceRepositoryImpl  extends BaseRepository implements InsuranceRepository {

	@Transactional
	public void insertInsurance(Insurance ins) {
		EntityManager entityManager = getEntityManager();
		entityManager.persist(ins);
		System.out.println("Insurance inserted..."+ins);
	}
	
	@Transactional
	public List<Insurance> selectCustomerById(int customerId){
		EntityManager entityManager = getEntityManager();
		System.out.println("debug selectInsuranceById");
		Query query = entityManager.createQuery("select c from Customer c where c.custId =: cid");
		query.setParameter("cid", customerId);
		List<Insurance> insList = query.getResultList();
		return insList;
	}

}
