package nl.restaurant.wt.domein;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Kok {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String naam;

    public Kok(String naam) {
        this.naam = naam;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
}
