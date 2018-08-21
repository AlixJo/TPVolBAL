package testdao;

import sopra.promo404.vol.model.Client;
import sopra.promo404.vol.model.Login;
import tpVolBAL.dao.IdaoLogin;
import tpVolBAL.daoJPA.DaoLogin;

public class TestDaoLogin {

	public static void main(String[] args) {
		IdaoLogin daoLogin = new DaoLogin();

		Login L1 = new Login("AL13", "motdepasse1", false);
		daoLogin.save(L1);
		
		Login L2 = new Login("AL14", "motdepasse2", true);
		daoLogin.save(L2);
		
		Login L3 = new Login("AL15", "motdepasse3", false);
		daoLogin.save(L3);
		
		
		Login L4 = daoLogin.findById(11L);

		daoLogin.delete(L4);
	}

}
