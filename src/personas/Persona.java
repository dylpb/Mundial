/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Dylan
 */
public abstract class Persona {
    
    protected String nombre;
    protected String nacionalidad;
    protected LocalDate fecha;

    public int getEdad() {
        return calcularEdad();
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public LocalDate getFecha() {
        return fecha;
    }
    
    
    protected int calcularEdad(){
        LocalDate fechaHoy = LocalDate.now();
        
        return Period.between(fecha, fechaHoy).getYears();
        /*Si se quiere extraer solo el año, cambiar el tipo de dato a int 
        y agregar al final del return .getYears()*/
    }

    public Persona(String nombre, String nacionalidad, LocalDate fecha) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + 
                "\nEdad: " + this.getEdad() + 
                "\nNacionalidad: " + nacionalidad + 
                "\nFecha=" + fecha;
    }
    
    
    
    
    
    
}
