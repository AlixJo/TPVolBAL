package tpVolBAL.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import sopra.promo404.vol.model.Ville;

public interface IRepoVille extends JpaRepository <Ville , Long>{

	@Query("select v from Ville v")
	List<Ville> findAllVille();
	
}
