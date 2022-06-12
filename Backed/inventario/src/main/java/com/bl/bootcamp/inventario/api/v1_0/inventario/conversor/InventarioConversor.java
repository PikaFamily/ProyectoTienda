package com.bl.bootcamp.inventario.api.v1_0.inventario.conversor;

import com.bl.bootcamp.inventario.api.v1_0.inventario.dto.Inventario;
import com.bl.bootcamp.inventario.persistencia.modelo.InventarioBean;

import org.springframework.stereotype.Component;

@Component
public class InventarioConversor {
    public InventarioBean aModelo(Inventario dto) {
        return new InventarioBean(dto.getIdinventario(), dto.getStockarticulo());
    }

    public Inventario aDto(InventarioBean dto) {
        Inventario inventario = new Inventario();
        inventario.setIdinventario(dto.getIdinventario());
        inventario.setStockarticulo(dto.getStockarticulo());
        return inventario;
    }
}
