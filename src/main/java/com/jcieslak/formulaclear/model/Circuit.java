package com.jcieslak.formulaclear.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "circuits")
public class Circuit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "circuit_id", nullable = false)
    private Integer id;

    @Size(max = 255)
    @NotNull
    @Column(name = "circuit_ref", nullable = false)
    private String circuitRef;

    @Size(max = 255)
    @NotNull
    @Column(name = "name", nullable = false)
    private String name;

    @Size(max = 255)
    @Column(name = "location")
    private String location;

    @Size(max = 255)
    @Column(name = "country")
    private String country;

    @Column(name = "lat")
    private Float lat;

    @Column(name = "lng")
    private Float lng;

    @Column(name = "alt")
    private Integer alt;

    @Size(max = 255)
    @NotNull
    @Column(name = "url", nullable = false)
    private String url;

    @Size(max = 40)
    @Column(name = "circuit_type", length = 40)
    private String circuitType;

    @Column(name = "avg_wet_finishers")
    private Double avgWetFinishers;

    @Column(name = "avg_dry_finishers")
    private Double avgDryFinishers;

    @Column(name = "avg_finishers")
    private Double avgFinishers;

}