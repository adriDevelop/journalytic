package com.adridevelop.journalytic_backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adridevelop.journalytic_backend.models.entities.Usuario;
import com.adridevelop.journalytic_backend.models.service.UsuarioServiceImpl;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/api")
public class UsuarioController {

    @Autowired
    private UsuarioServiceImpl usuarioServiceImpl;

    @GetMapping("/usuarios")
    public ResponseEntity<List<Usuario>> getAllUsuarios() {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(this.usuarioServiceImpl.getAll());
    }

    @GetMapping("/usuario/{id}")
    public ResponseEntity<Usuario> getUsuarioById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(this.usuarioServiceImpl.getOneById(id));
    }

    @PostMapping("/usuario")
    public ResponseEntity<Usuario> save(@RequestBody Usuario usuario) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.usuarioServiceImpl.save(usuario));
    }

    @PutMapping("/usuario")
    public ResponseEntity<Usuario> update(@RequestBody Usuario usuario) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.usuarioServiceImpl.save(usuario));
    }

    @DeleteMapping("/usuario")
    public ResponseEntity<Usuario> delete(@RequestBody Usuario usuario){
        return ResponseEntity.status(HttpStatus.OK).body(this.usuarioServiceImpl.remove(usuario));
    }
    
    
    
}
