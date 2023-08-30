package com.zohocrm.util;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Contact;
import com.zohocrm.repositories.Contactrepo;
@Service
public class ContactServiceimpl implements Contactservice {
	@Autowired
	private Contactrepo contactrepo;

	@Override
	public void savecontact(Contact contact) {
contactrepo.save(contact);
	}

	@Override
	public List<Contact> contactlead() {
List<Contact> leads = contactrepo.findAll();
		return leads;
	}

	@Override
	public Contact contactlead(long id) {
Optional<Contact> findById = contactrepo.findById(id);
Contact contact = findById.get();
		return contact;
	}

}
