package tpVolBAL.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sopra.promo404.vol.model.Login;


public interface IRepoLogin extends JpaRepository<Login, Long>{

	@Query("select i from Login i where i.identifiant = :identifiant")
	Login findByIdentifiant(@Param("identifiant") String identifiant);
	
	
}
