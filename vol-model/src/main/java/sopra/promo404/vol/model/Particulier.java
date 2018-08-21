package sopra.promo404.vol.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Version;

@Entity
@DiscriminatorValue("particulier")
public class Particulier extends Client {
	
	@Version
	private int version;
	@Enumerated(EnumType.STRING)
	private Civilite civilite;
	private String prenom;

	public Particulier() {
		super();
	}

	public Civilite getCivilite() {
		return civilite;
	}

	public void setCivilite(Civilite civilite) {
		this.civilite = civilite;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

}
