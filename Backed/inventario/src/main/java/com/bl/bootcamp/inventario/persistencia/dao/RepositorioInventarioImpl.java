package com.bl.bootcamp.inventario.persistencia.dao;

import java.util.List;

import com.bl.bootcamp.inventario.persistencia.RepositorioInventario;
import com.bl.bootcamp.inventario.persistencia.mapper.InventarioMapper;
import com.bl.bootcamp.inventario.persistencia.modelo.InventarioBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class RepositorioInventarioImpl implements RepositorioInventario {

    private final InventarioMapper mapper;

    @Autowired
    public RepositorioInventarioImpl(InventarioMapper mapper) {
        super();
        this.mapper = mapper;
    }

    @Override
    public List<InventarioBean> listarInventario() {
        return null;
    }

    @Override
    public InventarioBean obtenerInventario(Integer idinventario) {
        return this.mapper.selectByPrimaryKey(idinventario);
    }

    @Override
    public Integer crearInventario(InventarioBean inventario) {
        return this.mapper.insert(inventario);
    }

    @Override
    public Integer editarInventario(InventarioBean inventario) {
        return this.mapper.updateByPrimaryKeySelective(inventario);
    }

    @Override
    public Integer borrarInventario(Integer idinventario) {
        return this.mapper.deleteByPrimaryKey(idinventario);
    }

}
