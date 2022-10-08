package co.edu.utp.misiontic.equipo4.rolotour.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login")
public class loginModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="login", nullable=false)
    private String login;

    @Column(name="password", nullable=false)
    private String password;
    
}
