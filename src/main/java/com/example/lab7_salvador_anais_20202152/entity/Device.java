package com.example.lab7_salvador_anais_20202152.entity;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import java.util.Date;
@Entity
@Table(name = "device")
@Getter
@Setter
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DeviceID", nullable = false)
    private Integer id;

    @Size(max = 255)
    @Column(name = "DeviceName")
    private String deviceName;

    @Size(max = 255)
    @Column(name = "DeviceType")
    private String deviceType;

    @Size(max = 255)
    @Column(name = "Model")
    private String model;

    @Size(max = 255)
    @Column(name = "SerialNumber")
    private String serialNumber;

    @ManyToOne
    @JoinColumn(name = "SiteID")
    private Site siteID;

}
