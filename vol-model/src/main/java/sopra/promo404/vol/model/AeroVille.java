package sopra.promo404.vol.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class AeroVille {

	@Id
	@GeneratedValue
	private long id;
	@OneToMany(mappedBy ="ville")
	private Aeroport aeroport;
	@OneToMany(mappedBy = "aeroports")
	private Ville ville;

	public AeroVille() {
		super();
	}

	public AeroVille(long id, Aeroport aeroport, Ville ville) {
		super();
		this.id = id;
		this.aeroport = aeroport;
		this.ville = ville;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Aeroport getAeroport() {
		return aeroport;
	}

	public void setAeroport(Aeroport aeroport) {
		this.aeroport = aeroport;
	}

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}

}
