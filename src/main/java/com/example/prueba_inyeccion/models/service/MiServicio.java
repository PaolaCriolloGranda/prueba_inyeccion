package com.example.prueba_inyeccion.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Primary
public class MiServicio implements IServicio{
    @Override
    public String operacion(){
        return  "Mi nombre es Paola";
    }
}
