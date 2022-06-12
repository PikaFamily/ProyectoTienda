package com.bl.bootcamp.factura.persistencia.mapper;

import java.util.List;

import com.bl.bootcamp.factura.persistencia.modelo.FacturaBean;

public interface FacturaMapper {
    int deleteByPrimaryKey(Integer idfactura);

    int insert(FacturaBean record);

    int insertSelective(FacturaBean record);

    FacturaBean selectByPrimaryKey(Integer idfactura);

    int updateByPrimaryKeySelective(FacturaBean record);

    int updateByPrimaryKey(FacturaBean record);

    List<FacturaBean> selectByExample(FacturaBean example);

}