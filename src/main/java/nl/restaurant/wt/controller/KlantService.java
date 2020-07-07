package nl.restaurant.wt.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import nl.restaurant.wt.domein.Klant;

@Service
@Transactional
public class KlantService {
	@Autowired
	KlantRepository klantrepository;
	
	public Iterable<Klant> test() {
		System.out.println("test in service"); 
		Iterable<Klant> klanten = klantrepository.findAll(); 
		return klanten;
	}

}

