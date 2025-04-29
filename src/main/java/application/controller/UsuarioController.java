package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.record.GenericResponse;
import application.record.UsuarioDTO;
import application.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;
    
    @PostMapping
    public GenericResponse insert (@RequestBody UsuarioDTO usuario) {
        return usuarioService.insert(usuario);
    }
}
