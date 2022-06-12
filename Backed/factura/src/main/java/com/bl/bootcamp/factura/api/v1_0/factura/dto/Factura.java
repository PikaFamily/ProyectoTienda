package com.bl.bootcamp.factura.api.v1_0.factura.dto;

import java.util.Date;

import lombok.Data;

@Data
public class Factura {

    private Integer idfactura;

    private Integer numfactura;

    private Integer totaldinero;

    private Date fecha;

    private Integer ivaarticulo;

}
