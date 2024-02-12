package escobar_ayleen_proyecto.javaticket;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdminUser {
    private ArrayList<user> listaUser = new ArrayList();
    private File archivo = null;
    
    public AdminUser(String path) {
        archivo = new File(path);
    }

    public ArrayList<user> getListaUser() {
        return listaUser;
    }

    public void setListaUser(ArrayList<user> listaUser) {
        this.listaUser = listaUser;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setUser(user a){
        listaUser.add(a);
    }
    
    
    public void cargarArchivo() {
        try {            
            listaUser = new ArrayList();
            user temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (user) objeto.readObject()) != null) {
                        listaUser.add(temp);
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        try (FileOutputStream fw = new FileOutputStream(archivo);
             ObjectOutputStream bw = new ObjectOutputStream(fw)) {

            for (user t : listaUser) {
                bw.writeObject(t);
            }
            bw.flush();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }   
}
