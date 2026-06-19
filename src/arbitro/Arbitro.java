/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbitro;

import java.time.LocalDate;
import personas.Persona;

/**
 *
 * @author bycha
 */
public class Arbitro extends Persona {

    protected String categoría;

    public String getCategoría() {
        return categoría;
    }

    public void setCategoría(String categoría) {
        this.categoría = categoría;
    }

    public Arbitro(String categoría, String nombre, String nacionalidad, LocalDate fecha) {
        super(nombre, nacionalidad, fecha);
        this.categoría = categoría;
    }

  

    @Override
    public String toString() {
        return "Nombre: " + nombre
                + "\nEdad: " + this.getEdad()
                + "\nNacionalidad: " + nacionalidad
                + "\nFecha=" + fecha
                + "\ncategoría=" + categoría;
    }

}
