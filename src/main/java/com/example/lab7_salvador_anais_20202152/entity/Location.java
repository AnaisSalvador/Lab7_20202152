package com.example.lab7_salvador_anais_20202152.entity;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import java.util.Date;
@Entity
@Table(name = "location")
@Getter
@Setter
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LocationID", nullable = false)
    private Integer id;

    @Size(max = 255)
    @Column(name = "City")
    private String city;

    @Size(max = 255)
    @Column(name = "Country")
    private String country;

}
