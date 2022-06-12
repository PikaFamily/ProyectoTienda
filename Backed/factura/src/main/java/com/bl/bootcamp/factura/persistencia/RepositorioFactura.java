package com.bl.bootcamp.factura.persistencia;

import java.util.List;

import com.bl.bootcamp.factura.persistencia.modelo.FacturaBean;

public interface RepositorioFactura {

    List<FacturaBean> listarFactura();

    FacturaBean obtenerFactura(Integer idfactura);

    int crearFactura(FacturaBean factura);

    int editarFactura(FacturaBean factura);

    int borrarFactura(Integer idfactura);

}
