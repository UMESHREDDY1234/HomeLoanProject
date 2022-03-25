package com.lnt.service;

import java.util.List;

import com.lnt.domain.LoanDetails;

public interface LoanDetailsService {
	public List<LoanDetails> getLoanList();

	public LoanDetails addLoanDetails(LoanDetails loantable);
	
	public LoanDetails searchLoanByIdService(int id);
	
	
	
	public List<LoanDetails> getLoanListStatus(String status);
	
	LoanDetails updateLoanByStatus(String status, int loanId);

	
}
