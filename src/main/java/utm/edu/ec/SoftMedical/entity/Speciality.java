package utm.edu.ec.SoftMedical.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Speciality {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "descripcion",nullable = false,length = 70)
    private String description;
}
