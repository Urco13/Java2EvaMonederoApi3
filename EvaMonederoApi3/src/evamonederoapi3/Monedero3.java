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
 * @author dam115
 */
public class Monedero3 {

    private double saldo;
    //constructor
    public Monedero3(){
    }
    ///Cantidad Inicial
    public Monedero3(double cantidadInicial)throws ErrorCantidadInicialException{
        if (cantidadInicial>0) {
            this.saldo=cantidadInicial;
        }else{
            throw new ErrorCantidadInicialException("La cantidad no puede ser menor de cero");
        }
    }//fin cantidad inicial
    
    
    ///Ingreso
    void ingreso(Double ingreso)throws ErrorIngresarDineroException{
        if (ingreso>0) {
            this.saldo+=ingreso;
        }else
            throw new ErrorIngresarDineroException("No puedes ingresar menos de 0");
    }
    
    ///Retirar Dinero
    void retirar(Double sacarDinero)throws ErrorRetirarDineroException{
        if(sacarDinero>0&&this.saldo<=sacarDinero){
           this.saldo-=sacarDinero;
        }else{
            throw new ErrorRetirarDineroException("No puedes sacar mas dinero del que hay en la cartera");
        }
    }
    //ver saldo
    void verSaldo(){
        System.out.println(this.saldo);
    }
}//fin class
