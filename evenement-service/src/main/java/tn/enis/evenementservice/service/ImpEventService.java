package tn.enis.evenementservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.enis.evenementservice.dao.EvenementRepository;
import tn.enis.evenementservice.entity.Evenement;

import java.util.Date;
import java.util.List;

@Service
public class ImpEventService implements  IEventService {

    @Autowired
    EvenementRepository evenementRepository ;

    @Override
    public Evenement addEvenement(Evenement m) {
        evenementRepository.save(m);
        return m;
    }

    @Override
    public void deleteEvenement(Long id) {
        evenementRepository.deleteById(id);
    }

    @Override
    public Evenement updateEvenement(Evenement p) {
        evenementRepository.saveAndFlush(p);
        return p;
    }

    @Override
    public Evenement findEvenement(Long id) {
        Evenement e = (Evenement)evenementRepository.findById(id).get();
        return e;
    }

    @Override
    public List<Evenement> findAll() {
        List<Evenement> liste = evenementRepository.findAll();
        return liste ;
    }

    @Override
    public Evenement findByTitle(String title) {
        Evenement e = (Evenement)evenementRepository.findByTitle(title) ;
        return e;
    }

    @Override
    public Evenement findByLieu(String lieu) {
        Evenement e = (Evenement)evenementRepository.findByLieu(lieu) ;
        return e;
    }

    @Override
    public Evenement findByDate(Date date) {
        return evenementRepository.findByDate(date);
    }

    @Override
    public List<Evenement> findAllByDate(Date date) {
        List<Evenement> liste = evenementRepository.findAllByDate(date);
        return liste ;
    }

    @Override
    public List<Evenement> findAllByTitle(String title) {
        return evenementRepository.findAllByTitle(title);
    }
}
