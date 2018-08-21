package testdao;

import java.text.ParseException;


import sopra.promo404.vol.model.Civilite;
import sopra.promo404.vol.model.Client;
import sopra.promo404.vol.model.Particulier;
import tpVolBAL.dao.IdaoClient;
import tpVolBAL.daoJPA.DaoClient;


public class TestDaoClient {

	public static void main(String[] args) {
		
		IdaoClient daoClient = new DaoClient();
		
		Particulier C1 = new Particulier("Jaquet", "0553784678", "0845231989", "albancastagne@hotmail.fr", "Jean", Civilite.MR);
	
		daoClient.save(C1); 

//		Client C2 = daoClient.findById(2L);
//
//		daoClient.delete(C2);
	}

}
