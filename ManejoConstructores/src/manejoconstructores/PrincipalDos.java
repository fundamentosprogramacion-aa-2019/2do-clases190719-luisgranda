/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoconstructores;

/**
 *
 * @author Granda
 */
public class PrincipalDos {

    public static void main(String[] args) {

        Entrenador entrenador1 = new Entrenador("Rene", 35, "Fútbol");
        Entrenador entrenador2 = new Entrenador();
        
        System.out.printf("%s\n", entrenador1);
        System.out.printf("%s\n", entrenador2);
    }

}
