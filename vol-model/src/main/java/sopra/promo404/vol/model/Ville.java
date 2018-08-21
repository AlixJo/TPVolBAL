package sopra.promo404.vol.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "VILLE")
public class Ville {

	@Id
	@GeneratedValue
	@Column(name = "ville_id")
	private Long id;
	@Version
	private int version;
	private String nom;
	private String codePostal;
	@OneToMany(mappedBy="ville")
	private List<AeroVille> aeroports = new ArrayList<>();

	public Ville() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public List<AeroVille> getAeroports() {
		return aeroports;
	}

	public void setAeroports(List<AeroVille> aeroports) {
		this.aeroports = aeroports;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	

}
