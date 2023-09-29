package tn.enis.publicationservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.annotations.NotFound;

import java.io.Serializable;
import java.util.Date;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Publication implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @NonNull
    private String type ;

    @NonNull
    private String titre ;

    @NonNull
    private String lien ;

    @NonNull
    private Date date ;

    @NonNull
    private String Sourcepdf ;
}
