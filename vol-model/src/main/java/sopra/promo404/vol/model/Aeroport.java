package sopra.promo404.vol.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "AEROPORT")
public class Aeroport {

	@Id
	@GeneratedValue
	@Column(name = "aeroport_id")
	private Long id;
	@Version
	private int version;
	private String code;
	@OneToMany(mappedBy = "aeroport")
	private List<AeroVille> ville = new ArrayList<>();

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

	public List<AeroVille> getVille() {
		return ville;
	}

	public void setVille(List<AeroVille> ville) {
		this.ville = ville;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

}
