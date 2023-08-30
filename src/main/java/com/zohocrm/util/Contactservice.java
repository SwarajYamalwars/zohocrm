package com.zohocrm.util;


import java.util.List;

import com.zohocrm.entities.Contact;

public interface Contactservice {
	
	public void savecontact(Contact contact);

	public List<Contact> contactlead();

	public Contact contactlead(long id);


}
