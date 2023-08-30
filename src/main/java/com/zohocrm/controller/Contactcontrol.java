package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Billing;
import com.zohocrm.entities.Contact;
import com.zohocrm.service.Billingservice;
import com.zohocrm.util.Contactservice;

@Controller
public class Contactcontrol {
	@Autowired
	private Contactservice contactservice;
	
	@Autowired
	private Billingservice billingserv;
	
	@RequestMapping("/contactleads")
	public String contactleads(Model model) {
		List<Contact> contact = contactservice.contactlead();
		model.addAttribute("contact", contact);
		return"contactleads";
	}
	@RequestMapping("/createbill")
	public String createbill(@RequestParam("id")long id,Model model) {
		Contact contact=contactservice.contactlead(id);
		model.addAttribute("contact", contact);
		return"generatebill";
	}
	
	@RequestMapping("/savebill")
	public String saveBill(Billing bill) {
		billingserv.generatebill(bill);
		return "listbills";
	}
}
