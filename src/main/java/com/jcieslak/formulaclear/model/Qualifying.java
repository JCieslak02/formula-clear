package com.jcieslak.formulaclear.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "qualifying")
public class Qualifying {
    @Id
    @Column(name = "qualify_id", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "race_id", nullable = false)
    private Race race;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "driver_id", nullable = false)
    private Driver driver;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "constructor_id", nullable = false)
    private Constructor constructor;

    @NotNull
    @Column(name = "number", nullable = false)
    private Integer number;

    @Column(name = "position")
    private Integer position;

    @Size(max = 255)
    @Column(name = "q1")
    private String q1;

    @Size(max = 255)
    @Column(name = "q2")
    private String q2;

    @Size(max = 255)
    @Column(name = "q3")
    private String q3;

}