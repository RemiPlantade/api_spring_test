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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import api_builder.gen.jackson.deserializer.ConducteurDeserializer;
import api_builder.gen.jackson.serializer.ConducteurSerializer;

/**
 * Conducteur generated by hbm2java
 */
@Entity
@Table(name="conducteur"
)

//@JsonDeserialize(using = ConducteurDeserializer.class)
//@JsonSerialize(using = ConducteurSerializer.class)
public class Conducteur  implements java.io.Serializable {


     private Integer id;
     private String nom;
     private String prenom;
     private Date age;
     private Set<Voiture> voitures = new HashSet<Voiture>();

    public Conducteur() {}

    public Conducteur(String nom, String prenom, Date age, Set<Voiture> voitures) {
       this.nom = nom;
       this.prenom = prenom;
       this.age = age;
       this.voitures = voitures;
    }
   
    @Id @GeneratedValue(strategy=IDENTITY)
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="nom", length=45)
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }

    
    @Column(name="prenom", length=45)
    public String getPrenom() {
        return this.prenom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="age", length=10)
    public Date getAge() {
        return this.age;
    }
    
    public void setAge(Date age) {
        this.age = age;
    }

    @OneToMany(fetch=FetchType.EAGER, mappedBy="conducteur")
    public Set<Voiture> getVoitures() {
        return this.voitures;
    }
    
    public void setVoitures(Set<Voiture> voitures) {
        this.voitures = voitures;
    }
}


