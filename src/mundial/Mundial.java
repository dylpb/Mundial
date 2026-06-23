 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundial;

import partidos.Partido;
import selecciones.Seleccion;
import selecciones.Grupo;

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
        
        selecciones = new Seleccion[32];
        partidos =new Partido[64];
        
        cantSelecciones= 0;
        cantPartidos= 0;
    }
    
    public void mostrarSelecciones(){
        for(int i=0; i<cantSelecciones;i++){
            System.out.println(selecciones[i].getNombreSele());
        }
    }
    
    public Seleccion buscarSeleccion(String nombre){
        for(int i=0;i<cantSelecciones; i++){
            if(selecciones[i].getNombreSele().equalsIgnoreCase(nombre)){
                return selecciones[i];
            }
        }
        return null;
    }
    
    public int contarSelecciones(){
        return cantSelecciones;
    }
    
    public boolean estaInscrita(String nombre){
        for(int i =0; i<cantSelecciones; i++){
            if(selecciones[i].getNombreSele().equalsIgnoreCase(nombre)){
                return true;
            }
        }
        
        return false;
    }
    
    public void agregarSeleccion(Seleccion nombreSele){
        if(cantSelecciones<selecciones.length){
            selecciones[cantSelecciones]=nombreSele;
            cantSelecciones++;
            
        }
    }
    
    public void eliminarSeleccion(String nombreSele){
        for(int i=0;i<cantSelecciones; i++){
            
            if (selecciones[i].getNombreSele().equalsIgnoreCase(nombreSele)){
                for(int j=i; j<cantSelecciones-1;j++){
                    selecciones[j]=selecciones[j+1];
                }
                
                selecciones[cantSelecciones-1]=null;
                cantSelecciones--;
                break;
            }
        }
    }
   
    public void mostrarSeleccionesGrupo(Grupo grupo){
        for(int i=0; i<cantSelecciones; i++){
        
        if(selecciones[i].getGrupo()==grupo){
            System.out.println(selecciones[i]);
        }
      } 
    }
    
    public void agregarPartido(Partido partido){
        if(cantPartidos<partidos.length){
            partidos[cantPartidos]=partido;
            cantPartidos++;
        }
        
    }
    
    public int contarPartidos(){
        return cantPartidos;
    }
    
    public void eliminarPartido(String local, String visitante){
        for(int i=0; i< cantPartidos ; i++){
        
        if(partidos[i].getLocal().getNombreSele().equalsIgnoreCase(local) &&
                partidos[i].getVisitante().getNombreSele().equalsIgnoreCase(visitante)){
            
            for(int j=i; j< cantPartidos-1; j++){
                partidos[j]=partidos[j+1];
            }
            
            partidos[cantPartidos-1]=null;
            cantPartidos--;
            
            break;
        }
    }
  }
    
    
    public void mostrarPartidosSeleccion(String nombreSeleccion){
        for(int i=0; i<cantPartidos; i++){
            if(partidos[i].getLocal().getNombreSele().equalsIgnoreCase(nombreSeleccion)||
                    partidos[i].getVisitante().getNombreSele().equalsIgnoreCase(nombreSeleccion)){
                
                System.out.println(partidos[i]);
            }
                    
        }
    }
    
    public void buscarPartidosFecha(String fecha){
        for(int i=0; i<cantPartidos; i++){
            if(partidos[i].getFecha().equals(fecha)){
                System.out.println(partidos[i]);
            }
        }
        
    }
    
}
