package com.example.prueba_inyeccion;

import com.example.prueba_inyeccion.models.service.IServicio;
import com.example.prueba_inyeccion.models.service.MiServicio;
import com.example.prueba_inyeccion.models.service.MiServicioComplejo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Appconfig {
    @Bean("MiServicioSimple")
    public IServicio registrarMiServicio(){
        return new MiServicio();
    }
    @Bean("MiServicioComplejo")
    @Primary
    public IServicio registrarMiServicioComplejo(){
        return new MiServicioComplejo();
    }
}
