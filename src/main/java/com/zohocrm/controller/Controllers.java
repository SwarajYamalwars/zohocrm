package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Contact;
import com.zohocrm.entities.Lead;
import com.zohocrm.service.LeadService;
import com.zohocrm.util.Contactservice;

@Controller
public class Controllers {
	@Autowired
	private  LeadService leadService;
	
	@Autowired
	private Contactservice contactservice;

	@RequestMapping(value="/createLead",method=RequestMethod.GET)
	public String createform() {
		return"createlead";
	}
	
	@RequestMapping(value="/SAVELEAD",method=RequestMethod.POST)
	public String savelead(@ModelAttribute("lead") Lead lead,Model model) {
		leadService.saveonelead(lead);
		model.addAttribute("lead", lead);
		return"leadinfo";
	}
	@RequestMapping("/convertlead")
	public String convertlead(@RequestParam("id")long id,Model model) {
		Lead lead = leadService.getLeadById(id);
		Contact contact=new Contact();
		contact.setFirstname(lead.getFirstname());
		contact.setLastname(lead.getLastname());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		contact.setSource(lead.getSource());
		
		contactservice.savecontact(contact);
		
		leadService.deleteById(id);
		
		List<Contact> contacts = contactservice.contactlead();
		model.addAttribute("contact", contacts);
		return"contactleads";
	}
	@RequestMapping("/listleads")
	public String listleads(Model model) {
		List<Lead> leads = leadService.getAllLeads();
		model.addAttribute("leads", leads);
		return"listleads";
	}
	@RequestMapping("/Leadinfo")
	public String leadinfo(@RequestParam("id")long id, Model model) {
		Lead lead = leadService.getLeadById(id);
		model.addAttribute("lead", lead);
		return"leadinfo";
	}
}
