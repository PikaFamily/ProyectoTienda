package com.bl.bootcamp.inventario.api.v1_0.inventario.dto;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class Inventario {

    @NotNull(message = "El identificador no debe estar vacío")
    private Integer idinventario;
    @NotNull(message = "El identificador no debe estar vacío")
    private Integer stockarticulo;
}
