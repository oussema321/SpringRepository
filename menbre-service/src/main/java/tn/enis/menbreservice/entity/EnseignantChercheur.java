package tn.enis.menbreservice.entity;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Date;
import java.util.List;

@Entity @DiscriminatorValue("ens")
@Getter
@Setter
@NoArgsConstructor
public class EnseignantChercheur extends Membre {

    @OneToMany(mappedBy = "encadrant")
    private List<Etudiant> etudent;

    @Builder
    public EnseignantChercheur(@NonNull String cin, @NonNull String nom, @NonNull String prenom, @NonNull String email, @NonNull String cv, @NonNull String password, @NonNull Date dateNaissance, List<Etudiant> etudent, String etablissement, String grade) {
        super(cin, nom, prenom, email, cv, password, dateNaissance);
        this.etudent = etudent;
        etablissement = etablissement;
        grade = grade;
    }


    @NotNull
    private String etablissement ;

    @NotNull
    private String grade ;

}
