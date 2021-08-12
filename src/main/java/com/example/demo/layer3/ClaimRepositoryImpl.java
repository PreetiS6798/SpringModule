package com.example.demo.layer3;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.layer2.Claim;
import com.example.demo.layer2.Customer;

@Repository
public class ClaimRepositoryImpl extends BaseRepository implements ClaimRepository {



	@Transactional
	public void insertClaim(Claim claim) {
		EntityManager entityManager = getEntityManager();
		entityManager.persist(claim);
		System.out.println("claim inserted..." + claim);
	}
	
	@Transactional
	public List<Claim> selectClaimByCustomerId(int customerId) {
		EntityManager entityManager = getEntityManager();
		Customer customer = entityManager.find(Customer.class, customerId);
		System.out.println("debug selectClaimByCustomerId");
		Query query = entityManager.createQuery("select c from Claim c where c.insurance in (select i from Insurance i where i.customer =: custObj)");
		query.setParameter("custObj", customer);
		List<Claim> claimList = query.getResultList();
		return claimList;
	}

	@Transactional
	public void updateClaim(Claim claim) {
		EntityManager entityManager = getEntityManager();
		System.out.println("claim updation started "+claim);
		Claim updatedClaim = entityManager.merge(claim);
		System.out.println("Claim updated "+updatedClaim);
		
	}

	

}
