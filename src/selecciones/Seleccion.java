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

    public Seleccion(String nombreSele, Grupo grupo, Jugador jugadores[], Entrenador entrenador) {
        this.nombreSele = nombreSele;
        this.grupo = grupo;
        this.jugadores = jugadores;
        this.entrenador = entrenador;
    }
    
<<<<<<< Updated upstream
    public int buscarJugador(String nombre) {
        for (int i = 0; i < jugadores.length; i++) {
            if(jugadores[i]!=null &&
                    jugadores[i].getNombre().equalsIgnoreCase(nombre)){
              
                return i;
=======
    public int buscarEspDisp() {
        //revisar si el vector existe
        if (jugadores == null) {
           return -1; 
        }
        //recorrer el vector para buscar esp disp
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] == null) {
               return i; 
>>>>>>> Stashed changes
            }
        }
        return -1;
    }
    
    public int buscarCamiseta(int numero){
        for (int i = 0; i < jugadores.length; i++) {  
            
            if (jugadores[i] != null) {
            if (jugadores[i].getNumero() == numero) {
            return i;                      
                }
            }            
        }
        return -1;       
    }
    
public int buscarNombre(String nombre) {
        for (int i = 0; i < jugadores.length; i++) {  
            
            if (jugadores[i] != null) {
                
                if (jugadores[i].getNombre().equalsIgnoreCase(nombre)) { 
                    System.out.println("Se encontro al jugador: " + nombre + "En la posicion: " + i);
                    return i; 
                }
            }            
        }
        System.out.println("No se encontro jugadors con el nombre: " + nombre);
        return -1;       
    }
    

    public void agregarJugador(Jugador nuevoJugador) {
        int pos = buscarEspDisp();
        if (pos == -1) {
            System.out.println("El equipo esta completo");            
        }else{
            this.jugadores[pos] = nuevoJugador;
            System.out.println("Se ha agregado al jugador en la posicion: "+pos);
        }
    }
    
    public void eliminarJugador(int numero) {
        int pos = buscarCamiseta(numero);
        if (pos != -1) {
            this.jugadores[pos] = null;
            System.out.println("Jugador eliminado.");
        }
    } 
    
    
    public int contarJugadores() {
        int cont = 0;
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] != null) {
                cont++;
            }
        }
        return cont;
    }
    
    public boolean existeJugador(int numero) {
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] != null && jugadores[i].getNumero() == numero) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Seleccion: " + nombreSele + 
                "\nGrupo: " + grupo +
                "\nEntrenador: " + entrenador +
                "\nJugador: " + Arrays.toString(jugadores);
    }
    
    
    
    
}
