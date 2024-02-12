
package escobar_ayleen_proyecto.javaticket;

import java.io.Serializable;

public class UserLimitado extends user implements Serializable{
    
    private static final long SerialVersionUID=777L;
    
    public UserLimitado(String name, String username, String Password, int edad) {
        super(name, username, Password, edad);
    }

    @Override
    public TipoUser getTipoUsuario() {
        return TipoUser.LIMITADO;
    }
    
}
