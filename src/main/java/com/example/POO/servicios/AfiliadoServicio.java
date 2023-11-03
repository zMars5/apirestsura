package com.example.POO.servicios;

import com.example.POO.entidades.Afiliado;
import com.example.POO.repositorios.AfiliadoRepositorio;
import com.example.POO.servicios.utilidades.Msj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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


    //Consultar afiliados (todos)


    //Modificar datos de afiliado


    //Borrar afiliado

}
