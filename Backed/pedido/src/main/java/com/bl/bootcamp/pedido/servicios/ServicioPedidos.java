package com.bl.bootcamp.pedido.servicios;

import com.bl.bootcamp.pedido.api.v1_0.pedido.dto.Pedidos;

public interface ServicioPedidos {
    Pedidos obtenerPedidos(Integer idpedido);

    int crearPedidos(Pedidos pedidos);

    int editarPedidos(Pedidos pedidos);

    int borrarPedidos(Integer idpedido);
}
