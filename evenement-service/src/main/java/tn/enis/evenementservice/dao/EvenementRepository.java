package tn.enis.evenementservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.enis.evenementservice.entity.Evenement;

import java.util.Date;
import java.util.List;

public interface EvenementRepository extends JpaRepository<Evenement, Long> {

    Evenement findByTitle(String title);
    Evenement findByDate(Date date);
    Evenement findByLieu(String lieu);

    List<Evenement> findAllByTitle(String title);
    List<Evenement> findAllByDate(Date date);
}
