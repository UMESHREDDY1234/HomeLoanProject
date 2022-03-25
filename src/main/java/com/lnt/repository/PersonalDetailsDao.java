package com.lnt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lnt.domain.PersonalDetails;





public interface PersonalDetailsDao extends JpaRepository<PersonalDetails, Integer>{

	//public List<PersonalDetails> getPersonalDetailsList();
	
	//public PersonalDetails addPersonalDetails(PersonalDetails personalDetails);
	
	public PersonalDetails Email1(String email1);
	
	public PersonalDetails findByEmail1AndPassword(String email1, String password);
	
    
	
	
   
		
}
