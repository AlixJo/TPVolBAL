package tpVolBAL.singleton;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import tpVolBAL.dao.IDaoAeroport;
import tpVolBAL.dao.IDaoVille;
import tpVolBAL.dao.IDaoVol;
import tpVolBAL.dao.IdaoClient;
import tpVolBAL.dao.IdaoLogin;
import tpVolBAL.daoJPA.DaoAeroport;
import tpVolBAL.daoJPA.DaoClient;
import tpVolBAL.daoJPA.DaoLogin;
import tpVolBAL.daoJPA.DaoVille;
import tpVolBAL.daoJPA.DaoVol;

public class Application {

		private static Application instance = null;

		private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("volpersist");
		private final IDaoVille daoVille = new DaoVille();
		private final IDaoAeroport daoAeroport = new DaoAeroport();
		private final IDaoVol daoVol = new DaoVol();
		private final IdaoLogin daoLogin = new DaoLogin();
		private final IdaoClient daoClient = new DaoClient();

		private Application() {

		}

		public static Application getInstance() {
			if (instance == null) {
				instance = new Application();
			}

			return instance;
		}

		public EntityManagerFactory getEmf() {
			return emf;
		}

		public IDaoVille getDaoVille() {
			return daoVille;
		}

		public IDaoAeroport getDaoAeroport() {
			return daoAeroport;
		}

		public IDaoVol getDaoVol() {
			return daoVol;
		}

		public IdaoLogin getDaoLogin() {
			return daoLogin;
		}

		public IdaoClient getDaoClient() {
			return daoClient;
		}
		
		
	}
