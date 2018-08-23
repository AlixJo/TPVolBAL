package testspring;

import java.util.Optional;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import sopra.promo404.vol.model.Civilite;
import sopra.promo404.vol.model.Client;
import sopra.promo404.vol.model.Particulier;
import tpVolBAL.repository.IRepoClient;

public class TestSpringClient {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:application-context.xml");

		// Démarrer spring
		IRepoClient repoClient = context.getBean(IRepoClient.class); // Demander le DAO à Spring
		
		Particulier alix = new Particulier("Jo", "0639", "04", "alix.jo", "alix", Civilite.MME);
			
		repoClient.save(alix);


		context.close();
	}



	

}
