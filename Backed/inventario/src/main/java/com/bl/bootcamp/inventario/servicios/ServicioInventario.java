package com.bl.bootcamp.inventario.servicios;

import com.bl.bootcamp.inventario.api.v1_0.inventario.dto.Inventario;

public interface ServicioInventario {
    Inventario obtenerInventario(Integer idinventario);

    int crearInventario(Inventario inventario);

    int editarInventario(Inventario inventario);

    int borrarInventario(Integer idinventario);
}
