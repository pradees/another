package com.capgemini.bank.bean;

import java.sql.Date;

public class DemandDraft {
	
	int transaction_id;
	String customer_name;
	String in_favor_of;
	long phone_number;
	Date date_of_transaction;
	int dd_amount;
	int dd_commission;
	String dd_description;
	public int getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getIn_favor_of() {
		return in_favor_of;
	}
	public void setIn_favor_of(String in_favor_of) {
		this.in_favor_of = in_favor_of;
	}
	public long getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}
	public Date getDate_of_transaction() {
		return date_of_transaction;
	}
	public void setDate_of_transaction(Date date_of_transaction) {
		this.date_of_transaction = date_of_transaction;
	}
	public int getDd_amount() {
		return dd_amount;
	}
	public void setDd_amount(int dd_amount) {
		this.dd_amount = dd_amount;
	}
	public int getDd_commission() {
		return dd_commission;
	}
	public void setDd_commission(int dd_commission) {
		this.dd_commission = dd_commission;
	}
	public String getDd_description() {
		return dd_description;
	}
	public void setDd_description(String dd_description) {
		this.dd_description = dd_description;
	}
	public String getPatient_name() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
