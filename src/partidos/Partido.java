/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partidos;

import arbitro.Arbitro;
import selecciones.Seleccion;

/**
 *
 * @author efrai
 */
public class Partido {
private Seleccion local;
private Seleccion visitante;
private String estadio;
private String fecha;
private String hora;
private Arbitro arbitro;
private String resultado;

public Partido(){
    
}
public Partido(Seleccion local, Seleccion visitante,
                   String estadio, String fecha, String hora,
                   Arbitro arbitro, String resultado){
    
  this.local=local;
  this.visitante=visitante;
  this.estadio=estadio;
  this.fecha=fecha;
  this.hora=hora;
  this.arbitro=arbitro;
  this.resultado=resultado;
}

    public void setLocal(Seleccion local) {
        this.local = local;
    }

    public void setVisitante(Seleccion visitante) {
        this.visitante = visitante;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setArbitro(Arbitro arbitro) {
        this.arbitro = arbitro;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Seleccion getLocal() {
        return local;
    }

    public Seleccion getVisitante() {
        return visitante;
    }

    public String getEstadio() {
        return estadio;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public Arbitro getArbitro() {
        return arbitro;
    }

    public String getResultado() {
        return resultado;
    }
    
    @Override
    public String toString(){
      return "Partido{" +
            "Local=" + local +
            ", Visitante=" + visitante +
            ", Estadio=" + estadio +
            ", Fecha=" + fecha +
            ", Hora=" + hora +
            ", Arbitro=" + arbitro +
            ", Resultado=" + resultado +
            '}';
}
}