package tpVolBAL.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import sopra.promo404.vol.model.Aeroport;

public interface IRepoAeroport extends JpaRepository<Aeroport, Long> {

	@Query("select a from Aeroport a")
	List<Aeroport> findAllAeroport();
	
	
}
