package com.example.prueba_inyeccion.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("miservicioComplejo")
//@Primary
public class MiServicioComplejo implements IServicio{
    @Override
    public String operacion(){
        return  " proceso del servicioComplejo";
    }
}
