/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practicaExamen.controller;

import com.practicaExamen.entity.concierto;
import com.practicaExamen.entity.lugar;
import com.practicaExamen.service.iConciertoService;
import com.practicaExamen.service.iLugarService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author axelc
 */
@Controller
public class conciertoController {

    @Autowired
    private iConciertoService conciertoService;
    
    @Autowired
    private iLugarService lugarService;
    

    @GetMapping("/concierto")
    public String concierto(Model model) {
        List<concierto> listaConcierto = conciertoService.listConcierto();
        model.addAttribute("titulo", "ITicket");
        model.addAttribute("subtitulo", "Bienvenido");
        model.addAttribute("concierto", listaConcierto);
        return "concierto";
    }

    @GetMapping("/conciertoN")
    public String crearConcierto(Model model) {
        List<lugar> listaLugar = lugarService.listaLugar();
        model.addAttribute("concierto", new concierto());
        model.addAttribute("lugar", listaLugar);
        return "crear";
    }

    @PostMapping("/save")
    public String guardarConcierto(@ModelAttribute concierto concierto) {
        //modelAtribute para espicificar va a ir del front-end

        conciertoService.saveConcierto(concierto);
        return "redirect:/concierto";
    }

    @GetMapping("/delete/{id}")
    public String eliminarConcierto(@PathVariable("id") Long idConcierto) {
        conciertoService.delete(idConcierto);
        return "redirect:/concierto";
    }

    /*@GetMapping("/editConcierto/{id}")
    public String editarConcierto(@PathVariable("id") Long idConcierto, Model model){
        concierto concierto = conciertoService.getConciertoById(idConcierto);
        List<concierto> listaConcierto = conciertoService.listConcierto();
        model.addAttribute("concierto", concierto);
        return "crear";
    }*/
}
