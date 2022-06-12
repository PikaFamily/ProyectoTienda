package com.bl.bootcamp.articulo.api.v1_0.articulo.conversor;

import com.bl.bootcamp.articulo.api.v1_0.articulo.dto.Articulo;
import com.bl.bootcamp.articulo.persistencia.modelo.ArticuloBean;

import org.springframework.stereotype.Component;

@Component
public class ArticuloConversor {
    public ArticuloBean aModelo(Articulo dto) {
        return new ArticuloBean(dto.getIdarticulo(), dto.getDescripcion(), dto.getPrecio());
    }

    public Articulo aDto(ArticuloBean dto) {
        Articulo articulo = new Articulo();
        articulo.setIdarticulo(dto.getIdarticulo());
        articulo.setDescripcion(dto.getDescripcion());
        articulo.setPrecio(dto.getPrecio());
        return articulo;
    }
}
