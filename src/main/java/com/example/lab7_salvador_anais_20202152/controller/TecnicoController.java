package com.example.lab7_salvador_anais_20202152.controller;
import com.example.lab7_salvador_anais_20202152.repository.TechnicianRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import com.example.lab7_salvador_anais_20202152.entity.Technician;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Optional;

@Controller
@RequestMapping("/tecnico")
public class TecnicoController {
    final TechnicianRepository technicianRepository;

    public TecnicoController(TechnicianRepository technicianRepository) {
        this.technicianRepository = technicianRepository;
    }

    @GetMapping("/tecnicoList")
    public String listarTencnico(Model model) {
        model.addAttribute("listaTecnico", technicianRepository.findAll());
        return "Tecnicos/listTecnico";
    }
    @PostMapping("/save")
    public String gsaveTecnico(Model model, RedirectAttributes attr,
                               @ModelAttribute("technician") @Valid Technician technician, BindingResult bindingResult) {
        if (!bindingResult.hasErrors()) {
            if (technician.getFirstName().equals("")) {
                model.addAttribute("errorTecnicoNombre", "El nombre no puede ser vacío");
                return "Tecnicos/new";
            } else {
                if (technician.getId() == 0) {
                    attr.addFlashAttribute("msg", "Técnico creado exitosamente");
                } else {
                    attr.addFlashAttribute("msg", "Técnico actualizado exitosamente");
                }
                technicianRepository.save(technician);
                return "redirect:/tecnico/tecnicoList";
            }
        }else{
            return "Tecnicos/editFrm";
        }
    }

    @GetMapping("/edit")
    public String editarTransportista(Model model,
                                      @RequestParam("id") int id) {

        Optional<Technician> optionalTechnician = technicianRepository.findById(id);

        if (optionalTechnician.isPresent()) {
            Technician technician = optionalTechnician.get();
            model.addAttribute("tecnico", technician);
            return "Tecnicos/editFrm";
        } else {
            return "redirect:/tecnico/list";
        }
    }

}
