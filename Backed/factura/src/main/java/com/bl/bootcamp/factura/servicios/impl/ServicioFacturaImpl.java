package com.bl.bootcamp.factura.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import com.bl.bootcamp.factura.api.v1_0.factura.conversor.FacturaConversor;
import com.bl.bootcamp.factura.api.v1_0.factura.dto.Factura;
import com.bl.bootcamp.factura.persistencia.RepositorioFactura;
import com.bl.bootcamp.factura.servicios.ServicioFactura;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ServicioFacturaImpl implements ServicioFactura {

    private final RepositorioFactura repositorio;

    private final FacturaConversor conversor;

    @Autowired
    public ServicioFacturaImpl(RepositorioFactura repositorio, FacturaConversor conversor) {
        super();
        this.repositorio = repositorio;
        this.conversor = conversor;
    }

    @Override
    public Factura obtenerFactura(Integer idfactura) {
        return conversor.aDto(this.repositorio.obtenerFactura(idfactura));
    }

    @Override
    public int crearFactura(Factura factura) {
        return this.repositorio.crearFactura(conversor.aModelo(factura));

    }

    @Override
    public int editarFactura(Factura factura) {
        return this.repositorio.editarFactura(conversor.aModelo(factura));

    }

    @Override
    public int borrarFactura(Integer idfactura) {
        return this.repositorio.borrarFactura(idfactura);

    }

    @Override
    public List<Factura> obtenerFactura() {
        return this.repositorio.listarFactura().stream().map(conversor::aDto).collect(Collectors.toList());

    }

}
