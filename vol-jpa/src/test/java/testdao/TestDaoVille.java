package testdao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import sopra.promo404.vol.model.AeroVille;
import sopra.promo404.vol.model.Aeroport;
import sopra.promo404.vol.model.Escale;
import sopra.promo404.vol.model.Ville;
import sopra.promo404.vol.model.Vol;
import tpVolBAL.repository.IRepoVille;
import tpVolBAL.repository.IRepoVol;
import tpVolBAL.repository.IRepoAeroVille;
import tpVolBAL.repository.IRepoAeroport;
import tpVolBAL.repository.IRepoEscale;
import tpVolBAL.singleton.Application;

public class TestDaoVille {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		IRepoVille daoVille = Application.getInstance().getDaoVille();
		IRepoAeroport daoAeroport = Application.getInstance().getDaoAeroport();
		IRepoVol daoVol = Application.getInstance().getDaoVol();
		IRepoAeroVille daoAeroVille = Application.getInstance().getDaoAeroVille();
		IRepoEscale daoEscale = Application.getInstance().getDaoEscale();

		Ville ruminghem = new Ville("Ruminghem", "62370");
		daoVille.save(ruminghem);
		
		Ville eysines = new Ville("Eysines", "33320");
		daoVille.save(eysines);
		
		Ville merignac = new Ville("Merignac", "33370");
		daoVille.save(merignac);
		
		Ville roissyEnFrance = new Ville("Roissy-En-France", "95700");
		daoVille.save(roissyEnFrance);
		
		AeroVille aeroVille1 = new AeroVille();
		aeroVille1.setVille(eysines);
		
		Aeroport aeroMerignac = new Aeroport("BOD");
		daoAeroport.save(aeroMerignac);
		aeroVille1.setAeroport(aeroMerignac);
		
		daoAeroVille.save(aeroVille1);
		
		Aeroport aeroParis = new Aeroport("CDG");
		daoAeroport.save(aeroParis);
		
		AeroVille aeroVille2 = new AeroVille();
		aeroVille2.setAeroport(aeroParis);
		aeroVille2.setVille(roissyEnFrance);
		
		daoAeroVille.save(aeroVille2);
		
		Vol vol1 = new Vol(sdf.parse("16/07/2018"),sdf.parse("17/07/2018"), 250, true);
		vol1.setDepart(aeroParis);
		vol1.setArrivee(aeroMerignac);
		daoVol.save(vol1);
		
		Escale escale1 = new Escale();
		escale1.sethDepart(sdf.parse("03/09/1993"));
		escale1.sethArrivee(sdf.parse("12/02/2019"));
		escale1.setAeroport(aeroParis);
		escale1.setVol(vol1);
		daoEscale.save(escale1);
	}
}
