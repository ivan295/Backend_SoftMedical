package utm.edu.ec.SoftMedical.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "nombre",nullable = false,length = 70)
    private String name;

    @Column(name = "lastname",nullable = false,length = 70)
    private  String lastname;

    @Column(name = "cedula",nullable = false,length = 10)
    private String dni;

    @Column(name = "cmp",nullable = false,length = 10,unique = true)
    private String cmp;
}