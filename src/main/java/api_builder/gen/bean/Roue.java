package api_builder.gen.bean;
// Generated 16 mars 2018 15:14:17 by Hibernate Tools 6.0.0-SNAPSHOT


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Roue generated by hbm2java
 */
@Entity
@Table(name="roue"
)
public class Roue  implements java.io.Serializable {


     private Integer id;
     private Long rayon;
     private Double largeur;
     private Set<VoitureRoue> voitureRoues = new HashSet<VoitureRoue>(0);

    public Roue() {
    }

    public Roue(Long rayon, Double largeur, Set<VoitureRoue> voitureRoues) {
       this.rayon = rayon;
       this.largeur = largeur;
       this.voitureRoues = voitureRoues;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="rayon", precision=10, scale=0)
    public Long getRayon() {
        return this.rayon;
    }
    
    public void setRayon(Long rayon) {
        this.rayon = rayon;
    }

    
    @Column(name="largeur", precision=22, scale=0)
    public Double getLargeur() {
        return this.largeur;
    }
    
    public void setLargeur(Double largeur) {
        this.largeur = largeur;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="roue")
    public Set<VoitureRoue> getVoitureRoues() {
        return this.voitureRoues;
    }
    
    public void setVoitureRoues(Set<VoitureRoue> voitureRoues) {
        this.voitureRoues = voitureRoues;
    }




}

