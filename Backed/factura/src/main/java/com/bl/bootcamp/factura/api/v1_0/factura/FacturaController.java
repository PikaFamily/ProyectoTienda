package com.bl.bootcamp.factura.api.v1_0.factura;

import java.util.List;

import javax.validation.Valid;

import com.bl.bootcamp.factura.api.v1_0.factura.dto.Factura;
import com.bl.bootcamp.factura.servicios.ServicioFactura;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/v1_0/factura")
public class FacturaController {
    private static final Logger logger = LoggerFactory.getLogger(FacturaController.class);

    private ServicioFactura servicio;

    @Autowired
    public FacturaController(ServicioFactura servicio) {
        this.servicio = servicio;
    }

    @GetMapping("/list")
    public @ResponseBody List<Factura> obtenerFactura() {
        logger.info("obtenerFactura");
        return servicio.obtenerFactura();
    }

    @GetMapping("/detail/{id}")
    public @ResponseBody Factura obtenerFactura(@PathVariable(required = true) Integer id) {
        logger.info("obtenerFactura/" + id);
        return servicio.obtenerFactura(id);

    }

    @PostMapping("/create")
    public @ResponseBody int crearFactura(@Valid @RequestBody Factura factura) {
        logger.info("crearFactura");
        return servicio.crearFactura(factura);
    }

    @PutMapping("/update/{id}")
    public @ResponseBody int editarFactura(@PathVariable Integer id, @Valid @RequestBody Factura factura) {
        logger.info("editarFactura");
        return servicio.editarFactura(factura);
    }

    @DeleteMapping("/delete/{id}")
    public @ResponseBody int borrarFactura(@PathVariable Integer id) {
        logger.info("borrarFactura/" + id);
        return servicio.borrarFactura(id);
    }
}
