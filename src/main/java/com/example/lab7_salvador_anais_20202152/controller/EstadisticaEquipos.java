package com.example.lab7_salvador_anais_20202152.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/estequi")
public class EstadisticaEquipos {
    @GetMapping("/estadisticaEquipoList")
    public String listarTencnico() {

        return "EstadisticaEquipos/listEstadisticaEquipo";
    }

}
