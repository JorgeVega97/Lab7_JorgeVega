package lab7_jorgevega;

/**
Jorge Vega
 */
public class Clase_SuperUser {
    private String NAME = "Carlos",LAST_NAME = "Vallejo",USER = "ca.vallejo",PASS = "compi123";

    
    
    
    public String getNAME() {
        return NAME;
    }

    
    
    
    public String getLAST_NAME() {
        return LAST_NAME;
    }

    
    
    public String getUSER() {
        return USER;
    }

    
    
    
    public String getPASS() {
        return PASS;
    }

    
    
    
    @Override
    public String toString() {
        return "Nombre: " + NAME + " Usuario: " + USER;
    }
    
    
}
