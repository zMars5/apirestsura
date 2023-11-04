package com.example.POO.servicios;


import com.example.POO.entidades.Examen;
import com.example.POO.repositorios.ExamenRepositorio;
import com.example.POO.servicios.utilidades.Msj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ExamenServicio {

    @Autowired
    ExamenRepositorio ExamenRepositorio;

    public Examen registrarExamen(Examen examen) throws Exception{

        try{
            return this.ExamenRepositorio.save(examen);
        }catch(Exception error){
            throw new Exception(Msj.ERROR_REGISTRO.getMensaje());
        }

    }

    public Examen consultarExamen (Integer idExamen ) throws Exception{
        try {
            Optional<Examen> examenBuscado = this.ExamenRepositorio.findById(idExamen);
            return examenBuscado.get();
        }catch (Exception error){
            throw new Exception(Msj.ERROR_NO_ENCUENTRA.getMensaje());
        }
    }
}
