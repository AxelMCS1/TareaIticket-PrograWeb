/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.practicaExamen.service;

import com.practicaExamen.entity.concierto;
import java.util.List;

/**
 *
 * @author axelc
 */
public interface iConciertoService {
    public List<concierto> listConcierto();
    public concierto getConciertoById (long id);
    public void saveConcierto(concierto concierto);
    public void delete(long id);
}
