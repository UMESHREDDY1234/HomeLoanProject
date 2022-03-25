package com.lnt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lnt.domain.LoanDetails;
import com.lnt.repository.LoanDetailsDaoImpl;
@Service
public class LoanDetailsServiceImpl implements LoanDetailsService{
	
	@Autowired
	private LoanDetailsDaoImpl loanDetailsDaoImpl;

	@Override
	public List<LoanDetails> getLoanList() {
		// TODO Auto-generated method stub
		return loanDetailsDaoImpl.getLoanList();
	}

	@Override
	public LoanDetails addLoanDetails(LoanDetails loantable) {
		// TODO Auto-generated method stub
		return loanDetailsDaoImpl.addLoanDetails(loantable);
	}

	
	
	
	
	
	@Override
	public LoanDetails searchLoanByIdService(int id) {
		// TODO Auto-generated method stub
		/*
		 * LoanTable loan= loanDetailsDaoImpl.searchLoanPersonById(id);
		 * 
		 * 
		 * if(loan==null) { String msg="This Person "+id+" not found"; throw new
		 * ArithmeticException(msg); } return loan;
		 */
		
		return null;
	}

	

	

	@Override
	public LoanDetails updateLoanByStatus(String status,int loanId) {
		// TODO Auto-generated method stub
		
	
		return 	loanDetailsDaoImpl.updateStatus( status, loanId);
	}

	@Override
	public List<LoanDetails> getLoanListStatus(String status) {
		// TODO Auto-generated method stub
		return loanDetailsDaoImpl.getApprovedLoanList(status);
		
	
	}

	
	
	
	



}
