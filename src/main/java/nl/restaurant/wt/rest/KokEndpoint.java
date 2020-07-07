package nl.restaurant.wt.rest;

import nl.restaurant.wt.domein.Kok;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KokEndpoint {

    @GetMapping("/kok")
    void uitproberen() {
        System.out.println("Een testje of het werkt.");
    }

    @GetMapping("/kok/{id}")
    Kok een(@PathVariable Long id) {
        System.out.println("Test twee met id");
       return new Kok("Test naam " + id);
    }
}
