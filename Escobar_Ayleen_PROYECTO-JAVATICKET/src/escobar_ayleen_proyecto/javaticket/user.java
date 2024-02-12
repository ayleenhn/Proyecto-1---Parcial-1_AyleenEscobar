package escobar_ayleen_proyecto.javaticket;

import java.io.Serializable;

public abstract class user implements Serializable{
    private String name, username, Password;
    private int edad;
    
    public abstract TipoUser getTipoUsuario();
    
    private static final long SerialVersionUID=777L;
    
    public user(String name, String username, String Password, int edad) {
        this.name = name;
        this.username = username;
        this.Password = Password;
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
