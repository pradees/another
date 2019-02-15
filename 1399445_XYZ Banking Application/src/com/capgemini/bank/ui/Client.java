package com.capgemini.bank.ui;

import java.util.Scanner;

import com.capgemini.bank.bean.DemandDraft;
import com.capgemini.bank.service.DemandDraftService;

public class Client {
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String customer_name;
		long phone_number;
		String in_favor_of;
		int dd_amount;
		String dd_description;
		int dd_commission = 0;
		
	DemandDraft demandDraft= new DemandDraft();
	DemandDraftService service=new DemandDraftService();
	
	System.out.println("1.Enter the Demand Draft Details\n 2.Print Demand Draft\n 3.Exit");
	
	int option=sc.nextInt();
	
	switch(option)
	{
  case 1:
	  System.out.println("Enter the Name of the customer");
	  customer_name=sc.next();
	  demandDraft.setCustomer_name(customer_name);
	  System.out.println("Enter customer phone number");
	  phone_number=sc.nextLong();
	  demandDraft.setPhone_number(phone_number);
	  System.out.println("In favor of");
	  in_favor_of=sc.next();
	  demandDraft.setIn_favor_of(in_favor_of);
	  System.out.println("Enter Demand Draft amount");
	  dd_amount=sc.nextInt();
	  demandDraft.setDd_amount(dd_amount);
	  
	  System.out.println("Enter commission");
	  dd_amount=sc.nextInt();
	  demandDraft.setDd_commission(dd_commission);
	  System.out.println("Enter the remarks");
	  dd_description=sc.next();
	  demandDraft.setDd_description(dd_description);
	  service.addDemandDraftDetails(demandDraft);
	  break;
	  
	  case 2:
		 System.out.println("Print Demand Draft");
	     int id=sc.nextInt();
	     service.getDemandDraftDetails(id);
	     break;
	    
	  case 3:System.exit(0);
	          break;
	  default:System.out.println("Enter the valid option");  
	     
	     

}
}
}
