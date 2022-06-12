package com.bl.bootcamp.articulo.persistencia.mapper;

import com.bl.bootcamp.articulo.persistencia.modelo.ArticuloBean;

public interface ArticuloMapper {
    int deleteByPrimaryKey(Integer idarticulo);

    int insert(ArticuloBean record);

    int insertSelective(ArticuloBean record);

    ArticuloBean selectByPrimaryKey(Integer idarticulo);

    int updateByPrimaryKeySelective(ArticuloBean record);

    int updateByPrimaryKey(ArticuloBean record);
}