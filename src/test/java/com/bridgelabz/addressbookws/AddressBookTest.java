package com.bridgelabz.addressbookws;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import model.ContactDetails;
import service.AddressBookMain;

public class AddressBookTest {

	AddressBookMain addressbook = new AddressBookMain();
	List<ContactDetails> personDetails = new ArrayList<>();
	
	@Test
	public void givenContactDetails_shouldReturn_TrueIf_ItIsProper() {
		Assert.assertTrue(personDetails.add(new ContactDetails("Rosy", "Rupali", "btm", "bengaluru", "karnataka", "rosy123@gmail.com", 7837734, 97178637L)));
	}
	
	@Test
	public void givenContactDetails_shouldReturn_FalseIf_ItIsImProper() {
		Assert.assertFalse(personDetails.add(new ContactDetails("Rosy", "Rupali123", "btm", "bengaluru", "karnataka", "rosy123@gmail.com", 78334, 97178637L)));
	}
}
