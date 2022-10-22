package com.example.prueba_inyeccion.controller;

import com.example.prueba_inyeccion.models.service.IServicio;
import com.example.prueba_inyeccion.models.service.MiServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @Autowired
    //@Qualifier("miservicioComplejo")
    private IServicio servicio;

    /*
        public IndexController(IServicio servicio) {
            this.servicio = servicio;
        }
        */
    //private MiServicio servicio= new MiServicio();
    @GetMapping({"/", "", "/index"})
    public String index(Model model) {

        model.addAttribute("objeto", servicio.operacion());

        return "index";
    }


  /*
   public void setServicio(IServicio servicio) {
        this.servicio = servicio;
    }


  @Autowired

   */


}
