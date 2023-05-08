package diagnosis.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Data
@Table
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Patient {

    private Object GenerationType;
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private long patient_id;

    @Column(name = "first_name")
    private String firstname;
    @Column(name = "last_name")
    private String lastname;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "patient_id")
    private List<Diagnosis> diagnosis = new ArrayList<>();

    public Patient(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Patient(String firstname, String lastname, List<Diagnosis> diagnosis1) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.diagnosis = diagnosis1;
    }

    public void saveDiagnosis(Diagnosis diagnosis1) {
        diagnosis.add(diagnosis1);
    }

    public void deleteDiagnosis(Diagnosis diagnosis1) {
        diagnosis.remove(diagnosis1);
    }
}