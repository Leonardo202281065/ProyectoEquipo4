package co.edu.utp.misiontic.equipo4.rolotour.respository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.edu.utp.misiontic.equipo4.rolotour.models.usuario;

@Repository
public interface usuarioRepository extends CrudRepository<usuario, Long> {
    
}
