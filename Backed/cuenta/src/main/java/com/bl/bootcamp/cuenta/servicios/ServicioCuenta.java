package com.bl.bootcamp.cuenta.servicios;

import com.bl.bootcamp.cuenta.api.v1_0.cuenta.dto.Cuenta;

public interface ServicioCuenta {
    Cuenta obtenerCuenta(Integer idCuenta);

    int crearCuenta(Cuenta cuenta);

    int editarCuenta(Cuenta cuenta);

    int borrarCuenta(Integer idCuenta);
}
