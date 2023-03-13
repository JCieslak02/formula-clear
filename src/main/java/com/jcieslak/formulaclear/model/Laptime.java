package com.jcieslak.formulaclear.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "laptimes")
public class Laptime {
    @EmbeddedId
    private LaptimeId id;

    @Column(name = "position")
    private Integer position;

    @Size(max = 255)
    @Column(name = "time")
    private String time;

    @Column(name = "milliseconds")
    private Integer milliseconds;

}