package tn.enis.menbreservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.enis.menbreservice.entity.Membre;

import java.util.List;

public interface MemberRepository extends JpaRepository<Membre , Long> {

    Membre findByCin(String cin);

    List<Membre> findByNom(String nom);

    List<Membre> findByNomStartingWith(String caractere);

    Membre findByEmail(String email);
}
