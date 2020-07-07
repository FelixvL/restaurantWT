package nl.restaurant.wt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import nl.restaurant.wt.domein.Ober;

@Service
@Transactional
public class OberService {
	@Autowired
	OberRepository oberRepository;
	
	public void test() {
		Iterable<Ober> obers = oberRepository.findAll();
		for (Ober o: obers) {
			System.out.println("een ober" + o);
		}
		}
}
