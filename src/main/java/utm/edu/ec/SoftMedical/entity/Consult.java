package utm.edu.ec.SoftMedical.entity;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class Consult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_patient",nullable = false, foreignKey = @ForeignKey(name="FK_consulta_paciente"))
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "id_doctor",nullable = false, foreignKey = @ForeignKey(name = "FK_consulta_doctor"))
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "id_speciality",nullable = false, foreignKey = @ForeignKey(name = "FK_consulta_especialidad"))
    private Speciality speciality;

    @Column(name = "num_sala",nullable = false)
    private Integer num_sala;

}