package com.centrosconsumo.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.centrosconsumo.model.CentrosConsumo;
import com.centrosconsumo.service.CentrosConsumoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping(value="centros_consumo")
@CrossOrigin
@Validated
public class CentrosConsumoController {
    @Autowired
    private CentrosConsumoService centrosConsumoService;

    @GetMapping(value = "/getAll")
    public List<CentrosConsumo> getAllCentrosConsumo(){
        return centrosConsumoService.getAllCentrosConsumo();
    }

    @PostMapping(value = "/add")
    public ResponseEntity<String> add (@Valid @RequestBody @NotNull CentrosConsumo centrosConsumo){
        if(centrosConsumo.getNombre().equals("") || centrosConsumo.getCategoria_id().equals("")){
            System.out.println("All the fields are needed");
        }
        centrosConsumoService.saveCentrosConsumo(centrosConsumo);
        String msj = "Nuevo centro de consumo agregado";
        return new ResponseEntity<>(msj, HttpStatus.CREATED);

        //public ResponseEntity<List<CentrosConsumo>>
    }

}
