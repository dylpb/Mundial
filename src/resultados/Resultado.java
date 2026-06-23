/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resultados;

/**
 *
 * @author efrai
 */
public class Resultado {
    private int golesLocal;
    private int golesVisitante;
   
    
    
    public Resultado (int golesLocal, int golesVisitante ){
        this.golesLocal= golesLocal;
        this.golesVisitante= golesVisitante;   
}

    public int getGolesLocal() {
        return golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }
   
    public boolean determinarEmpate(){
        if (this.golesLocal == this.golesVisitante){
            return true;
        }else{
            return false; 
        }
    }
    
   public int calcularDiferenciaGoles(){
       return this.golesLocal - this.golesVisitante;
   }
   
   public int obtenerTotalesGoles(){
       return this.golesLocal + this.golesVisitante;
   }
   
   public boolean ambosEquiposAnotaron(){
     if (this.golesLocal > 0 && this.golesVisitante > 0){  
         return true;
   }else{
    return false;
}
   }

   public String indentificarGanador(){
       if (this.golesLocal > this.golesVisitante){
           return "Local";
       }else if (this.golesVisitante > this.golesLocal){
           return "Visitante";
       }else{
           return "Empate:";
       }
   }
}
   
