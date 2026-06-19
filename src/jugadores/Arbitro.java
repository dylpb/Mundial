/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jugadores;

import java.time.LocalDate;
import personas.Persona;

/**
 *
 * @author bycha
 */
public abstract class Arbitro extends Persona {
   
protected String nombre;
protected String nacionalidad;
protected LocalDate fecha;
protected String categoría;

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public LocalDate getfecha() {
        return fecha;
    }

    public String getCategoría() {
        return categoría;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setCategoría(String categoría) {
        this.categoría = categoría;
    }

    public Arbitro(String nombre, String nacionalidad, LocalDate fecha, String categoría) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fecha = fecha;
        this.categoría = categoría;
    }

 @Override
    public String toString() {
        return "Nombre: " + nombre + 
                "\nEdad: " + this.getEdad() + 
                "\nNacionalidad: " + nacionalidad + 
                "\nFecha=" + fecha +
                "\ncategoría=" + categoría;
    }
    
}
