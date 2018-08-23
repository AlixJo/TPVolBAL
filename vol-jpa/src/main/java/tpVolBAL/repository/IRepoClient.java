package tpVolBAL.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sopra.promo404.vol.model.Client;

public interface IRepoClient extends JpaRepository<Client, Long>{

}
