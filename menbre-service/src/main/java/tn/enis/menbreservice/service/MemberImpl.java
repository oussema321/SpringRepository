package tn.enis.menbreservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.enis.menbreservice.dao.EnseignantChercheurRepository;
import tn.enis.menbreservice.dao.EtudiantRepository;
import tn.enis.menbreservice.dao.MemberRepository;
import tn.enis.menbreservice.entity.EnseignantChercheur;
import tn.enis.menbreservice.entity.Etudiant;
import tn.enis.menbreservice.entity.Membre;

import java.util.List;

@Service
public class MemberImpl implements IMemberService{

    @Autowired
    MemberRepository memberRepository ;
    @Autowired
    EtudiantRepository etudiantRepository ;
    @Autowired
    EnseignantChercheurRepository enseignantChercheurRepository ;

    @Override
    public Membre addMember(Membre m) {
        memberRepository.save(m);
        return m;
    }

    @Override
    public void deleteMember(Long id) {
        memberRepository.deleteById(id);
    }

    @Override
    public Membre updateMember(Membre p) {
        return memberRepository.saveAndFlush(p);
    }

    @Override
    public Membre findMember(Long id) {
        Membre m= (Membre)memberRepository.findById(id).get();
        return m;
    }

    @Override
    public List<Membre> findAll() {
        return memberRepository.findAll();
    }

    @Override
    public Membre findByCin(String cin) {
        return memberRepository.findByCin(cin);
    }

    @Override
    public Membre findByEmail(String email) {
        return memberRepository.findByEmail(email);
    }

    @Override
    public List<Membre> findByNom(String nom) {
        return memberRepository.findByNom(nom);
    }

    @Override
    public List<Etudiant> findByDiplome(String diplome) {
        return etudiantRepository.findByDiplome(diplome);
    }

    @Override
    public List<EnseignantChercheur> findByGrade(String grade) {
        return enseignantChercheurRepository.findByGrade(grade);
    }

    @Override
    public List<EnseignantChercheur> findByEtablissement(String etablissement) {
        return enseignantChercheurRepository.findByEtablissement(etablissement);
    }
}
