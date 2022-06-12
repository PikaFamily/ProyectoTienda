package com.bl.bootcamp.articulo.persistencia.dao;

import java.util.List;

import com.bl.bootcamp.articulo.persistencia.RepositorioArticulo;
import com.bl.bootcamp.articulo.persistencia.mapper.ArticuloMapper;
import com.bl.bootcamp.articulo.persistencia.modelo.ArticuloBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class RepositorioArticuloImpl implements RepositorioArticulo {

    private final ArticuloMapper mapper;

    @Autowired
    public RepositorioArticuloImpl(ArticuloMapper mapper) {
        super();
        this.mapper = mapper;
    }

    @Override
    public List<ArticuloBean> listarArticulo() {
        return null;
    }

    @Override
    public ArticuloBean obtenerArticulo(Integer idarticulo) {
        return this.mapper.selectByPrimaryKey(idarticulo);
    }

    @Override
    public Integer crearArticulo(ArticuloBean articulo) {
        return this.mapper.insert(articulo);

    }

    @Override
    public Integer editarArticulo(ArticuloBean articulo) {
        return this.mapper.updateByPrimaryKeySelective(articulo);

    }

    @Override
    public Integer borrarArticulo(Integer idarticulo) {
        return this.mapper.deleteByPrimaryKey(idarticulo);

    }
}
