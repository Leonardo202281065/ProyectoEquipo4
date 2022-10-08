package co.edu.utp.misiontic.equipo4.rolotour.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.utp.misiontic.equipo4.rolotour.models.usuario;
import co.edu.utp.misiontic.equipo4.rolotour.services.usuarioService;

@RestController
@RequestMapping("api")
public class appController {

    @Autowired
    usuarioService usuarioService;

    @GetMapping("/login")
    public String login() {
        return "Hola Mundo Spring";
    }

    @GetMapping("/all")
    public ArrayList<usuario> getAllUser() {
        return usuarioService.getAllUser();
    }

    @GetMapping("/find/{id} ")
    public Optional<usuario> getUserById(@PathVariable("id") long id) {
        return usuarioService.GetUserById(id);
    }

    @PostMapping("/save")
    public usuario saveUser(@RequestBody usuario u) {
        return usuarioService.saveUser(u);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUserById(@PathVariable("id") long id) {
        if (usuarioService.deleteUserById(id))
            return "se ha eliminado un usuario";
        else
            return "no se ha eliminado el usuario";
    }

}
