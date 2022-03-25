package com.lnt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lnt.domain.LoanDetails;
import com.lnt.domain.PersonalDetails;

import com.lnt.repository.PersonalDetailsDao;


@Service
public class PersonalDetailsService  {
	

	@Autowired
	private PersonalDetailsDao personal;
	
	/*
	 * public List<PersonalDetails> getPersonalList() { // TODO Auto-generated
	 * method stub return personal.getPersonalDetailsList(); }
	 */

	public PersonalDetails addPersonalDetailsList(PersonalDetails personalDetails) {
		
		return personal.save(personalDetails);
	
		
	}
	
	
	public PersonalDetails fetchUserByEmailId(String email1) {
		return personal.Email1(email1);
	}
	
	
	
	 public PersonalDetails fetchUserByEmailIdAndPassword(String email1, String password) { 
		 return personal.findByEmail1AndPassword(email1, password); }
	 
	

	
	
	
	

	
	
	


}
