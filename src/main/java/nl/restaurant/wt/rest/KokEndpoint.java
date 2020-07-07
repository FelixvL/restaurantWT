package nl.restaurant.wt.rest;

import nl.restaurant.wt.controller.KokService;
import nl.restaurant.wt.domein.Kok;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class KokEndpoint {
    @Autowired
    KokService kokService;

    @GetMapping("/koks")
    public Iterable<Kok> allemaal() {
        return kokService.allemaal();
    }

    @PostMapping("/koks")
    public Kok nieuweKok(@RequestBody Kok nieuweKok) {
        return kokService.opslaan(nieuweKok);
    }

    @GetMapping("/koks/{id}")
    Kok een(@PathVariable Long id) {
        System.out.println("Test twee met id");
       return new Kok("Test naam " + id);
    }
}
