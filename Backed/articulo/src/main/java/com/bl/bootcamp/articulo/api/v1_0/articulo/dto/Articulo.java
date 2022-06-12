package com.bl.bootcamp.articulo.api.v1_0.articulo.dto;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class Articulo {

    @NotNull(message = "El identificador no debe estar vacío")
    private Integer idarticulo;
    @NotNull(message = "El identificador no debe estar vacío")
    private Integer precio;

    private String descripcion;
}
