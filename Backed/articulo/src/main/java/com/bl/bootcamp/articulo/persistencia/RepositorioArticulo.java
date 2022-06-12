package com.bl.bootcamp.articulo.persistencia;

import java.util.List;

import com.bl.bootcamp.articulo.persistencia.modelo.ArticuloBean;

public interface RepositorioArticulo {

    List<ArticuloBean> listarArticulo();

    ArticuloBean obtenerArticulo(Integer id);

    Integer crearArticulo(ArticuloBean cuenta);

    Integer editarArticulo(ArticuloBean cuenta);

    Integer borrarArticulo(Integer id);

}
