package tn.enis.menbreservice.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity @DiscriminatorValue("etd")
@Getter
@Setter
@NoArgsConstructor
public class Etudiant extends Membre {

    @ManyToOne
    private EnseignantChercheur encadrant;

    @Builder
    public Etudiant(@NonNull String cin, @NonNull String nom, @NonNull String prenom, @NonNull String email, @NonNull String cv, @NonNull String password, @NonNull Date dateNaissance, EnseignantChercheur encadrant, @NonNull String diplome, @NonNull String sujet, @NonNull Date dateInscription) {
        super(cin, nom, prenom, email, cv, password, dateNaissance);
        this.encadrant = encadrant;
        this.diplome = diplome;
        this.sujet = sujet;
        this.dateInscription = dateInscription;
    }



    @NonNull
    private String diplome;

    @NonNull
    private String sujet;

    @NonNull @Temporal(TemporalType.DATE)
    private Date dateInscription;
}
