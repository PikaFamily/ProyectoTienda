package com.bl.bootcamp.cuenta.api.v1_0.cuenta;

import javax.validation.Valid;

import com.bl.bootcamp.cuenta.api.v1_0.cuenta.dto.Cuenta;
import com.bl.bootcamp.cuenta.servicios.ServicioCuenta;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Validated
@RestController
@RequestMapping(path = "/v1_0/cuenta", produces = MediaType.APPLICATION_JSON_VALUE)
public class CuentaController {

    private static final Logger logger = LoggerFactory.getLogger(CuentaController.class);

    private ServicioCuenta servicio;

    @Autowired
    public CuentaController(ServicioCuenta servicio) {
        this.servicio = servicio;
    }

    @GetMapping("/{idCuenta}")
    public @ResponseBody Cuenta obtenerCuenta(@PathVariable(required = true) Integer idCuenta) {
        logger.info("obtenerCuenta/" + idCuenta);
        return servicio.obtenerCuenta(idCuenta);

    }

    @PostMapping
    public @ResponseBody int crearCuenta(@Valid @RequestBody Cuenta cuenta) {
        logger.info("crearCuenta");
        return servicio.crearCuenta(cuenta);
    }

    @PutMapping("/{id}")
    public @ResponseBody int editarCuenta(@PathVariable Integer id, @Valid @RequestBody Cuenta cuenta) {
        logger.info("editarCuenta");
        return servicio.editarCuenta(cuenta);
    }

    @DeleteMapping("/{id}")
    public @ResponseBody int borrarCuenta(@PathVariable Integer id) {
        logger.info("borrarCuenta/" + id);
        return servicio.borrarCuenta(id);
    }

}
