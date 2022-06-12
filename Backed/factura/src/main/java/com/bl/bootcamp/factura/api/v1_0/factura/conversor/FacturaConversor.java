package com.bl.bootcamp.factura.api.v1_0.factura.conversor;

import com.bl.bootcamp.factura.api.v1_0.factura.dto.Factura;
import com.bl.bootcamp.factura.persistencia.modelo.FacturaBean;

import org.springframework.stereotype.Component;

@Component
public class FacturaConversor {
    public FacturaBean aModelo(Factura dto) {
        return new FacturaBean(dto.getIdfactura(), dto.getNumfactura(), dto.getTotaldinero(), dto.getFecha(),
                dto.getIvaarticulo(), null);
    }

    public Factura aDto(FacturaBean dto) {
        Factura factura = new Factura();
        factura.setIdfactura(dto.getIdfactura());
        factura.setNumfactura(dto.getNumfactura());
        factura.setTotaldinero(dto.getTotaldinero());
        factura.setFecha(dto.getFecha());
        factura.setIvaarticulo(dto.getIvaarticulo());
        return factura;
    }
}
