package com.bl.bootcamp.pedido.api.v1_0.pedido.conversor;

import com.bl.bootcamp.pedido.api.v1_0.pedido.dto.Pedidos;
import com.bl.bootcamp.pedido.persistencia.modelo.PedidosBean;

import org.springframework.stereotype.Component;

@Component
public class PedidosConversor {
    public PedidosBean aModelo(Pedidos dto) {
        return new PedidosBean(dto.getIdpedido(), dto.getNumarticulo(), dto.getArticulo(), dto.getNumarticulo());
    }

    public Pedidos aDto(PedidosBean dto) {
        Pedidos pedidos = new Pedidos();
        pedidos.setIdpedido(dto.getIdpedido());
        pedidos.setNumpedido(dto.getNumpedido());
        pedidos.setArticulo(dto.getArticulo());
        pedidos.setNumarticulo(dto.getNumarticulo());
        return pedidos;
    }
}
