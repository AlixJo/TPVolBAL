package sopra.promo404.vol.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;
@Entity
@Table (name = "reservation")
public class Reservation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "reservation Id")
	private Long id;
	@Version
	private int version;
	private String code;
	private Date dtResa;
	private Boolean confirmee;
	private Boolean annulee;
	@OneToOne
	@JoinColumn(name= "passager_id")
	private Passager passager;
	@ManyToOne
	@JoinColumn(name="vol_id")
	private Vol vol;
	@ManyToOne
	@JoinColumn(name="client_id")
	private Client client;

	public Reservation() {
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

	public Date getDtResa() {
		return dtResa;
	}

	public void setDtResa(Date dtResa) {
		this.dtResa = dtResa;
	}

	public Boolean getConfirmee() {
		return confirmee;
	}

	public void setConfirmee(Boolean confirmee) {
		this.confirmee = confirmee;
	}

	public Boolean getAnnulee() {
		return annulee;
	}

	public void setAnnulee(Boolean annulee) {
		this.annulee = annulee;
	}

	public Passager getPassager() {
		return passager;
	}

	public void setPassager(Passager passager) {
		this.passager = passager;
	}

	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

}
