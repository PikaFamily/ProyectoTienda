package com.bl.bootcamp.cuenta.api.v1_0.cuenta.conversor;

import com.bl.bootcamp.cuenta.api.v1_0.cuenta.dto.Cuenta;
import com.bl.bootcamp.cuenta.persistencia.modelo.CuentaBean;

import org.springframework.stereotype.Component;

@Component
public class CuentaConversor {

    public CuentaBean aModelo(Cuenta dto) {
        return new CuentaBean(dto.getIdCuenta(), dto.getDineroCuenta());
    }

    public Cuenta aDto(CuentaBean dto) {
        Cuenta cuenta = new Cuenta();
        cuenta.setIdCuenta(dto.getIdcuenta());
        cuenta.setDineroCuenta(dto.getDineroCuenta());
        return cuenta;
    }
}
