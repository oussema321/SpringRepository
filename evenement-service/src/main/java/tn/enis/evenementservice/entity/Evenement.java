package tn.enis.evenementservice.entity;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.NotFound;

import java.io.Serializable;
import java.util.Date;

@Entity
@Getter @Setter

@AllArgsConstructor
@RequiredArgsConstructor

public class Evenement implements Serializable {

    @Builder
    public Evenement(String title, Date date, String lieu) {
        this.title = title;
        this.date = date;
        this.lieu = lieu;
    }
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String title ;

    @NotNull @Temporal(TemporalType.DATE )
    private Date date ;

    @NotNull
    private String lieu ;

}
