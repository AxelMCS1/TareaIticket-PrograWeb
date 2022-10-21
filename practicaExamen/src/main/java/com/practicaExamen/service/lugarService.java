/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practicaExamen.service;

import com.practicaExamen.entity.lugar;
import com.practicaExamen.repository.lugarRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author axelc
 */
@Service
public class lugarService implements iLugarService {
    
    @Autowired
    private lugarRepository lugarRepository;
    
    @Override
    public List<lugar> listaLugar() {
        return (List<lugar>) lugarRepository.findAll();
    }
    
}
