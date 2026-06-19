/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package selecciones;

import java.util.Arrays;
import jugadores.Jugador;
import personasentrenador.Entrenador;

/**
 *
 * @author Dylan
 */
public class Seleccion {
 
    protected String nombreSele;
    protected Grupo grupo;
    protected Jugador jugadores[];
    protected Entrenador entrenador;
     

    public String getNombreSele() {
        return nombreSele;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public Jugador[] getJugador() {
        return jugadores;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public Seleccion(String nombreSele, Grupo grupo, Jugador[] jugadores, Entrenador entrenador) {
        this.nombreSele = nombreSele;
        this.grupo = grupo;
        this.jugadores = jugadores;
        this.entrenador = entrenador;
    }
    
    public int buscarJugador(Jugador[] jugadores) {
        for (int i = 0; i < 22; i++) {
            if (jugadores == null ? jugadores [i] == null : jugadores.equals(i)) {
              
                return i;
            }
        }
        return -1;
    }
    

    public void agregarJugador() {
         
    }
    
    public void eliminarJugador() {
        
    }    

    @Override
    public String toString() {
        return "Seleccion: " + nombreSele + 
                "\nGrupo: " + grupo +
                "\nEntrenador: " + entrenador +
                "\nJugador: " + Arrays.toString(jugadores);
    }
    
    
    
    
}
