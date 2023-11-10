package com.example.POO.controladores;

import com.example.POO.entidades.Afiliado;
import com.example.POO.servicios.AfiliadoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/sura/afiliados")
public class AfiliadoControlador {
    @Autowired
    AfiliadoServicio afiliadoServicio;

    //Agregar afiliado

    @PostMapping
    public ResponseEntity<?> agregarAfiliado(@RequestBody Afiliado afiliado){
        try {
         Afiliado respuestaServicio = this.afiliadoServicio.registrarAfiliado(afiliado);
         return ResponseEntity
                 .status(HttpStatus.CREATED)
                 .body(respuestaServicio);
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error);
        }
    }

    //Buscar afiliado

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarAfiliado(@PathVariable Integer id){
        try {
            Afiliado respuestaAfiliado = this.afiliadoServicio.consultarAfiliado(id);
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(respuestaAfiliado);
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error);
        }
    }
}
