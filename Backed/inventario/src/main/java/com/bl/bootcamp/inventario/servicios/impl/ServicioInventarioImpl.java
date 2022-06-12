package com.bl.bootcamp.inventario.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bl.bootcamp.inventario.api.v1_0.inventario.conversor.InventarioConversor;
import com.bl.bootcamp.inventario.api.v1_0.inventario.dto.Inventario;
import com.bl.bootcamp.inventario.persistencia.RepositorioInventario;
import com.bl.bootcamp.inventario.servicios.ServicioInventario;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ServicioInventarioImpl implements ServicioInventario {

    private final RepositorioInventario repositorio;

    private final InventarioConversor conversor;

    @Autowired
    public ServicioInventarioImpl(RepositorioInventario repositorio, InventarioConversor conversor) {
        super();
        this.repositorio = repositorio;
        this.conversor = conversor;
    }

    @Override
    public Inventario obtenerInventario(Integer idinventario) {
        return conversor.aDto(this.repositorio.obtenerInventario(idinventario));

    }

    @Override
    public int crearInventario(Inventario inventario) {
        return this.repositorio.crearInventario(conversor.aModelo(inventario));

    }

    @Override
    public int editarInventario(Inventario inventario) {
        return this.repositorio.editarInventario(conversor.aModelo(inventario));

    }

    @Override
    public int borrarInventario(Integer idinventario) {
        return this.repositorio.borrarInventario(idinventario);

    }

}
