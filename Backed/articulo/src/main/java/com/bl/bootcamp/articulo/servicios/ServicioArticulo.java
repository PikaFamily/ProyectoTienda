package com.bl.bootcamp.articulo.servicios;

import com.bl.bootcamp.articulo.api.v1_0.articulo.dto.Articulo;

public interface ServicioArticulo {

    Articulo obtenerArticulo(Integer idarticulo);

    int crearArticulo(Articulo inventario);

    int editarArticulo(Articulo inventario);

    int borrarArticulo(Integer idarticulo);

}
