package tpVolBAL.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sopra.promo404.vol.model.Reservation;

public interface IRepoReservation extends JpaRepository<Reservation, Long> {

}
