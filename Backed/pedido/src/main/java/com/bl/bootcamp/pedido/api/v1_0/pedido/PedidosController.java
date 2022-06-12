package com.bl.bootcamp.pedido.api.v1_0.pedido;

import javax.validation.Valid;

import com.bl.bootcamp.pedido.api.v1_0.pedido.dto.Pedidos;
import com.bl.bootcamp.pedido.servicios.ServicioPedidos;

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
@RequestMapping("/v1_0/pedido")
public class PedidosController {
    private static final Logger logger = LoggerFactory.getLogger(PedidosController.class);

    private ServicioPedidos servicio;

    @Autowired
    public PedidosController(ServicioPedidos servicio) {
        this.servicio = servicio;
    }

    @GetMapping("/{id}")
    public @ResponseBody Pedidos obtenerPedidos(@PathVariable(required = true) Integer id) {
        logger.info("obtenerPedidos/" + id);
        return servicio.obtenerPedidos(id);

    }

    @PostMapping
    public @ResponseBody int crearPedidos(@Valid @RequestBody Pedidos pedidos) {
        logger.info("crearPedidos");
        return servicio.crearPedidos(pedidos);
    }

    @PutMapping("/{id}")
    public @ResponseBody int editarPedidos(@PathVariable Integer id, @Valid @RequestBody Pedidos pedidos) {
        logger.info("editarPedidos");
        return servicio.editarPedidos(pedidos);
    }

    @DeleteMapping("/{id}")
    public @ResponseBody int borrarPedidos(@PathVariable Integer id) {
        logger.info("borrarPedidos/" + id);
        return servicio.borrarPedidos(id);
    }
}
