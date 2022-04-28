package utm.edu.ec.SoftMedical.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalTime;

@Data
@Entity
public class Consult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_patient",nullable = false)
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "id_doctor",nullable = false)
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "id_speciality",nullable = false)
    private Speciality speciality;

    @Column(name = "num_sala",nullable = false)
    private Integer num_sala;

    @Column(name = "fecha",nullable = false)
    private LocalTime date;
}
