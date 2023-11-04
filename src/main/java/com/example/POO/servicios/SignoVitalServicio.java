package com.example.POO.servicios;

import com.example.POO.entidades.Afiliado;
import com.example.POO.entidades.SignoVital;
import com.example.POO.repositorios.SignoVitalRepositorio;
import com.example.POO.servicios.utilidades.Msj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

    public SignoVital consultarSignoVital (Integer idSignoVital) throws Exception{
        try {
            Optional<SignoVital> signoVitalBuscado = this.signoVitalRepositorio.findById(idSignoVital);
            return signoVitalBuscado.get();
        }catch (Exception error){
                throw new Exception(Msj.ERROR_NO_ENCUENTRA.getMensaje());
        }
    }

}
