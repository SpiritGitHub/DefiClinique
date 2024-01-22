package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.temporal.Temporal;

@Entity
public class RendezVous {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private String medecin;

    public RendezVous(Long id, String type, String medecin) {
        this.id = id;
        this.type = type;
        this.medecin = medecin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMedecin() {
        return medecin;
    }

    public void setMedecin(String medecin) {
        this.medecin = medecin;
    }

    @Override
    public String toString() {
        return "RendezVous{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", medecin='" + medecin + '\'' +
                '}';
    }

    public Temporal getDate() {
        return null;
    }

    public Temporal getCreatedAt() {
        return null;
    }
}
