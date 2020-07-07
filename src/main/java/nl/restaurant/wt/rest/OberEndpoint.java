package nl.restaurant.wt.rest;

import java.util.Collections;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import nl.restaurant.wt.controller.OberService;
import nl.restaurant.wt.domein.Ober;

@RestController
public class OberEndpoint {

	@Autowired
	OberService oberservice;
	
	@GetMapping("/alleobers")
	public void uitproberen() {
		oberservice.test();
	}
	
	@GetMapping("/ober2")
	public Ober uitproberen2() {
		System.out.println("Ober: Hij doet 2 functie");
		Ober ober = new Ober();
		ober.setObernaam("ooooober");
		return ober;
	}
	
	@GetMapping("/oberober")
	public String testing() {
		Random r = new Random();
		int num = r.nextInt(800);
		String str = "<b><i>OBER</i></b>";
		String content = String.join(" ", Collections.nCopies(num, str));
		return "Ik zie alleen maar <a href='https://youtu.be/hnq8-2-NikU?t=76' target='_blank'><strike>tafels </strike>OBERS </a><br><br>"
				+ content;
	}
}
