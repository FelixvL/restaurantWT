package nl.restaurant.wt.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import nl.restaurant.wt.domein.Kok;

@Component
public interface KokRepository extends CrudRepository<Kok, Long>{

}
