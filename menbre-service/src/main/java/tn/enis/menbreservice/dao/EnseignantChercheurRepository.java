package tn.enis.menbreservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.enis.menbreservice.entity.EnseignantChercheur;

import java.util.List;

public interface EnseignantChercheurRepository extends JpaRepository<EnseignantChercheur , Long> {

    List<EnseignantChercheur> findByGrade(String grade);

    List<EnseignantChercheur>findByEtablissement(String etablissement);
}
