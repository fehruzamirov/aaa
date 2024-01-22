package com.operations.digitalbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DigitalbankApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigitalbankApplication.class, args);

		// find start and end index on sentences.
		String cumle = "Bir iki uc dord";
		String soz = "iki";
		int start = cumle.indexOf(soz)+1;
		int end = start + soz.length()+1;
		System.out.println(start);
		System.out.println(end);
	}

}
