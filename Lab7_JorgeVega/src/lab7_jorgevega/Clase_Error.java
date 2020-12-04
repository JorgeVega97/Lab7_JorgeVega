package lab7_jorgevega;

/**
Jorge Vega
 */
public class Clase_Error {
    private static final long SerialVersionUID=380L;
    
    private String COD;
    private String CONTENIDO_ERROR;
    
    
    public Clase_Error() {
    }

    
    
    
    public Clase_Error(String COD, String CONTENIDO_ERROR) {
        this.COD = COD;
        this.CONTENIDO_ERROR = CONTENIDO_ERROR;
    }

    
    
    public String getCOD() {
        return COD;
    }

    
    
    public void setCOD(String COD) {
        this.COD = COD;
    }

    
    
    
    public String getCONTENIDO_ERROR() {
        return CONTENIDO_ERROR;
    }

    
    
    public void setCONTENIDO_ERROR(String CONTENIDO_ERROR) {
        this.CONTENIDO_ERROR = CONTENIDO_ERROR;
    }

    
    
    @Override
    public String toString() {
        return "CODIGO: " + COD + ", MENSAJE: " + CONTENIDO_ERROR;
    }
    
    
}
