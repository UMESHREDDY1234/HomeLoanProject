package com.lnt.repository;

import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lnt.domain.LoanDetails;

@Repository
@Transactional
public class LoanDetailsDaoImpl implements LoanDetailsDao {

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<LoanDetails> getLoanList() {
		// TODO Auto-generated method stub
		return entityManager.createQuery("from LoanDetails").getResultList();
		//return entityManager.createQuery("select t.userName,t.maxLoanGrant,i.estimatedAmount from LoanTable t inner join IncomeDetails i on t.userName=i.userName ").getResultList();

		
	}
	
	
	
//To get Approved and Rejected loan list
	public List<LoanDetails> getApprovedLoanList(String status) {
		// TODO Auto-generated method stub
		
	
		return entityManager.createQuery("from LoanDetails where status="+"'"+status+"'").getResultList();
		//return entityManager.createQuery("select t.userName,t.maxLoanGrant,i.estimatedAmount from LoanTable t inner join IncomeDetails i on t.userName=i.userName ").getResultList();

	}
	
	
//To add Loan Details
	@Override     
	public LoanDetails addLoanDetails(LoanDetails loan) {
		// TODO Auto-generated method stub
		entityManager.persist(loan);
		return loan;

	}

	
	//To update 
	@Override
	public LoanDetails searchUserByLoanId(int loanId) {
		// TODO Auto-generated method stub
		return entityManager.find(LoanDetails.class, loanId);
	}
	
	
	//To Update the status 
	public LoanDetails updateStatus(String status, int loanId) {
		// TODO Auto-generated method stub
		
		
		
	 LoanDetails loanDetails = searchUserByLoanId(loanId);
	  loanDetails.setStatus(status);
	
      return loanDetails;
	
	}

	

	


	
	
	/*
	 * @Override public LoanTable searchLoanPersonById(int id) { // TODO
	 * Auto-generated method stub return entityManager.find(LoanTable.class, id); }
	 * 
	 * @Override public void updateLoanDetails(LoanTable loanTable, int id) { //
	 * TODO Auto-generated method stub
	 * 
	 * LoanTable loan = searchLoanPersonById(id);
	 * loan.setUserName(loanTable.getUserName());
	 * loan.setTenure(loanTable.getTenure());
	 * loan.setLoanAmount(loanTable.getLoanAmount());
	 * loan.setInterestRate(loanTable.getInterestRate());
	 * loan.setMaxLoanGrant(loanTable.getMaxLoanGrant());
	 * 
	 * 
	 * }
	 */

	

}


