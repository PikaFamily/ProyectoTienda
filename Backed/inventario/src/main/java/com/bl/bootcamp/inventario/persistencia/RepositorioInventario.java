package com.bl.bootcamp.inventario.persistencia;

import java.util.List;

import com.bl.bootcamp.inventario.persistencia.modelo.InventarioBean;

public interface RepositorioInventario {

    List<InventarioBean> listarInventario();

    InventarioBean obtenerInventario(Integer id);

    Integer crearInventario(InventarioBean cuenta);

    Integer editarInventario(InventarioBean cuenta);

    Integer borrarInventario(Integer id);
}
