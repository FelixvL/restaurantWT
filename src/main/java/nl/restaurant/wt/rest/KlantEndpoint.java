package nl.restaurant.wt.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import nl.restaurant.wt.controller.KlantService;
import nl.restaurant.wt.domein.Klant;

@RestController
public class KlantEndpoint {

	@Autowired
	KlantService klantservice;
	
	@GetMapping("/alleklanten")
	public Iterable<Klant> uitproberenalle() {
		return klantservice.test();
	}
	
	@GetMapping("/klant")
	public void uitproberen() {
		System.out.println("Hoe doet het");
	}
	
	@GetMapping("/klant2")
	public Klant uitproberen2() {
		System.out.println("Hoe doet 2 functie");
		Klant klant = new Klant();
		klant.setNaam("Hans");
		return klant;
	}
}

