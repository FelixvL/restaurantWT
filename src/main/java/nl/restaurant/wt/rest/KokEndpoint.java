package nl.restaurant.wt.rest;

import nl.restaurant.wt.controller.KokService;
import nl.restaurant.wt.controller.TafelService;
import nl.restaurant.wt.domein.Kok;
import nl.restaurant.wt.domein.Tafel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KokEndpoint {
    @Autowired
    KokService kokService;

    @GetMapping("/koks")
    public Iterable<Kok> allemaal() {
        return kokService.allemaal();
    }

    @GetMapping("/koks/{id}")
    Kok een(@PathVariable Long id) {
        System.out.println("Test twee met id");
       return new Kok("Test naam " + id);
    }
}
