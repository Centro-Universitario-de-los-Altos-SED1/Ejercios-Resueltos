/*
 Clase alumno
 */
package ejercicioarregloobjetos;

/**
 *
 * @author Obdulia
 */
public class Datos {
     String nombre;
     String Clase;
     Integer edad;
     String dirFoto;

    public Datos(String nombre, String Clase, Integer edad, String dirFoto) {
        this.nombre = nombre;
        this.Clase = Clase;
        this.edad = edad;
        this.dirFoto= dirFoto;
        
    }

    Datos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public String getClase() {
        return Clase;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setClase(String Clase) {
        this.Clase = Clase;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    
}
