package com.bl.bootcamp.pedido.persistencia;

import java.util.List;

import com.bl.bootcamp.pedido.persistencia.modelo.PedidosBean;

public interface RepositorioPedidos {

    List<PedidosBean> listarPedidos();

    PedidosBean obtenerPedidos(Integer id);

    Integer crearPedidos(PedidosBean cuenta);

    Integer editarPedidos(PedidosBean cuenta);

    Integer borrarPedidos(Integer id);
}
