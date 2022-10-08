package co.edu.utp.misiontic.equipo4.rolotour.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.utp.misiontic.equipo4.rolotour.models.usuario;
import co.edu.utp.misiontic.equipo4.rolotour.respository.usuarioRepository;

@Service
public class usuarioServiceImpl implements usuarioService {

    @Autowired
    usuarioRepository usuarioRepository;
    
    @Override
    public ArrayList<usuario> getAllUser() {
        return (ArrayList<usuario>) usuarioRepository.findAll();
    }

    @Override
    public Optional<usuario> GetUserById(Long id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public usuario saveUser(usuario u) {
        return usuarioRepository.save(u);
    }

    @Override
    public boolean deleteUserById(long id) {
    try {
       Optional <usuario> u=GetUserById(id);
       usuarioRepository.delete(u.get());
       return true;
    } catch (Exception e) {
        return false;
    }
    }
    
}
