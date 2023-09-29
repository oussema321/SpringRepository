package tn.enis.menbreservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.enis.menbreservice.entity.Etudiant;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant , Long> {

    List<Etudiant>findByDiplome(String diplome);

    List<Etudiant>findByDiplomeOrderByDateInscriptionDesc(String diplome);
}
