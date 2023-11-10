package com.example.POO.controladores;

import com.example.POO.entidades.Afiliado;
import com.example.POO.entidades.SignoVital;
import com.example.POO.servicios.SignoVitalServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/sura/SignoVital")
public class SignoVitalControlador {

    @Autowired
    SignoVitalServicio signoVitalServicio;

    @PostMapping
    public ResponseEntity<?> agregarSignoVital(@RequestBody SignoVital signoVital){
        try {
            SignoVital respuestaServicio = this.signoVitalServicio.registrarSignovital(signoVital);
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
    public ResponseEntity<?> buscarControlador(@PathVariable Integer id){
        try {
            SignoVital respuestaAfiliado = this.signoVitalServicio.consultarSignoVital(id);
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
