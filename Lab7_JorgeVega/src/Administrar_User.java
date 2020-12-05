
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
    private ArrayList<Clase_Users> USUARIOS_LISTADOS = new ArrayList();
    private File FILE = null;
    
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
    
    public void setALUMNO(Clase_Users KK){
        USUARIOS_LISTADOS.add(KK);
    }
    
    
    public void FILE_LOADING() {
        try {            
            USUARIOS_LISTADOS = new ArrayList();Clase_Users P;
            if (FILE.exists()) {
                FileInputStream A= new FileInputStream(FILE);
                ObjectInputStream O= new ObjectInputStream(A);
                try {
                    while ((P = (Clase_Users) O.readObject()) != null) {
                        USUARIOS_LISTADOS.add(P);
                    }
                } catch (EOFException ER) {
                }
                O.close();
                A.close();
            }            
        } catch (Exception ERR) {
            ERR.printStackTrace();
        }
    }

    public void SHOW_FILE() {
        FileOutputStream Q = null;
        ObjectOutputStream H = null;
        try {
            Q = new FileOutputStream(FILE);
            H = new ObjectOutputStream(Q);
            for (Clase_Users W : USUARIOS_LISTADOS) {
                H.writeObject(W);
            }
            H.flush();
        } catch (Exception U) {
        } finally {
            try {
                H.close();
                Q.close();
            } catch (Exception V) {
            }
        }
    }
    
}
