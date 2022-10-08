package co.edu.utp.misiontic.equipo4.rolotour.services;

import java.util.ArrayList;
import java.util.Optional;

import co.edu.utp.misiontic.equipo4.rolotour.models.usuario;

public interface usuarioService {
    ArrayList<usuario>getAllUser();
    Optional<usuario>GetUserById(Long id);
    usuario saveUser(usuario u);
    boolean deleteUserById(long id);
    
}
