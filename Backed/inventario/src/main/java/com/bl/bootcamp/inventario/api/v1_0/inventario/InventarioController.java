package com.bl.bootcamp.inventario.api.v1_0.inventario;

import javax.validation.Valid;

import com.bl.bootcamp.inventario.api.v1_0.inventario.dto.Inventario;
import com.bl.bootcamp.inventario.servicios.ServicioInventario;

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
@RequestMapping("/v1_0/inventario")
public class InventarioController {

    private static final Logger logger = LoggerFactory.getLogger(InventarioController.class);

    private ServicioInventario servicio;

    @Autowired
    public InventarioController(ServicioInventario servicio) {
        this.servicio = servicio;
    }

    @GetMapping("/{id}")
    public @ResponseBody Inventario obtenerInventario(@PathVariable(required = true) Integer id) {
        logger.info("obtenerInventario/" + id);
        return servicio.obtenerInventario(id);

    }

    @PostMapping
    public @ResponseBody int crearInventario(@Valid @RequestBody Inventario inventario) {
        logger.info("crearInventario");
        return servicio.crearInventario(inventario);
    }

    @PutMapping("/{id}")
    public @ResponseBody int editarInventario(@PathVariable Integer id, @Valid @RequestBody Inventario inventario) {
        logger.info("editarInventario");
        return servicio.editarInventario(inventario);
    }

    @DeleteMapping("/{id}")
    public @ResponseBody int borrarInventario(@PathVariable Integer id) {
        logger.info("borrarInventario/" + id);
        return servicio.borrarInventario(id);
    }
}
