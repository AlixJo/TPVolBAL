package sopra.promo404.vol.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="compagnieaeriennevol")
public class CompagnieAerienneVol {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="compagnieaeriennevol_id")
	private Long id;
	@Version
	private int version;
	private String numero;
	@ManyToOne
	@JoinColumn(name="compaervol_compagnieaerienne_id")
	private CompagnieAerienne compagnieAerienne;
	@ManyToOne
	@JoinColumn(name="compaervol_vol_id")
	private Vol vol;

	public CompagnieAerienneVol() {
	}

	public CompagnieAerienneVol(String numero, CompagnieAerienne compagnieAerienne, Vol vol) {
		super();
		this.numero = numero;
		this.compagnieAerienne = compagnieAerienne;
		this.vol = vol;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CompagnieAerienne getCompagnieAerienne() {
		return compagnieAerienne;
	}

	public void setCompagnieAerienne(CompagnieAerienne compagnieAerienne) {
		this.compagnieAerienne = compagnieAerienne;
	}

	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

}
