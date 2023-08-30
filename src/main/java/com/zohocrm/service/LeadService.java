package com.zohocrm.service;

import java.util.List;

import com.zohocrm.entities.Lead;

public interface LeadService {

	
	public void saveonelead(Lead lead);

	public Lead getLeadById(long id);

	public void deleteById(long id);

	public List<Lead> getAllLeads();

}
