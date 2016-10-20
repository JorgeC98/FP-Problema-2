/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;
import java.util.*;
/**
 *Programa para convertir unamedida de metros a pies, yardas y millas
 * @author JorgeRicardo
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
    
    int metros;
    double pies,yardas,millas;
 
    metros=pedirMedida();
    pies = multiplicar1(metros);//convertir
    yardas = multiplicar2(metros);//convertir
    millas = multiplicar3(metros);//convertir
    mostrarResultado(pies,yardas,millas,metros);
     }
    
    public static int pedirMedida(){
    int metros;//aqui pregunto cuantos metros van a convertir
    Scanner teclado=new Scanner(System.in);
    System.out.println("Ingresar medida en metros a convertir: ");
    metros=teclado.nextInt();
    return metros;
    }
    
    public static double multiplicar1(int metros){
    return (metros*3.28084); //aqui convierto metros a pies
    }
    public static double multiplicar2(int metros){
    return(metros*1.09361); //aqui convierto metros a yardas
    }
    public static double multiplicar3(int metros){
    return (metros*0.00062137); //aqui convierto metros a millas
    }
    
    public static void mostrarResultado(double p,double y,double mi,int m){
         //aqui despliego los resultados
        System.out.println(m+"m a pies es: "+p+" pies");
        System.out.println(m+"m a yardas es: "+y+" yardas");
        System.out.println(m+"m a millas es: "+mi+" millas");
        
    }
}

    

