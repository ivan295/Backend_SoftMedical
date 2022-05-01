package utm.edu.ec.SoftMedical.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="nombre", nullable = false, length = 70)
    private String name;

    @Column(name="apellido", nullable = false, length = 70)
    private String lastname;

    @Column(name="cedula", nullable = false, length = 10)
    private String dni;

    @Column(name="direccion", nullable = true, length = 150)
    private  String address;

    @Column(name = "telefono", nullable = true, length = 10)
    private String phone;

    @Column(name="edad", nullable = false)
    private int age;

    @Column(name = "genero",nullable = false,length = 10)
    private String gender;
}

