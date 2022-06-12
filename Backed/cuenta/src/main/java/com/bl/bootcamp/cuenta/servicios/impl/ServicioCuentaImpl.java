package com.bl.bootcamp.cuenta.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bl.bootcamp.cuenta.api.v1_0.cuenta.conversor.CuentaConversor;
import com.bl.bootcamp.cuenta.api.v1_0.cuenta.dto.Cuenta;
import com.bl.bootcamp.cuenta.persistencia.RepositorioCuenta;
import com.bl.bootcamp.cuenta.servicios.ServicioCuenta;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ServicioCuentaImpl implements ServicioCuenta {

    private final RepositorioCuenta repositorio;

    private final CuentaConversor conversor;

    @Autowired
    public ServicioCuentaImpl(RepositorioCuenta repositorio, CuentaConversor conversor) {
        super();
        this.repositorio = repositorio;
        this.conversor = conversor;
    }

    public Cuenta obtenerCuenta(Integer idCuenta) {
        return conversor.aDto(this.repositorio.obtenerCuenta(idCuenta));
    }

    @Override
    public int crearCuenta(Cuenta cuenta) {
        return this.repositorio.crearCuenta(conversor.aModelo(cuenta));
    }

    @Override
    public int editarCuenta(Cuenta cuenta) {
        return this.repositorio.editarCuenta(conversor.aModelo(cuenta));
    }

    @Override
    public int borrarCuenta(Integer id) {
        return this.repositorio.borrarCuenta(id);
    }

}
