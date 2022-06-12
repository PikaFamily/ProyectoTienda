package com.bl.bootcamp.factura.persistencia.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class FacturaBean {
    private Integer idfactura;

    private Integer numfactura;

    private Integer totaldinero;

    private Date fecha;

    private Integer ivaarticulo;

    protected List<FacturaBean> oredCriteria;

    public FacturaBean() {
        oredCriteria = new ArrayList<>();
    }
}