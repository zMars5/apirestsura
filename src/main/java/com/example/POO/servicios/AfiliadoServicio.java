package com.example.POO.servicios;

import com.example.POO.entidades.Afiliado;
import com.example.POO.repositorios.AfiliadoRepositorio;
import com.example.POO.servicios.utilidades.Msj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AfiliadoServicio {

    @Autowired //se conecta automaticamente con la clase sin llamar al constructor, faiclita la sintaxis.
    AfiliadoRepositorio afiliadoRepositorio;

    //Registrar un afiliado
    public Afiliado registrarAfiliado(Afiliado afiliado) throws Exception{

        try{
          return this.afiliadoRepositorio.save(afiliado);
        }catch(Exception error){
            throw new Exception(Msj.ERROR_REGISTRO.getMensaje());
        }

    }

    //Consultar un afiliado

    public Afiliado consultarAfiliado(Integer idAfiliado) throws Exception{
        try {
            Optional<Afiliado> afiliadoBuscado = this.afiliadoRepositorio.findById(idAfiliado); // La logica nos dice que puede estar o no, asi que no puede retornar tal cual porque puede no encontrar nada, para eso es el optional.
            if(afiliadoBuscado.isPresent()){ //se encontró en la base de datos
                return afiliadoBuscado.get();
            }else {
                throw new Exception(Msj.ERROR_NO_ENCUENTRA.getMensaje());
            }
        }catch (Exception error){
            throw new Exception(Msj.ERROR_NO_ENCUENTRA.getMensaje());
        }
    }

    //Consultar afiliados (todos)


    //Modificar datos de afiliado


    //Borrar afiliado

}
