package tpVolBAL.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import sopra.promo404.vol.model.Client;
import sopra.promo404.vol.model.Particulier;

public interface IRepoClient extends JpaRepository<Client, Long>{

	@Query("select p from Particulier p")
	List<Particulier> findAllParticulier();
}
