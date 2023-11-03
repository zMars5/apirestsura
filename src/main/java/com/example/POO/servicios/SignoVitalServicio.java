package com.example.POO.servicios;

import com.example.POO.entidades.Examen;
import com.example.POO.entidades.SignoVital;
import com.example.POO.repositorios.ExamenRepositorio;
import com.example.POO.repositorios.SignoVitalRepositorio;
import com.example.POO.servicios.utilidades.Msj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignoVitalServicio {

    @Autowired
    SignoVitalRepositorio signoVitalRepositorio;

    public SignoVital registrarSignovital(SignoVital signoVital) throws Exception{
        try {
            return this.signoVitalRepositorio.save(signoVital);
        }catch (Exception error){
            throw new Exception(Msj.ERROR_REGISTRO.getMensaje());
        }
    }

}
