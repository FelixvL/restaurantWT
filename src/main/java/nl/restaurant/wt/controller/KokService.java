package nl.restaurant.wt.controller;


import nl.restaurant.wt.domein.Kok;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class KokService {
    @Autowired
    KokRepository kokrepository;


    public Iterable<Kok> allemaal() {
        System.out.println("test in service");
        Iterable<Kok> koks = kokrepository.findAll();
        return koks;
    }

    public Kok opslaan(Kok nieuweKok) {
        System.out.println("Kok opslaan");
        return kokrepository.save(nieuweKok);
    }
}
