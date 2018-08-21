package sopra.promo404.vol.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="AEROPORT")
public class Aeroport {

	@Id
	@GeneratedValue
	private Long id;
	private String code;
	@ManyToOne
	@JoinColumn(name= "Aeroport_ville_id")
	private ArrayList<AeroVille> ville = new ArrayList<>();

	public Aeroport() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public ArrayList<AeroVille> getVille() {
		return ville;
	}

	public void setVille(ArrayList<AeroVille> ville) {
		this.ville = ville;
	}

}
