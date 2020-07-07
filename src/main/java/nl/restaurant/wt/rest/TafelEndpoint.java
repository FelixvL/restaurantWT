package nl.restaurant.wt.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import nl.restaurant.wt.controller.TafelService;
import nl.restaurant.wt.domein.Tafel;

@RestController
public class TafelEndpoint {

	@Autowired
	TafelService tafelservice;
	
	@GetMapping("/alletafel")
	public Iterable<Tafel> uitproberenalle() {
		return tafelservice.test();
	}
	
	@GetMapping("/tafel")
	public void uitproberen() {
		System.out.println("Hoe doet het");
	}
	
	@GetMapping("/tafel2")
	public Tafel uitproberen2() {
		System.out.println("Hoe doet 2 functie");
		Tafel tafel = new Tafel();
		tafel.setTafelnummer("AB12");
		return tafel;
	}
	
}
