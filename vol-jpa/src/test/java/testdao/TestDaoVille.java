package testdao;

import sopra.promo404.vol.model.AeroVille;
import sopra.promo404.vol.model.Ville;
import tpVolBAL.dao.IDaoAeroVille;
import tpVolBAL.dao.IDaoAeroport;
import tpVolBAL.dao.IDaoVille;
import tpVolBAL.dao.IDaoVol;
import tpVolBAL.singleton.Application;

public class TestDaoVille {

	public static void main(String[] args) {

		IDaoVille daoVille = Application.getInstance().getDaoVille();
		IDaoAeroport daoAeroport = Application.getInstance().getDaoAeroport();
		IDaoVol daoVol = Application.getInstance().getDaoVol();
		IDaoAeroVille daoAeroVille = Application.getInstance().getDaoAeroVille();

		Ville bordeaux = new Ville("Bordeaux", "33300");
		daoVille.save(bordeaux);
		
		Ville eysines = new Ville("Eysines", "33320");
		daoVille.save(eysines);
		
		AeroVille aeroville1 = new AeroVille();
		daoAeroVille.save(aeroville1);
	}
}
