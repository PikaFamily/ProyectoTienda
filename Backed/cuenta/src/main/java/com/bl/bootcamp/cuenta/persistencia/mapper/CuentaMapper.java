package com.bl.bootcamp.cuenta.persistencia.mapper;

import com.bl.bootcamp.cuenta.persistencia.modelo.CuentaBean;

public interface CuentaMapper {
    int deleteByPrimaryKey(Integer idcuenta);

    int insert(CuentaBean record);

    int insertSelective(CuentaBean record);

    CuentaBean selectByPrimaryKey(Integer idcuenta);

    int updateByPrimaryKeySelective(CuentaBean record);

    int updateByPrimaryKey(CuentaBean record);
}