package nl.restaurant.wt.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import nl.restaurant.wt.domein.Tafel;

@Component
public interface TafelRepository extends CrudRepository<Tafel, Long>{

}
