package com.example.POO.controladores;


import com.example.POO.entidades.Afiliado;
import com.example.POO.entidades.Examen;
import com.example.POO.servicios.ExamenServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/sura/Examen")
public class ExamenControlador {

    @Autowired
    ExamenServicio examenServicio;

    @PostMapping
    public ResponseEntity<?> agregarExamen(@RequestBody Examen examen){
        try {
           Examen respuestaServicio = this.examenServicio.registrarExamen(examen);
           return ResponseEntity
                   .status(HttpStatus.CREATED)
                   .body(respuestaServicio);
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarExamen(@PathVariable Integer id){
        try {
            Examen respuestaAfiliado = this.examenServicio.consultarExamen(id);
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
