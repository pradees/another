package com.capgemini.bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import com.capgemini.bank.bean.DemandDraft;

import Commoncon.Commoncon;

public abstract class DemandDraftDAO implements IDemandDraftDAO{
    
	
	 Connection c=null;
	 PreparedStatement pst=null;
	@Override
	public void addDemandDraftDetails(DemandDraft demandDraft) {
		// TODO Auto-generated method stub
		
		try {
			c=Commoncon.getCon();
			pst=c.prepareStatement("Insert into demand_draft values (Transaction_Id_Seq.nextval,?,?,?,SYSDATE,?,?,?)");
			pst.setString(1,demandDraft.getPatient_name());
			pst.setLong(2,demandDraft.getPhone_number());
			pst.setString(3,demandDraft.getIn_favor_of());
			pst.setLong(4,demandDraft.getDd_amount());
			pst.setLong(5,demandDraft.getDd_commission());
			
			pst.setString(6,demandDraft.getDd_description());
			pst.executeUpdate();
			pst=c.prepareStatement("select Transaction_Id_Seq.currval from dual ");
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				int id=rs.getInt(1);
				System.out.println("Your Demand Draft request has been successfully registered along with the  "+id);
			}
			System.out.println("Inserted");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return;
	}

	@Override
	public void getDemandDraftDetails(int transactionId) throws Exception {
		// TODO Auto-generated method stub
		c=Commoncon.getCon();
		pst=c.prepareStatement("select * from demand_draft where transaction_id="+transactionId);
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{   long b=rs.getLong(4)+rs.getInt(5);
			System.out.println("DD Amount:\n"+rs.getLong(4)+" "+" DD Commission:\n"+rs.getInt(5)+" "+" Total Amount: \n"+b+" "+" Remarks:\n"+rs.getString(6));
		}
		return ;
		
	}
	

}
