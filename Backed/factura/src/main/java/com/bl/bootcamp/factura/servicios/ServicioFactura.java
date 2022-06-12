package com.bl.bootcamp.factura.servicios;

import java.util.List;

import com.bl.bootcamp.factura.api.v1_0.factura.dto.Factura;

public interface ServicioFactura {

    List<Factura> obtenerFactura();

    Factura obtenerFactura(Integer idfactura);

    int crearFactura(Factura factura);

    int editarFactura(Factura factura);

    int borrarFactura(Integer idfactura);
}
