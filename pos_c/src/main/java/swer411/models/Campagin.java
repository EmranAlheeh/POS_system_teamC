package swer411.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "campagin")
public class Campagin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
}
