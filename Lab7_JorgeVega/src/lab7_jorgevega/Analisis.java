package lab7_jorgevega;

/**
Jorge Vega
 */
public class Analisis {

    private static final long SerialVersionUID = 380L;
    private int LEXICO,SINTACTICO,SEMANTICO,LINEAS;
    public Analisis(int LINEAS, int LEXICO, int SINTACTICO, int SEMANTICO) {
        this.LINEAS = LINEAS;
        this.LEXICO = LEXICO;
        this.SINTACTICO = SINTACTICO;
        this.SEMANTICO = SEMANTICO;
    }

    
    
    public Analisis() {
    }

    
    
    public int getLINEAS() {
        return LINEAS;
    }

    
    
    
    public void setLINEAS(int LINEAS) {
        this.LINEAS = LINEAS;
    }

    
    
    public int getLEXICO() {
        return LEXICO;
    }

    
    
    
    public void setLEXICO(int LEXICO) {
        this.LEXICO = LEXICO;
    }

    
    
    public int getSINTACTICO() {
        return SINTACTICO;
    }

    
    
    public void setSINTACTICO(int SINTACTICO) {
        this.SINTACTICO = SINTACTICO;
    }

    
    
    public int getSEMANTICO() {
        return SEMANTICO;
    }

    
    
    
    public void setSEMANTICO(int SEMANTICO) {
        this.SEMANTICO = SEMANTICO;
    }

    
    
    @Override
    public String toString() {
        return "LINEASD DE CODIGO: " + LINEAS + ", LEXICO: " + LEXICO + ", SINTACTICO: " + SINTACTICO + ", SEMANTICO: " + SEMANTICO;
    }
    
    
    
}
