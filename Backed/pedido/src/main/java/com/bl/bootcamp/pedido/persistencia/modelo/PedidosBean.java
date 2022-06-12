package com.bl.bootcamp.pedido.persistencia.modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PedidosBean {
    private Integer idpedido;

    private Integer numpedido;

    private String articulo;

    private Integer numarticulo;

}