package nl.restaurant.wt.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nl.restaurant.wt.controller.OberService;
import nl.restaurant.wt.domein.Ober;

@RestController
public class OberEndpoint {

	@Autowired
	OberService oberService;
	
	@GetMapping("/alleobers")
	public Iterable<Ober> uitproberenalleobers() {
		return oberService.getAlleObers();
	}
	
	@GetMapping("/ober")
	public void uitproberen() {
		System.out.println("Ober doet het");
	}
	
	@GetMapping("/ober2")
	public Ober uitproberen2() {
		System.out.println("Ober: Hij doet 2 functie");
		Ober ober = new Ober();
		ober.setObernaam("ooooober");
		return ober;
	}
	
	@PostMapping(path = "/obertoevoegen", consumes = "application/json", produces = "text/plain")
	public String oberToevoegen(@RequestBody Ober ober) {
		oberService.oberOpslaan(ober);
		return "Ober toegevoegd";
	}
}
