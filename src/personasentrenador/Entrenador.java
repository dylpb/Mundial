/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personasentrenador;
import java.time.LocalDate;
import personas.Persona;
/**
 *
 * @author isaac
 */
public class Entrenador extends Persona{
    
    protected int añosExperiencia;

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }
    
    public Entrenador(String nombre, String nacionalidad, LocalDate fecha, int añosExperiencia){
        super(nombre, nacionalidad, fecha);
        this.añosExperiencia=añosExperiencia;
    }
    
    @Override
    public String toString() {
        return "Entrenador: " + super.toString()
                + ", Años de experiencia: "
                + añosExperiencia;
    }
    
    
}
