package testdao;

import java.text.ParseException;

import sopra.promo404.vol.model.Adresse;
import sopra.promo404.vol.model.Civilite;
import sopra.promo404.vol.model.Client;
import sopra.promo404.vol.model.FormeJuridique;
import sopra.promo404.vol.model.Particulier;
import sopra.promo404.vol.model.Societe;
import tpVolBAL.daoJPA.DaoClient;
import tpVolBAL.repository.IRepoClient;


public class TestDaoClient {

	public static void main(String[] args) {
		
		IRepoClient daoClient = new DaoClient();
		
		
		Particulier P1 = new Particulier("Jourdan", "0553784678", "0845231989", "alix-jourdan@hotmail.fr", "Alix", Civilite.MLLE);
		P1.setAdresse(new Adresse("25 rue ausone", "33520", "Bruges", "France"));
		daoClient.save(P1);

		Particulier P2 = new Particulier("Jordano", "0553784678", "0845231989", "alain.jordano@hotmail.fr", "Alain", Civilite.MR);
		P2.setAdresse(new Adresse("11 allée belair", "33185", "Le Haillan", "France"));
		daoClient.save(P2);

		Societe S1 = new Societe("Jurae", "0553784678", "0845231989", "jurae@hotmail.fr", "ALUOP456", FormeJuridique.SAS);
		S1.setAdresse(new Adresse("91 avenue de saint medard", "33300", "Bordeaux", "France"));
		daoClient.save(S1);

		Societe S2 = new Societe("Arno", "0553784678", "0845231989", "alive@hotmail.fr", "AZE789OP", FormeJuridique.SARL);
		S2.setAdresse(new Adresse("102 rue Bourbon", "33300", "Bordeaux", "France"));
		daoClient.save(S2);
		
		Particulier P3 = new Particulier("Jaquet", "0553784678", "0845231989", "albancastagne@hotmail.fr", "Jean", Civilite.MR);
		P3.setAdresse(new Adresse("111 rue Bourbon", "33100", "Pessac", "France"));
		daoClient.save(P3); 

		
		
		Client C2 = daoClient.findById(2L);

		daoClient.delete(C2);
	}

}
