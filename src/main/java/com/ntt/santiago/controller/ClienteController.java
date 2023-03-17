package com.ntt.santiago.controller;

import com.ntt.santiago.service.ClienteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.logging.*;

@RestController
@RequestMapping("/ntt")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    Logger logger = LoggerFactory.getLogger(ClienteController.class);

    @GetMapping("/getInfo/{typeId}/{nIdentification}")
    public ResponseEntity clienteInfo(@PathVariable("nIdentification") int nIdentification, @PathVariable("typeId") String typeId) {
        if (nIdentification < 1000000 || typeId == null ) {
            logger.error("Los Datos no son validos Validos");
            return new ResponseEntity<>("Datos Invalidos", HttpStatus.BAD_REQUEST);
        }
        if (!clienteService.existId(nIdentification)) {
            logger.warn("Número de identificacion no se encuentra en BD");
            return new ResponseEntity<>("numero de identificacion no encontrado", HttpStatus.NOT_FOUND);
        }
        try {
            if (typeId.equals("C") || typeId.equals("P")){
                logger.trace("Obteniendo Cliente...");
                return new ResponseEntity<>(clienteService.getClient(nIdentification, typeId), HttpStatus.OK);
            }
            logger.error("Tipo de Identifiacion invalido");
            return new ResponseEntity<>("Tipo de Identificacion invalido", HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            logger.error("Error al ejecutar peticion de getClient");
            return new ResponseEntity<>("Error en Servidor", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping("/")
    public ResponseEntity home() {
        return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
