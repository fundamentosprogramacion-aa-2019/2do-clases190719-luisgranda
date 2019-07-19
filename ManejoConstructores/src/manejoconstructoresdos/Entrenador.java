/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoconstructoresdos;

import manejoconstructores.*;

/**
 *
 * @author Granda
 */
public class Entrenador {
    private String nombre;
    private int edad;
    private String deporte;
    private double salario;
    private Equipo equipo;
    
    /*public Entrenador(){
        establecerNombre("Luis");
        establecerEdad(20);
        establecerDeporte("Fútbol");
    }*/
    
    public Entrenador(String n, int e, String dep, double sal, Equipo eq){
        establecerNombre(n);
        establecerEdad(e);
        establecerDeporte(dep);
        establecerSalario(sal);
        establecerEquipo(eq);
    }
    public void establecerNombre(String e){
        nombre = e;
    }
    public void establecerEdad(int e){
        edad = e;
    }
    public void establecerDeporte(String f){
        deporte = f;
    }
    public void establecerSalario(double s){
        salario = s;
    }
    public void establecerEquipo(Equipo e){
        equipo = e;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public int obtenerEdad(){
        return edad;
    }
    public String obtenerDeporte(){
        return deporte;
    }
    public double obtenerSalario(){
        return salario;
    }
    public Equipo obtenerEquipo(){
        return equipo;
    }
    public String toString(){
        String cadena = String.format("Entrenador:%n\tNombre:%s\n\t"
                + "Deporte:%s\n\tEquipo: %s\n\tProvincia: %s\n", 
                obtenerNombre(), obtenerDeporte(), 
                obtenerEquipo().obtenerNombre(), 
                obtenerEquipo().obtenerCiudad().obtenerProvincia());
        return cadena;
    }
}
