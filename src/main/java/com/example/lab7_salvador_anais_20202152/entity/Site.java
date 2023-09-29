package com.example.lab7_salvador_anais_20202152.entity;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;
@Entity
@Table(name = "site")
@Getter
@Setter
public class Site {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SiteID", nullable = false)
    private Integer id;

    @Size(max = 255)
    @Column(name = "SiteName")
    private String siteName;

    @ManyToOne
    @JoinColumn(name = "LocationID")
    private Location locationID;

    @Column(name = "InstallationDate")
    private LocalDate installationDate;

    @Size(max = 45)
    @Column(name = "Latitude", length = 45)
    private String latitude;

    @Size(max = 45)
    @Column(name = "Longitude", length = 45)
    private String longitude;

}
