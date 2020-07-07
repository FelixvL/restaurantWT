package nl.restaurant.wt.domein;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ober {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	String naam;
}
