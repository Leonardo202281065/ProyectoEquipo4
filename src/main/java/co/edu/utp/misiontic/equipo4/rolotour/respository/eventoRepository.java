package co.edu.utp.misiontic.equipo4.rolotour.respository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.edu.utp.misiontic.equipo4.rolotour.models.eventoModel;

@Repository
public interface eventoRepository extends CrudRepository<eventoModel, Long> {
    
}
