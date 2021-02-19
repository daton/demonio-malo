package com.example.demonio;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ControladorUsurio {

    @GetMapping("/usuario")
    public Usuario obtenerUsuario(){
        Usuario u=new Usuario();
        u.setEmail("rapidclimate@gmail.com");
        u.setNombre("Juan Carlos Campos");
        return u;
    }
}
