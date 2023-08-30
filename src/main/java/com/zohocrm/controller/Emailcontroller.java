package com.zohocrm.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.zohocrm.util.Emailservice;


@Controller
public class Emailcontroller {
	@Autowired
	private Emailservice Emailservice;
	
@RequestMapping("/composeEmail")
	public String emaillead(@RequestParam("email")String email,Model model) {
	model.addAttribute("email", email);
		return"composeemail";
	}
@RequestMapping("/sendemail")
public String sendemail(@RequestParam("to") String to,@RequestParam("sub") String sub,@RequestParam("msg")String msg,Model model) {
	Emailservice.sendemail(to, sub, msg);
	model.addAttribute("msg", "yes finally");
	return "composeemail";
}
}
