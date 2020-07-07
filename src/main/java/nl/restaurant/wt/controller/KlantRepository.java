package nl.restaurant.wt.controller;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import nl.restaurant.wt.domein.Klant;

@Component
public interface KlantRepository extends CrudRepository<Klant, Long>{

}
