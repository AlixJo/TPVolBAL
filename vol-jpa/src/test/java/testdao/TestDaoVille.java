package testdao;

import sopra.promo404.vol.model.Ville;
import tpVolBAL.dao.IDaoVille;
import tpVolBAL.singleton.Application;

public class TestDaoVille {
	
	public static void main(String[] args) {

	IDaoVille daoVille = Application.getInstance().getDaoVille();
	
		
	daoVille.deleteById(15L);
//	Ville villetest = daoVille.findById(15L);
//	
//	daoVille.save(villetest);
	
	
	}
}
