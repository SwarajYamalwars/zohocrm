package com.zohocrm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Billing;
import com.zohocrm.repositories.Billingrepositories;
@Service
public class Billingserviceimpl implements Billingservice {
	
	@Autowired
	private Billingrepositories billingrepo;

	@Override
	public void generatebill(Billing bill) {
billingrepo.save(bill);
	}

}
