package com.bl.bootcamp.cuenta.persistencia;

import java.util.List;

import com.bl.bootcamp.cuenta.persistencia.modelo.CuentaBean;

public interface RepositorioCuenta {

    List<CuentaBean> listarCuenta();

    CuentaBean obtenerCuenta(Integer id);

    Integer crearCuenta(CuentaBean cuenta);

    Integer editarCuenta(CuentaBean cuenta);

    Integer borrarCuenta(Integer id);
}
