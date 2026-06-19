/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jugadores;
import personas.Persona;
import java.time.LocalDate;
/**
 *
 * @author isaac
 */
public class Jugador extends Persona{
    
   protected int numero;
   protected String posicion;
   
    public int getNumero() {
        return numero;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    
    
    
   public Jugador(String nombre, String nacionalidad, LocalDate fecha, int numero, String posicion){
       super(nombre,nacionalidad, fecha);
       this.numero=numero;
       this.posicion=posicion;
   }
   
   @Override
   public String toString(){
       return "Jugador: "+super.toString()+", Numero: "+numero+", Posicion: "+posicion;
   }
   
}
