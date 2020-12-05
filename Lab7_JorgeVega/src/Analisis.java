

import java.io.Serializable;

/**
Jorge Vega
 */
public class Analisis implements Serializable {

    private static final long SerialVersionUID = 559L;


    private int LEXICO ;
    private int SINTACTICO;
    private int SEMANTICO;

    public Analisis( int LEXICO, int SINTACTICO, int SEMANTICO) {
        this.LEXICO = LEXICO;
        this.SINTACTICO = SINTACTICO;
        this.SEMANTICO = SEMANTICO;
    }

    public Analisis() {
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
        return " LEXICO: " + LEXICO + ", SINTACTICO: " + SINTACTICO + ", SEMANTICO: " + SEMANTICO;
    }
    
    
    
}
