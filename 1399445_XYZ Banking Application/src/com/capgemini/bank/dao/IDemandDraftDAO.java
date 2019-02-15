package com.capgemini.bank.dao;

import com.capgemini.bank.bean.DemandDraft;

public interface IDemandDraftDAO {
	
	void  addDemandDraftDetails(DemandDraft demandDraft) throws Exception;
	void getDemandDraftDetails(int transactionId) throws Exception;




}
