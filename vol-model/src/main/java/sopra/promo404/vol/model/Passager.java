package sopra.promo404.vol.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name= "passager")
public class Passager {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name= "passager_id")
	private Long id;
	@Version
	private int version;
	private String nom;
	private String prenom;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dtNaissance;
	private String pieceIdentite;
	@Embedded
	private Adresse adresse;
	@OneToOne(mappedBy="passager")
	private Reservation reservation;

	public Passager() {
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

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDtNaissance() {
		return dtNaissance;
	}

	public void setDtNaissance(Date dtNaissance) {
		this.dtNaissance = dtNaissance;
	}

	public String getPieceIdentite() {
		return pieceIdentite;
	}

	public void setPieceIdentite(String pieceIdentite) {
		this.pieceIdentite = pieceIdentite;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public Passager(String nom, String prenom, Date dtNaissance, String pieceIdentite) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dtNaissance = dtNaissance;
		this.pieceIdentite = pieceIdentite;
	}

	public Passager(String nom, String prenom, Date dtNaissance, String pieceIdentite, Adresse adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dtNaissance = dtNaissance;
		this.pieceIdentite = pieceIdentite;
		this.adresse = adresse;
	}

	

}
