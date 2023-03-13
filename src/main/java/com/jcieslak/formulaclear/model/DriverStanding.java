package com.jcieslak.formulaclear.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "driver_standings")
public class DriverStanding {
    @Id
    @Column(name = "driver_standings_id", nullable = false)
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
    @Column(name = "points", nullable = false)
    private Float points;

    @Column(name = "position")
    private Integer position;

    @Size(max = 255)
    @Column(name = "position_text")
    private String positionText;

    @NotNull
    @Column(name = "wins", nullable = false)
    private Integer wins;

}