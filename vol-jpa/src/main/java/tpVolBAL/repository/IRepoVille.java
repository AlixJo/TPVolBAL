package tpVolBAL.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import sopra.promo404.vol.model.Ville;

public interface IRepoVille extends JpaRepository <Ville , Long>{

	@Query("select distinct v from Ville v left join fetch v.aeroports a")
	List<Ville> findAllWithAeroport();
	
}
