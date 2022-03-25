package com.lnt.repository;
import java.util.List;


import com.lnt.domain.LoanDetails;


public interface LoanDetailsDao {

	public List<LoanDetails> getLoanList();
	public LoanDetails addLoanDetails(LoanDetails loan);
	
	public List<LoanDetails> getApprovedLoanList(String status);
	
	public LoanDetails updateStatus(String status,int loanId);
	
	public LoanDetails searchUserByLoanId(int loanId);
	/*
	 * public LoanTable searchLoanPersonById(int id);
	 * 
	 * public void updateLoanDetails(LoanTable loanTable, int id);
	 */
	
}
