package sopra.promo404.vol.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Version;

@Entity
@DiscriminatorValue("societe")
public class Societe extends Client {
	
	@Enumerated(EnumType.STRING)
	private FormeJuridique formeJuridique;
	private String siret;

	
	public Societe(String nom, String numeroTel, String numeroFax, String email, String siret, FormeJuridique formeJuridique) {
		super(nom, numeroTel, numeroFax, email);
		
		this.siret = siret;
		this.formeJuridique = formeJuridique;

	}
	public Societe() {
	}

	public FormeJuridique getFormeJuridique() {
		return formeJuridique;
	}

	public void setFormeJuridique(FormeJuridique formeJuridique) {
		this.formeJuridique = formeJuridique;
	}

	public String getSiret() {
		return siret;
	}

	public void setSiret(String siret) {
		this.siret = siret;
	}

}
