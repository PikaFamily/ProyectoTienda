package com.bl.bootcamp.pedido.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bl.bootcamp.pedido.api.v1_0.pedido.conversor.PedidosConversor;
import com.bl.bootcamp.pedido.api.v1_0.pedido.dto.Pedidos;
import com.bl.bootcamp.pedido.persistencia.RepositorioPedidos;
import com.bl.bootcamp.pedido.servicios.ServicioPedidos;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ServicioPedidosImpl implements ServicioPedidos {

    private final RepositorioPedidos repositorio;

    private final PedidosConversor conversor;

    @Autowired
    public ServicioPedidosImpl(RepositorioPedidos repositorio, PedidosConversor conversor) {
        super();
        this.repositorio = repositorio;
        this.conversor = conversor;
    }

    @Override
    public Pedidos obtenerPedidos(Integer idpedido) {
        return conversor.aDto(this.repositorio.obtenerPedidos(idpedido));

    }

    @Override
    public int crearPedidos(Pedidos pedidos) {
        return this.repositorio.crearPedidos(conversor.aModelo(pedidos));

    }

    @Override
    public int editarPedidos(Pedidos pedidos) {
        return this.repositorio.editarPedidos(conversor.aModelo(pedidos));

    }

    @Override
    public int borrarPedidos(Integer idpedido) {
        return this.repositorio.borrarPedidos(idpedido);

    }

}
