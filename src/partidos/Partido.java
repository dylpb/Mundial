/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partidos;

import arbitro.Arbitro;
import java.util.Scanner;
import java.util.Vector;
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

    public Partido() {

    }

    public Partido(Seleccion local, Seleccion visitante,
            String estadio, String fecha, String hora,
            Arbitro arbitro, String resultado) {

        this.local = local;
        this.visitante = visitante;
        this.estadio = estadio;
        this.fecha = fecha;
        this.hora = hora;
        this.arbitro = arbitro;
        this.resultado = resultado;
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
    //agregar arbitro

    public void agregarArbitros(String nombre) {
        Scanner teclado = new Scanner(System.in);
        Vector<String> ListaArbitros = new Vector<String>();
        do {
            System.out.println("Introdusca el nombre del arbitro");
            nombre = teclado.nextLine();
            if (!nombre.equalsIgnoreCase("fin")) {

                ListaArbitros.add(nombre);
            }
        } while (!nombre.equalsIgnoreCase("fin"));
    }

    public void eliminarArbitros(String nombre, Vector ListaArbitros, Scanner teclado) {
        System.out.println("Introdusca el nombre del arbitro");
         nombre = teclado.nextLine();
 if (ListaArbitros.remove(nombre) ){
     
System.out.println("La información del arbitro fue borrada");
 }else{
        System.out.println("El arbitro no existe");
    }

    }

    public void buscarArbitros(String nombre, Vector ListaArbitros, Scanner teclado, String nacionalidad) {
    System.out.println("Introdusca el nombre del arbitro");
         nombre = teclado.nextLine();
 if (ListaArbitros.contains(nombre) ){
System.out.println("La información del arbitro es: "+ nombre + nacionalidad);
 }else{
        System.out.println("El arbitro no existe");
    }
    }
    

    public void contarArbitros(Vector ListaArbitros) {
        System.out.println("\nLos nombres de todos los arbitros son:");
        for (int i = 0; i < ListaArbitros.size(); i++) {
            System.out.println((i + 1) + ". " + ListaArbitros.get(i));
        }
    }

    public void verificarArbitros (String nombre, Vector ListaArbitros, Scanner teclado) {
        System.out.println("Introdusca el nombre del arbitro");
         nombre = teclado.nextLine();
 if (ListaArbitros.contains(nombre) ){
System.out.println("El arbitro si esta registrado");
 }else{
        System.out.println("El arbitro no esta registrado");
    }
    }
    @Override
    public String toString() {
        return "Partido{"
                + "Local=" + local
                + ", Visitante=" + visitante
                + ", Estadio=" + estadio
                + ", Fecha=" + fecha
                + ", Hora=" + hora
                + ", Arbitro=" + arbitro
                + ", Resultado=" + resultado
                + '}';
    }
}
