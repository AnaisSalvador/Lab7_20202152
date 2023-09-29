package com.example.lab7_salvador_anais_20202152.entity;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import java.util.Date;
@Entity
@Table(name = "technician")
@Getter
@Setter
public class Technician {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TechnicianID", nullable = false)
    private Integer id;

    @Size(min = 3,max =100, message = "Debe de estar dentro del rango de 3 y 100 caracteres")
    @NotNull
    @Column(name = "FirstName", nullable = false, length = 100)
    private String firstName;

    @Size(min = 3,max =100, message = "Debe de estar dentro del rango de 3 y 100 caracteres")
    @NotNull
    @Column(name = "LastName", nullable = false, length = 100)
    private String lastName;


    @Size(min=8 ,max = 8,message = "La cantdad de caracteres debe de ser 8")
    @NotNull
    @Column(name = "Dni", nullable = false, length = 8)
    private String dni;

    @Size(min=9,max = 9,message = "La cantdad de caracteres del telefono debe de ser 9")
    @NotNull
    @Column(name = "Phone", nullable = false, length = 9)
    private String phone;

    @Digits(integer = 1, fraction = 0)
    @Positive
    @NotNull
    @Column(name = "Age", nullable = false)
    private Integer age;

}
