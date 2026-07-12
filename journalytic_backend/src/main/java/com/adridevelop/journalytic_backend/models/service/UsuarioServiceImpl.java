package com.adridevelop.journalytic_backend.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adridevelop.journalytic_backend.exceptions.UsuarioNoEncontradoException;
import com.adridevelop.journalytic_backend.models.dao.UsuarioDAO;
import com.adridevelop.journalytic_backend.models.entities.Usuario;

@Service
public class UsuarioServiceImpl implements GeneralService<Usuario>{

    @Autowired
    private UsuarioDAO usuarioDao;

    @Override
    public List<Usuario> getAll() {
        return this.usuarioDao.findAll();
    }

    @Override
    public Usuario getOneById(Long id) {
        return this.usuarioDao.findById(id).orElseThrow( () -> new UsuarioNoEncontradoException("No se ha encontrado al usuario con id " + id));
    }

    @Override
    public Usuario save(Usuario element) {
        return this.usuarioDao.save(element);
    }

    @Override
    public Usuario remove(Usuario element) {
        Usuario usuario= this.getOneById(element.getId());
        this.usuarioDao.delete(element);
        return usuario;
    }

    

}
