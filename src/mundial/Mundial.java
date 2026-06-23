 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundial;

import partidos.Partido;
import selecciones.Seleccion;

/**
 *
 * @author bycha
 */
public class Mundial {
    
    private String nombre;
    private int año;
    private String pais;
    
    private Seleccion[] selecciones;
    private Partido[] partidos;
    
    private int cantSelecciones;
    private int cantPartidos;

    public String getNombre() {
        return nombre;
    }

    public int getAño() {
        return año;
    }

    public String getPais() {
        return pais;
    }

    public Seleccion[] getSelecciones() {
        return selecciones;
    }

    public Partido[] getPartidos() {
        return partidos;
    }

    public int getCantSelecciones() {
        return cantSelecciones;
    }

    public int getCantPartidos() {
        return cantPartidos;
    }
    
    public Mundial(String nombre, int año, String pais){
        this.nombre=nombre;
        this.año=año;
        this.pais=pais;
    }
    
    public void agregarSelecciones(Seleccion nombreSele){
        if(cantSelecciones<selecciones.length){
            selecciones[cantSelecciones]=nombreSele;
            cantSelecciones++;
            
        }
    }
    
    public void agregarPartido(Partido Partido){
        if(cantPartidos<partidos.length){
            partidos[cantPartidos]=Partido;
            cantPartidos++;
        }
        
    }
}
