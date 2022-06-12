package com.bl.bootcamp.articulo.persistencia.modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ArticuloBean {
    private Integer idarticulo;

    private String descripcion;

    private Integer precio;

}