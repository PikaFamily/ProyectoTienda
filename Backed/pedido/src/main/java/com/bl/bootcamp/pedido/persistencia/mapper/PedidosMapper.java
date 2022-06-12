package com.bl.bootcamp.pedido.persistencia.mapper;

import com.bl.bootcamp.pedido.persistencia.modelo.PedidosBean;

public interface PedidosMapper {
    int deleteByPrimaryKey(Integer idpedido);

    int insert(PedidosBean record);

    int insertSelective(PedidosBean record);

    PedidosBean selectByPrimaryKey(Integer idpedido);

    int updateByPrimaryKeySelective(PedidosBean record);

    int updateByPrimaryKey(PedidosBean record);
}