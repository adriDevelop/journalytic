package com.adridevelop.journalytic_backend.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adridevelop.journalytic_backend.exceptions.DireccionNoEncontradaException;
import com.adridevelop.journalytic_backend.models.dao.VisitaDAO;
import com.adridevelop.journalytic_backend.models.entities.Visita;

@Service
public class VisitaServiceImpl implements GeneralService<Visita>{

    @Autowired
    private VisitaDAO visitaDao;

    @Override
    public List<Visita> getAll() {
        return this.visitaDao.findAll();
    }

    @Override
    public Visita getOneById(Long id) {
        return this.visitaDao.findById(id).orElseThrow(() -> new DireccionNoEncontradaException("No se ha encontrado la dirección indicada con id " + id));
    }

    @Override
    public Visita save(Visita element) {
        return this.visitaDao.save(element);
    }

    @Override
    public Visita remove(Visita element) {
        Visita visita = this.getOneById(element.getId());
        this.visitaDao.delete(element);
        return visita;
    }



}
