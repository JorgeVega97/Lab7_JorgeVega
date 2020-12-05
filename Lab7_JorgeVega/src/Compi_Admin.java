

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
public class Compi_Admin {

    private ArrayList<Clase_Compiladores> COMPILADORES_LISTADOS = new ArrayList();
    private File FILE = null;

    public Compi_Admin(String path) {
        FILE = new File(path);
    }

    public ArrayList<Clase_Compiladores> getCOMPILADORES_LISTADOS() {
        return COMPILADORES_LISTADOS;
    }

    public void setCOMPILADORES_LISTADOS(ArrayList<Clase_Compiladores> COMPILADORES_LISTADOS) {
        this.COMPILADORES_LISTADOS = COMPILADORES_LISTADOS;
    }

    public File getFILE() {
        return FILE;
    }

    public void setFILE(File FILE) {
        this.FILE = FILE;
    }

    public void setCOMPI(Clase_Compiladores P) {
        COMPILADORES_LISTADOS.add(P);
    }

    public void FILE_LOADING() {
        try {
            COMPILADORES_LISTADOS = new ArrayList();
            Clase_Compiladores K;
            if (FILE.exists()) {
                FileInputStream A = new FileInputStream(FILE);
                ObjectInputStream O= new ObjectInputStream(A);
                try {
                    while ((K = (Clase_Compiladores) O.readObject()) != null) {
                        COMPILADORES_LISTADOS.add(K);
                    }
                } catch (Exception X) {
                }
                O.close();
                A.close();
            }
        } catch (Exception XX) {
            XX.printStackTrace();
        }
    }

    public void SHOW_FILE() {
        FileOutputStream Z = null;
        ObjectOutputStream W = null;
        try {
            Z = new FileOutputStream(FILE);
            W = new ObjectOutputStream(Z);
            for (Clase_Compiladores V : COMPILADORES_LISTADOS) {
                W.writeObject(V);
            }
            W.flush();
        } catch (Exception U) {
        } finally {
            try {
                W.close();
                Z.close();
            } catch (Exception UU) {
            }
        }
    }
}
