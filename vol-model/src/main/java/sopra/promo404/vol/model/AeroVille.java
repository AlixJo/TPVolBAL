package sopra.promo404.vol.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity
public class AeroVille {

	@Id
	@GeneratedValue
	@Column(name = "aeroville_id")
	private long id;
	@Version
	private int version;
	@ManyToOne
	@JoinColumn(name = "aeroville_aeroport_id")
	private Aeroport aeroport;
	@ManyToOne
	@JoinColumn(name = "aeroville_ville_id")
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

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

}
