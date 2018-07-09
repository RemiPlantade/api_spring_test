package api_builder.gen.bean;
// Generated 16 mars 2018 15:14:17 by Hibernate Tools 6.0.0-SNAPSHOT


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Voiture generated by hbm2java
 */
@Entity
@Table(name="voiture"
    , uniqueConstraints = @UniqueConstraint(columnNames="immat") 
)
public class Voiture  implements java.io.Serializable {


     private Integer id;
     private Conducteur conducteur;
     private String marque;
     private String immat;
     private Date datecircul;
     private Set<VoitureRoue> voitureRoues = new HashSet<VoitureRoue>(0);

    public Voiture() {
    }

	
    public Voiture(Conducteur conducteur) {
        this.conducteur = conducteur;
    }
    public Voiture(Conducteur conducteur, String marque, String immat, Date datecircul, Set<VoitureRoue> voitureRoues) {
       this.conducteur = conducteur;
       this.marque = marque;
       this.immat = immat;
       this.datecircul = datecircul;
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

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idconducteur", nullable=false)
    public Conducteur getConducteur() {
        return this.conducteur;
    }
    
    public void setConducteur(Conducteur conducteur) {
        this.conducteur = conducteur;
    }

    
    @Column(name="marque", length=45)
    public String getMarque() {
        return this.marque;
    }
    
    public void setMarque(String marque) {
        this.marque = marque;
    }

    
    @Column(name="immat", unique=true, length=45)
    public String getImmat() {
        return this.immat;
    }
    
    public void setImmat(String immat) {
        this.immat = immat;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="datecircul", length=10)
    public Date getDatecircul() {
        return this.datecircul;
    }
    
    public void setDatecircul(Date datecircul) {
        this.datecircul = datecircul;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="voiture")
    public Set<VoitureRoue> getVoitureRoues() {
        return this.voitureRoues;
    }
    
    public void setVoitureRoues(Set<VoitureRoue> voitureRoues) {
        this.voitureRoues = voitureRoues;
    }




}


