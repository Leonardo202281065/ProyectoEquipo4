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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.utp.misiontic.equipo4.rolotour.models.eventoModel;
import co.edu.utp.misiontic.equipo4.rolotour.services.eventoService;

@RestController
@RequestMapping("/evento")
public class eventocontroller {
    @Autowired
    eventoService eventoService;

    @GetMapping()
    public ArrayList<eventoModel>obtenerEventos(){
        return eventoService.obtenerEventos();
        }

    @PostMapping()
    public eventoModel guardarEvento(@RequestBody eventoModel evento){
        System.out.println(evento);
        return this.eventoService.guardarEvento(evento);
        }

    /*
    @GetMapping(path="/evento/{id}")
    public Optional<eventoModel>obtenerEventosPorId(@PathVariable("id") long id) {
        return this.eventoService.obtenerPorId(id);
        }
    @GetMapping("evento/query")
    public ArrayList<eventoModel>obtenerEventosporprioridad(@RequestParam("prioridad") Integer prioridad){
        return this.eventoService.obtenerPorPrioridad(prioridad);    
    }

    @DeleteMapping(path="/{id}")
    public String eliminarPorId (@PathVariable("id") long id)
    {
        Boolean ok=this.eventoService.eliminarevento(id);
        if(ok)
            {
            return "Se elimino el usurio con id" + id;
            }else{
                return
                "Se ha eliminado el usuario con id"+ id;
                }    
     }
     */
   }
    



