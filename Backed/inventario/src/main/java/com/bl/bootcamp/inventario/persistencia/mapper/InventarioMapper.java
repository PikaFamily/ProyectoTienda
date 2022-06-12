package com.bl.bootcamp.inventario.persistencia.mapper;

import com.bl.bootcamp.inventario.persistencia.modelo.InventarioBean;

public interface InventarioMapper {
    int deleteByPrimaryKey(Integer idinventario);

    int insert(InventarioBean record);

    int insertSelective(InventarioBean record);

    InventarioBean selectByPrimaryKey(Integer idinventario);

    int updateByPrimaryKeySelective(InventarioBean record);

    int updateByPrimaryKey(InventarioBean record);
}