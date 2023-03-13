package com.jcieslak.formulaclear.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "constructor_results")
public class ConstructorResult {
    @Id
    @Column(name = "constructor_results_id", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "race_id", nullable = false)
    private Race race;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "constructor_id", nullable = false)
    private Constructor constructor;

    @Column(name = "points")
    private Float points;

    @Size(max = 255)
    @Column(name = "status")
    private String status;

}