package com.bl.bootcamp.pedido.persistencia.dao;

import java.util.List;

import com.bl.bootcamp.pedido.persistencia.RepositorioPedidos;
import com.bl.bootcamp.pedido.persistencia.mapper.PedidosMapper;
import com.bl.bootcamp.pedido.persistencia.modelo.PedidosBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class RepositorioPedidosImpl implements RepositorioPedidos {
    private final PedidosMapper mapper;

    @Autowired
    public RepositorioPedidosImpl(PedidosMapper mapper) {
        super();
        this.mapper = mapper;
    }

    @Override
    public List<PedidosBean> listarPedidos() {
        return null;
    }

    @Override
    public PedidosBean obtenerPedidos(Integer idpedido) {
        return this.mapper.selectByPrimaryKey(idpedido);
    }

    @Override
    public Integer crearPedidos(PedidosBean pedidos) {
        return this.mapper.insert(pedidos);

    }

    @Override
    public Integer editarPedidos(PedidosBean pedidos) {
        return this.mapper.updateByPrimaryKeySelective(pedidos);

    }

    @Override
    public Integer borrarPedidos(Integer idpedido) {
        return this.mapper.deleteByPrimaryKey(idpedido);

    }
}
