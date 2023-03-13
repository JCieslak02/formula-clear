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
@Table(name = "seasons")
public class Season {
    @Id
    @Column(name = "year", nullable = false)
    private Integer id;

    @Size(max = 255)
    @NotNull
    @Column(name = "url", nullable = false)
    private String url;

}