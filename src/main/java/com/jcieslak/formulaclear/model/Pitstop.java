package com.jcieslak.formulaclear.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter
@Entity
@Table(name = "pitstops")
public class Pitstop {
    @EmbeddedId
    private PitstopId id;

    @NotNull
    @Column(name = "lap", nullable = false)
    private Integer lap;

    @NotNull
    @Column(name = "time", nullable = false)
    private LocalTime time;

    @Size(max = 255)
    @Column(name = "duration")
    private String duration;

    @Column(name = "milliseconds")
    private Integer milliseconds;

}