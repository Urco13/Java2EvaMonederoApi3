/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evamonederoapi3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author urco1
 */
public class Utilidades {
    static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    
    public Utilidades(){};
    
    public static double leerTexto(String texto) throws IOException{
        double datosLectura = 0;
        int sw=1;
        do{
            sw=1;
        try {
            System.out.println(texto);
            datosLectura=Integer.parseInt(bufer.readLine());
        } catch (NumberFormatException ex) {
            System.out.println("Error");
            sw=0;
     } //catch (Exception ex) {
//            System.out.println("Error2");
//            sw=0;
//        }
        }while(sw==0);
        return datosLectura;
    }

    
    
}
