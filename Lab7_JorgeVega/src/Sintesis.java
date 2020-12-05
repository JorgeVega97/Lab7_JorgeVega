
import java.io.Serializable;

/**
Jorge Vega
 */

public class Sintesis implements Serializable{
    private static final long SerialVersionUID = 560L;


    private int PRODUCE;
    private int OPTI;
    private int PROD;

    public Sintesis() {
    }

    public Sintesis( int PRODUCE, int OPTI, int PROD) {
        this.PRODUCE = PRODUCE;
        this.OPTI = OPTI;
        this.PROD = PROD;
    }

    public int getPRODUCE() {
        return PRODUCE;
    }

    public void setPRODUCE(int PRODUCE) {
        this.PRODUCE = PRODUCE;
    }

    public int getOPTI() {
        return OPTI;
    }

    public void setOPTI(int OPTI) {
        this.OPTI = OPTI;
    }

    public int getPROD() {
        return PROD;
    }

    public void setPROD(int PROD) {
        this.PROD = PROD;
    }

    @Override
    public String toString() {
        return "FASE SINTESIS{" + ", Generación de código intermedio: " + PRODUCE + ", Optimización :" + OPTI + ", Generador de código final: " + PROD + '}';
    }
    
    
}
