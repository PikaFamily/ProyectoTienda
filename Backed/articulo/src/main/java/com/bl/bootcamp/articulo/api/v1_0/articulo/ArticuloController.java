package com.bl.bootcamp.articulo.api.v1_0.articulo;

import javax.validation.Valid;

import com.bl.bootcamp.articulo.api.v1_0.articulo.dto.Articulo;
import com.bl.bootcamp.articulo.servicios.ServicioArticulo;

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
@RequestMapping("/v1_0/articulo")
public class ArticuloController {
    private static final Logger logger = LoggerFactory.getLogger(ArticuloController.class);

    private ServicioArticulo servicio;

    @Autowired
    public ArticuloController(ServicioArticulo servicio) {
        this.servicio = servicio;
    }

    @GetMapping("/{id}")
    public @ResponseBody Articulo obtenerArticulo(@PathVariable(required = true) Integer id) {
        logger.info("obtenerArticulo/" + id);
        return servicio.obtenerArticulo(id);

    }

    @PostMapping
    public @ResponseBody int crearArticulo(@Valid @RequestBody Articulo articulo) {
        logger.info("crearArticulo");
        return servicio.crearArticulo(articulo);
    }

    @PutMapping("/{id}")
    public @ResponseBody int editarArticulo(@PathVariable Integer id, @Valid @RequestBody Articulo articulo) {
        logger.info("editarArticulo");
        return servicio.editarArticulo(articulo);
    }

    @DeleteMapping("/{id}")
    public @ResponseBody int borrarArticulo(@PathVariable Integer id) {
        logger.info("borrarArticulo/" + id);
        return servicio.borrarArticulo(id);
    }
}
