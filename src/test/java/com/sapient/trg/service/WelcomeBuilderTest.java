package com.sapient.trg.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;


class MessageBuilderTest {

	@Test
	void testGetMessageForValidName() {
		WelcomeBuilder messageBuilder= new WelcomeBuilder();
		assertEquals("Hello Srini",messageBuilder.getMessage("Srini"));
	}
	
	@Test
	void testGetMessageForInValidName() {
		WelcomeBuilder messageBuilder= new WelcomeBuilder();
		assertNotEquals("Hello Admin",messageBuilder.getMessage("Srini"));
	}
	
	@Test
	void testGetMessageForNull() {
		WelcomeBuilder messageBuilder= new WelcomeBuilder();
		assertEquals("Please provide a name!",messageBuilder.getMessage(null));
	}

}


