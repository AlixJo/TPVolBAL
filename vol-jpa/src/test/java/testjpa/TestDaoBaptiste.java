package testjpa;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import sopra.promo404.vol.model.Adresse;
import sopra.promo404.vol.model.CompagnieAerienne;
import sopra.promo404.vol.model.CompagnieAerienneVol;
import sopra.promo404.vol.model.Passager;
import sopra.promo404.vol.model.Reservation;
import sopra.promo404.vol.model.Societe;
import sopra.promo404.vol.model.Vol;
import tpVolBAL.daoJPA.DaoClient;
import tpVolBAL.daoJPA.DaoCompagnieAerienne;
import tpVolBAL.daoJPA.DaoCompagnieAerienneVol;
import tpVolBAL.daoJPA.DaoPassager;
import tpVolBAL.daoJPA.DaoReservation;
import tpVolBAL.daoJPA.DaoVol;
import tpVolBAL.repository.IRepoVol;
import tpVolBAL.repository.IRepoClient;
import tpVolBAL.repository.IRepoCompagnieAerienneVol;
import tpVolBAL.repository.IdaoCompagnieAerienne;
import tpVolBAL.repository.IRepoPassager;
import tpVolBAL.repository.IRepoReservation;

public class TestDaoBaptiste {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		IRepoReservation daoreservation = new DaoReservation();
		IRepoPassager daopassager = new DaoPassager();
		IdaoCompagnieAerienne daocompagnieaerienne = new DaoCompagnieAerienne();
		IRepoCompagnieAerienneVol daocompagnieaeriennevol = new DaoCompagnieAerienneVol();
		IRepoVol daovol = new DaoVol();
		IRepoClient daoclient = new DaoClient();
		
		Vol v1 = new Vol();
		daovol.save(v1);

		Societe sopra = new Societe();
		
		daoclient.save(sopra);
		
		
		CompagnieAerienne ca1 = new CompagnieAerienne("1648");
		
		daocompagnieaerienne.save(ca1);
		
		CompagnieAerienneVol cav1 = new CompagnieAerienneVol();
		
		daocompagnieaeriennevol.save(cav1);
		
		
		Adresse ad1 = new Adresse("rue Ausone", "33520", "Bruges","France");
		
		Passager p1 = new Passager("Laleouse", "Baptiste", sdf.parse("29/12/2018"), "djhfiz", ad1 );
		
		daopassager.save(p1);
		
		Reservation r1 = new Reservation("zefzefz", sdf.parse("28/12/2018"), true, false, p1, v1, sopra);
		
		daoreservation.save(r1);
		
		
		
	}

}
