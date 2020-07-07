package nl.restaurant.wt.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import nl.restaurant.wt.domein.Tafel;

@RestController
public class TafelEndpoint {

	
	@GetMapping("/tafel")
	public void uitproberen() {
		System.out.println("Hoe doet het");
	}
	
	@GetMapping("/tafel2")
	public Tafel uitproberen2() {
		System.out.println("Hoe doet 2 functie");
		return new Tafel();
	}
}
