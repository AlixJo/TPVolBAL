package sopra.promo404.vol.model;

import java.util.ArrayList;
import java.util.Date;
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
@Table(name = "vol")
public class Vol {

	@Id
	@GeneratedValue
	@Column(name = "vol_id")
	private Long id;
	@Version
	private int version;
	private Date dtDepart;
	private Date dtArrivee;
	private Integer nbPlace;
	private Boolean ouvert;
	@OneToMany(mappedBy="vol")
	private List<Escale> escales = new ArrayList<>();
	@OneToMany(mappedBy="vol")
	private List<Reservation> reservations = new ArrayList<>();
	@ManyToOne
	@JoinColumn(name="aeroportdt_id")
	private Aeroport depart;
	@ManyToOne
	@JoinColumn(name="aeroportar_id")
	private Aeroport arrivee;
	@OneToMany(mappedBy="vol")
	private List<CompagnieAerienneVol> compagnieAeriennes = new ArrayList<>();

	public Vol() {
	}
	
	public Vol(Date dtDepart, Date dtArrivee, Integer nbPlace, Boolean ouvert) {
		super();
		this.dtDepart = dtDepart;
		this.dtArrivee = dtArrivee;
		this.nbPlace = nbPlace;
		this.ouvert = ouvert;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDtDepart() {
		return dtDepart;
	}

	public void setDtDepart(Date dtDepart) {
		this.dtDepart = dtDepart;
	}

	public Date getDtArrivee() {
		return dtArrivee;
	}

	public void setDtArrivee(Date dtArrivee) {
		this.dtArrivee = dtArrivee;
	}

	public Integer getNbPlace() {
		return nbPlace;
	}

	public void setNbPlace(Integer nbPlace) {
		this.nbPlace = nbPlace;
	}

	public Boolean getOuvert() {
		return ouvert;
	}

	public void setOuvert(Boolean ouvert) {
		this.ouvert = ouvert;
	}

	public List<CompagnieAerienneVol> getCompagnieAeriennes() {
		return compagnieAeriennes;
	}

	public void setCompagnieAeriennes(List<CompagnieAerienneVol> compagnieAeriennes) {
		this.compagnieAeriennes = compagnieAeriennes;
	}

	public List<Escale> getEscales() {
		return escales;
	}

	public void setEscales(List<Escale> escales) {
		this.escales = escales;
	}

	public Aeroport getDepart() {
		return depart;
	}

	public void setDepart(Aeroport depart) {
		this.depart = depart;
	}

	public Aeroport getArrivee() {
		return arrivee;
	}

	public void setArrivee(Aeroport arrivee) {
		this.arrivee = arrivee;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

}
