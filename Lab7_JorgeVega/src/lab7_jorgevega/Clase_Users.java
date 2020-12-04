package lab7_jorgevega;

import java.io.Serializable;

/**
Jorge Vega
 */
public class Clase_Users implements Serializable{

    private static final long SerialVersionUID = 380L;
    private float FINAL_CALIFICACION;
    private String USER;
    private String PASS;
    private String NAME; 
    private String LAST_NAME;

    public Clase_Users() {
    }

    
    
    
    
    public Clase_Users(String NAME, String LAST_NAME, String USER, String PASS, float FINAL_CALIFICACION) {
        this.NAME = NAME;
        this.LAST_NAME = LAST_NAME;
        this.USER = USER;
        this.PASS = PASS;
        this.FINAL_CALIFICACION = FINAL_CALIFICACION;
    }

    
    
    public String getNAME() {
        return NAME;
    }

    
    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    
    public String getLAST_NAME() {
        return LAST_NAME;
    }

    
    public void setLAST_NAME(String LAST_NAME) {
        this.LAST_NAME = LAST_NAME;
    }

    
    public String getUSER() {
        return USER;
    }

    public void setUSER(String USER) {
        this.USER = USER;
    }

    
    public String getPASS() {
        return PASS;
    }

    
    public void setPASS(String PASS) {
        this.PASS = PASS;
    }

    
    public float getFINAL_CALIFICACION() {
        return FINAL_CALIFICACION;
    }

    public void setFINAL_CALIFICACION(float FINAL_CALIFICACION) {
        this.FINAL_CALIFICACION = FINAL_CALIFICACION;
    }

    
    @Override
    public String toString() {
        return "NOMBRE: " + NAME + " USUARIO: " + USER + " NOTA FINAL: " + FINAL_CALIFICACION;
    }
    
    
}
