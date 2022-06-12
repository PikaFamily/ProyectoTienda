package com.bl.bootcamp.articulo.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bl.bootcamp.articulo.api.v1_0.articulo.conversor.ArticuloConversor;
import com.bl.bootcamp.articulo.api.v1_0.articulo.dto.Articulo;
import com.bl.bootcamp.articulo.persistencia.RepositorioArticulo;
import com.bl.bootcamp.articulo.servicios.ServicioArticulo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ServicioArticuloImpl implements ServicioArticulo {

    private final RepositorioArticulo repositorio;

    private final ArticuloConversor conversor;

    @Autowired
    public ServicioArticuloImpl(RepositorioArticulo repositorio, ArticuloConversor conversor) {
        super();
        this.repositorio = repositorio;
        this.conversor = conversor;
    }

    @Override
    public Articulo obtenerArticulo(Integer idarticulo) {
        return conversor.aDto(this.repositorio.obtenerArticulo(idarticulo));

    }

    @Override
    public int crearArticulo(Articulo articulo) {
        return this.repositorio.crearArticulo(conversor.aModelo(articulo));

    }

    @Override
    public int editarArticulo(Articulo articulo) {
        return this.repositorio.editarArticulo(conversor.aModelo(articulo));

    }

    @Override
    public int borrarArticulo(Integer idarticulo) {
        return this.repositorio.borrarArticulo(idarticulo);

    }

}
