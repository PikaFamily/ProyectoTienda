package com.bl.bootcamp.factura.persistencia.dao;

import java.util.List;

import com.bl.bootcamp.factura.api.v1_0.factura.dto.Factura;
import com.bl.bootcamp.factura.persistencia.RepositorioFactura;
import com.bl.bootcamp.factura.persistencia.mapper.FacturaMapper;
import com.bl.bootcamp.factura.persistencia.modelo.FacturaBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class RepositorioFacturaImpl implements RepositorioFactura {

    private final FacturaMapper mapper;

    @Autowired
    public RepositorioFacturaImpl(FacturaMapper mapper) {
        super();
        this.mapper = mapper;
    }

    @Override
    public FacturaBean obtenerFactura(Integer idfactura) {
        return this.mapper.selectByPrimaryKey(idfactura);

    }

    @Override
    public int crearFactura(FacturaBean factura) {
        return this.mapper.insert(factura);
    }

    @Override
    public int editarFactura(FacturaBean factura) {
        return this.mapper.updateByPrimaryKeySelective(factura);
    }

    @Override
    public int borrarFactura(Integer idfactura) {
        return this.mapper.deleteByPrimaryKey(idfactura);

    }

    @Override
    public List<FacturaBean> listarFactura() {
        return this.mapper.selectByExample(new FacturaBean());

    }

}
