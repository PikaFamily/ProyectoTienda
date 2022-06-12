package com.bl.bootcamp.cuenta.persistencia.dao;

import java.util.List;

import com.bl.bootcamp.cuenta.persistencia.RepositorioCuenta;
import com.bl.bootcamp.cuenta.persistencia.mapper.CuentaMapper;
import com.bl.bootcamp.cuenta.persistencia.modelo.CuentaBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class RepositorioCuentaImpl implements RepositorioCuenta {

    private final CuentaMapper mapper;

    @Autowired
    public RepositorioCuentaImpl(CuentaMapper mapper) {
        super();
        this.mapper = mapper;
    }

    @Override
    public List<CuentaBean> listarCuenta() {
        return null;
    }

    @Override
    public CuentaBean obtenerCuenta(Integer idCuenta) {
        return this.mapper.selectByPrimaryKey(idCuenta);
    }

    @Override
    public Integer crearCuenta(CuentaBean cuenta) {
        return this.mapper.insert(cuenta);
    }

    @Override
    public Integer editarCuenta(CuentaBean cuenta) {
        return this.mapper.updateByPrimaryKeySelective(cuenta);
    }

    @Override
    public Integer borrarCuenta(Integer id) {
        return this.mapper.deleteByPrimaryKey(id);
    }

}
