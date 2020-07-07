package nl.restaurant.wt.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import nl.restaurant.wt.domein.Ober;

@Component
public interface OberRepository extends CrudRepository<Ober, Long>{

}
