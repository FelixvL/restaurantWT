package nl.restaurant.wt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import nl.restaurant.wt.domein.Tafel;

@Service
@Transactional
public class TafelService {
	@Autowired
	TafelRepository tafelrepository;
	
	
	public Iterable<Tafel> test() {
		System.out.println("test in service");
		Iterable<Tafel> tafels = tafelrepository.findAll();
		return tafels;
	}
}
