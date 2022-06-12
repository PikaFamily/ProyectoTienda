package com.bl.bootcamp.cuenta.api.v1_0.cuenta.dto;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class Cuenta {

    @NotNull(message = "El identificador no debe estar vacío")
    private Integer idCuenta;
    @NotNull(message = "El identificador no debe estar vacío")
    private Integer dineroCuenta;
}
