package com.jcieslak.formulaclear.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "results")
public class Result {
    @Id
    @Column(name = "result_id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "race_id", nullable = false)
    private Integer raceId;

    @NotNull
    @Column(name = "driver_id", nullable = false)
    private Integer driverId;

    @NotNull
    @Column(name = "constructor_id", nullable = false)
    private Integer constructorId;

    @Column(name = "number")
    private Integer number;

    @NotNull
    @Column(name = "grid", nullable = false)
    private Integer grid;

    @Column(name = "position")
    private Integer position;

    @Size(max = 255)
    @NotNull
    @Column(name = "position_text", nullable = false)
    private String positionText;

    @NotNull
    @Column(name = "position_order", nullable = false)
    private Integer positionOrder;

    @NotNull
    @Column(name = "points", nullable = false)
    private Float points;

    @NotNull
    @Column(name = "laps", nullable = false)
    private Integer laps;

    @Size(max = 255)
    @Column(name = "time")
    private String time;

    @Column(name = "milliseconds")
    private Integer milliseconds;

    @Column(name = "fastest_lap")
    private Integer fastestLap;

    @Column(name = "rank")
    private Integer rank;

    @Size(max = 255)
    @Column(name = "fastest_lap_time")
    private String fastestLapTime;

    @Size(max = 255)
    @Column(name = "fastest_lap_speed")
    private String fastestLapSpeed;

    @NotNull
    @Column(name = "status_id", nullable = false)
    private Integer statusId;

}