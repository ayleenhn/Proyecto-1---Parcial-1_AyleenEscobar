
package escobar_ayleen_proyecto.javaticket;

import java.io.Serializable;
import java.util.ArrayList;

final public class UserAdministrador extends user implements Serializable{
    private ArrayList<Evento> idsEventosCreados= new ArrayList();
    
    private static final long SerialVersionUID=777L;
    
    public UserAdministrador(String name, String username, String Password, int edad) {
        super(name, username, Password, edad);
    }

    @Override
    public TipoUser getTipoUsuario() {
        return TipoUser.ADMINISTRADOR;
    }
    
}
