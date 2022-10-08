package co.edu.utp.misiontic.equipo4.rolotour.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.utp.misiontic.equipo4.rolotour.models.eventoModel;
import co.edu.utp.misiontic.equipo4.rolotour.respository.eventoRepository;

@Service
public class eventoService {
    @Autowired
    eventoRepository eventoRepository;

    public ArrayList<eventoModel> obtenerEventos() {
        return (ArrayList<eventoModel>) eventoRepository.findAll();
    }

     
    public eventoModel guardarEvento(eventoModel evento) {
        return eventoRepository.save(evento);
    }

/*
    public Optional<eventoModel> obtenerPorId(Long id) {
        return eventoRepository.findById(id);
    }

    public ArrayList<eventoModel> obtenerPorPrioridad(Integer prioridad) {
        return eventoRepository.findByprioridad(prioridad);
    }

    public boolean eliminarevento(long id){
        try{
        eventoRepository.deleteById(id);
        return true;
        }catch(Exception err){
        return false;
        }
    }
    */
}
