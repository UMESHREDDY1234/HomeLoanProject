package com.lnt.domain;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "loan")
public class LoanDetails {
	
	@Id
	@Column(name = "loan_id")
	@GeneratedValue
	private Integer loanId;
	
	
	@Column(name = "user_name")
	private String userName;
	
	
	@Column(name = "max_loan_grant")
	private Double maxLoanGrant;
	
	@Column(name = "interest_rate ")
	private Double interestRate;
	
	@Column(name = "tenure")
	private Integer  tenure;
	
	@Column(name = "loan_amount")
	private Long loanAmount;
	
	@Column(name = "status")
	private String  status;
	

	
	@ManyToOne(targetEntity = PersonalDetails.class,cascade = { CascadeType.ALL })
//	@JoinTable(name = "LoanDetails",   
//    joinColumns = { @JoinColumn(name = "pId")})
	private PersonalDetails personalDetails ;
	
	
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	
	
	

	public Integer getLoanId() {
		return loanId;
	}

	public void setLoanId(Integer loanId) {
		this.loanId = loanId;
	}

	public LoanDetails() {

	}

	public LoanDetails(Double maxLoanGrant, Double interestRate, Integer tenure, Long loanAmount) {
		super();
		this.maxLoanGrant = maxLoanGrant;
		this.interestRate = interestRate;
		this.tenure = tenure;
		this.loanAmount = loanAmount;
	}

	

	public Double getMaxLoanGrant() {
		return maxLoanGrant;
	}

	public void setMaxLoanGrant(Double maxLoanGrant) {
		this.maxLoanGrant = maxLoanGrant;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public Integer getTenure() {
		return tenure;
	}

	public void setTenure(Integer tenure) {
		this.tenure = tenure;
	}

	public Long getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(Long loanAmount) {
		this.loanAmount = loanAmount;
	}
	


	

	

}
