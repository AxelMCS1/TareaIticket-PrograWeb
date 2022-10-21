/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practicaExamen.service;

import com.practicaExamen.entity.concierto;
import com.practicaExamen.repository.conciertoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author axelc
 */
@Service
public class conciertoService implements iConciertoService{
    
    @Autowired
    private conciertoRepository conciertoRepository;
    
    @Override
    public List<concierto> listConcierto() {
        return (List<concierto>) conciertoRepository.findAll();
    }

    @Override
    public concierto getConciertoById(long id) {
        return conciertoRepository.findById(id).orElse(null);
    }

    @Override
    public void saveConcierto(concierto concierto) {
        conciertoRepository.save(concierto);
    }

    @Override
    public void delete(long id) {
        conciertoRepository.deleteById(id);
    }
    
}
