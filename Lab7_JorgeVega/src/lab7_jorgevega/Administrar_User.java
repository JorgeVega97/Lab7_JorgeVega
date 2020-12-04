package lab7_jorgevega;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
Jorge Vega
 */
public class Administrar_User {
    private File FILE = null;
    private ArrayList<Clase_Users> USUARIOS_LISTADOS = new ArrayList();
    
    
    public Administrar_User(String path) {
        FILE = new File(path);
    }

    public ArrayList<Clase_Users> getUSUARIOS_LISTADOS() {
        return USUARIOS_LISTADOS;
    }

    public void setUSUARIOS_LISTADOS(ArrayList<Clase_Users> USUARIOS_LISTADOS) {
        this.USUARIOS_LISTADOS = USUARIOS_LISTADOS;
    }

    public File getFILE() {
        return FILE;
    }

    public void setFILE(File FILE) {
        this.FILE = FILE;
    }
    
    public void setALUMNO(Clase_Users xx){
        USUARIOS_LISTADOS.add(xx);
    }
    
    
    public void LOADING_FILE() {
        try {            
            USUARIOS_LISTADOS = new ArrayList();
            Clase_Users P;
            if (FILE.exists()) {
                FileInputStream A = new FileInputStream(FILE);
                ObjectInputStream O = new ObjectInputStream(A);
                try {
                    while ((P = (Clase_Users) O.readObject()) != null) {
                        USUARIOS_LISTADOS.add(P);
                    }
                } catch (EOFException ERR) {
                }
                O.close();
                A.close();
            }            
        } catch (Exception ERRR) {
            ERRR.printStackTrace();
        }
    }

    public void WRITE_FILE() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(FILE);
            bw = new ObjectOutputStream(fw);
            for (Clase_Users X : USUARIOS_LISTADOS) {
                bw.writeObject(X);
            }
            bw.flush();
        } catch (Exception ERRO) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
    
}
