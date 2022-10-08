package co.edu.utp.misiontic.equipo4.rolotour.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class usuario {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY )
    private long id;
    private String nombre;
    private String direccion;
    private String mail;
   
    public usuario() {
    }

    public usuario(String nombre, String direccion, String mail) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.mail = mail;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    
    
}
