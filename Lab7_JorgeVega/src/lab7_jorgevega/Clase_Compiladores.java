package lab7_jorgevega;

/**
Jorge Vega
 */
public class Clase_Compiladores {
    private static final long SerialVersionUID=380L;
    
    private String NAME,M; private int LINEAS; private Analisis ANALISIS; private Sintesis SIN;

    public Clase_Compiladores() {
    }

    public Clase_Compiladores(String NAME, String MAKER, int LINEAS, Analisis ANALISIS, Sintesis SIN) {
        this.NAME = NAME;
        this.M = MAKER;
        this.LINEAS = LINEAS;
        this.ANALISIS = ANALISIS;
        this.SIN = SIN;
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

    public Analisis getAnalisis() {
        return ANALISIS;
    }

    public void setAnalisis(Analisis analisis) {
        this.ANALISIS = analisis;
    }

    public Sintesis getSintesis() {
        return SIN;
    }

    public void setSintesis(Sintesis sintesis) {
        this.SIN = sintesis;
    }

    @Override
    public String toString() {
        return "NOMBRE: " + NAME + ", CREADOR: " + M + ", LINEAS DE CODIGO: " + LINEAS + ", ANALISIS: " + ANALISIS + ", SINTESIS: " + SIN ;
    }

    
}
