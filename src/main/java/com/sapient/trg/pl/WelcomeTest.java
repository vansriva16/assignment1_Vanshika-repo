package com.sapient.trg.pl;

import com.sapient.trg.service.WelcomeBuilder;

public class WelcomeTest {

	public static void main(String[] args) {
   WelcomeBuilder messageBuilder = new WelcomeBuilder();
		
		System.out.println(messageBuilder.getMessage(null));
		System.out.println(messageBuilder.getMessage("Vanshika"));

	}

}
