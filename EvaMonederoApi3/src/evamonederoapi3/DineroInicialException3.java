/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evamonederoapi3;

/**
 *
 * @author dam115
 */
public class DineroInicialException3 extends Exception{
    private int error;
    public DineroInicialException3(int error){
        this.error=error;
    }
       
    @Override
         public String getMessage(){
           switch (this.error) {
            case 1:return "error 1 No pueder";
            case 2:return "error 2 No ingresar";
            case 3:return "error 3";
            default: return "";
        }
  
         }
         
}
