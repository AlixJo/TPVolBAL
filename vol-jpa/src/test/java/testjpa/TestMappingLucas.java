package testjpa;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestMappingLucas {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("volpersist");

		emf.close();
	}
}
