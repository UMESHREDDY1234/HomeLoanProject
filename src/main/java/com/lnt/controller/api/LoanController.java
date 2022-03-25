package com.lnt.controller.api;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lnt.domain.LoanDetails;
import com.lnt.service.LoanDetailsService;

@RestController
@CrossOrigin
public class LoanController {
	
	@Autowired
	private LoanDetailsService loanDetailsService;
	
	
	//To display the loan details of user. 
	@RequestMapping(value="/displayLoan")
	public List<LoanDetails> displayLoan()  {
		List<LoanDetails> loanList = loanDetailsService.getLoanList();
        System.out.println("Loan list : " + loanList);
		return loanList;
	}
	
	@RequestMapping(value = "/saveLoan", method = RequestMethod.POST)
	public LoanDetails saveLoan(@RequestBody  LoanDetails loantable)
			  {
		
		
		return loanDetailsService.addLoanDetails(loantable);
		
	}
	
	@RequestMapping(value="/displayStatusLoan")
	public List<LoanDetails> displayStatusLoan(@RequestParam String status)  {
		List<LoanDetails> loanList = loanDetailsService.getLoanListStatus(status);
        System.out.println("Loan list : " + loanList);
		return loanList;
	}
	
	
	
	@RequestMapping(value = "/loan/{status}/{loanId}",method = RequestMethod.PUT )
	public LoanDetails updateUserStatus(@PathVariable String status, @PathVariable int loanId) {
		
		return loanDetailsService.updateLoanByStatus(status, loanId);
	}
	
	
	
	

}
 //Approve Loan, Reject Loan , Get all pending loans, Get all Approved Loans