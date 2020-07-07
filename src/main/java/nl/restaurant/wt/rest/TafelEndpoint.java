package nl.restaurant.wt.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nl.restaurant.wt.controller.TafelService;
import nl.restaurant.wt.domein.Tafel;

@RestController
public class TafelEndpoint {

	@Autowired
	TafelService tafelservice;
	
	@PostMapping("voegtafeltoe")
	public void voegTToe(@RequestBody Tafel tafel) {
		tafelservice.voerEenTafelToe(tafel);
	}
	
	
	
	@GetMapping("/tafel/{tafelnr}")
	public void uitproberen4(@PathVariable String tafelnr) {
		System.out.println("Met padvar: "+ tafelnr);
		tafelservice.metPathVar(tafelnr);
		
	}
	
	
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
