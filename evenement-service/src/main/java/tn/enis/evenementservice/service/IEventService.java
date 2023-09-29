package tn.enis.evenementservice.service;

import tn.enis.evenementservice.entity.Evenement;

import java.util.Date;
import java.util.List;

public interface IEventService {

    //Crud sur les evenements

    public Evenement addEvenement(Evenement m);

    public void deleteEvenement(Long id) ;

    public Evenement updateEvenement(Evenement p) ;

    public Evenement findEvenement(Long id) ;

    public List<Evenement> findAll();

    //Filtrage par propriété

    public Evenement findByTitle(String title);

    public Evenement findByLieu(String lieu);

    public Evenement findByDate(Date date);

    public List<Evenement> findAllByDate(Date date);

    public List<Evenement> findAllByTitle(String title);



}
