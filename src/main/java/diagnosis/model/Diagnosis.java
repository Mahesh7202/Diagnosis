package diagnosis.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;


@Data
@Table
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Diagnosis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long diagnosis_id;

    @Column(name = "diagnosis_date",nullable = false)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    private LocalDate diagnosis_date = LocalDate.now();

    @Column(name = "diagnosis",nullable = false)
    private String diagnosis;

    @Column(name = "summary")
    private String summary;

    @ManyToOne
    private Patient patient;

    public Diagnosis(LocalDate diagnosis_date, String diagnosis, String summary) {
        this.diagnosis_date = diagnosis_date;
        this.diagnosis = diagnosis;
        this.summary= summary;
    }

}
