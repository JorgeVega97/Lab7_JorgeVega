
import java.io.Serializable;
import javax.swing.table.DefaultTableModel;

/**
Jorge Vega
 */

public class Clase_Compiladores implements Serializable{
    private static final long SerialVersionUID=557L;
    
    private String NAME,M; private int LINEAS; private Analisis ANALISIS; private Sintesis SINTESIS; private DefaultTableModel SIMBOLOGIA; private DefaultTableModel ERROR;

    public Clase_Compiladores() {
    }

    public Clase_Compiladores(String NOMBRE, String MAKER, int LINEAS, Analisis ANALISIS, Sintesis SINTE, DefaultTableModel SIMBO, DefaultTableModel EXCEP) {
        this.NAME = NOMBRE;
        this.M = MAKER;
        this.LINEAS = LINEAS;
        this.ANALISIS = ANALISIS;
        this.SINTESIS = SINTE;
        this.SIMBOLOGIA = SIMBO;
        this.ERROR = EXCEP;
    }

    public DefaultTableModel getSIMBOLOGIA() {
        return SIMBOLOGIA;
    }

    public void setSIMBOLOGIA(DefaultTableModel SIMBOLOGIA) {
        this.SIMBOLOGIA = SIMBOLOGIA;
    }

    public DefaultTableModel getERROR() {
        return ERROR;
    }

    public void setERROR(DefaultTableModel ERROR) {
        this.ERROR = ERROR;
    }

    

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getM() {
        return M;
    }

    public void setM(String M) {
        this.M = M;
    }

    public int getLINEAS() {
        return LINEAS;
    }

    public void setLINEAS(int LINEAS) {
        this.LINEAS = LINEAS;
    }

    public Analisis getANALISIS() {
        return ANALISIS;
    }

    public void setANALISIS(Analisis ANALISIS) {
        this.ANALISIS = ANALISIS;
    }

    public Sintesis getSINTESIS() {
        return SINTESIS;
    }

    public void setSINTESIS(Sintesis SINTESIS) {
        this.SINTESIS = SINTESIS;
    }

    @Override
    public String toString() {
        return "COMPILADORES{" + "NOMBRE: " + NAME + ", CREADOR: " + M + ", LINEAS DE CODIGO: " + LINEAS + ", ANALISIS: " + ANALISIS + ", SINTESIS: " + SINTESIS + ", SIMBOLOS: " + SIMBOLOGIA + ", MENSAJES DE ERROR: " + ERROR + '}';
    }

    

    
}
