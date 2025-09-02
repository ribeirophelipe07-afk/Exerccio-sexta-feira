/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ph;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author phelipe.ramenezes
 */
public class Ph {

    public static void main(String[] args) {
        System.out.println("Mundo pizza!");
    
    
       double valor;
       double distancia;
       double total;
       String nome; 
       
       Scanner escrever = new Scanner (in);
       
      
             
       
       
        System.out.println("qual seu nome?");
        nome = escrever.next();
        System.out.println( nome + " qual o preco da sua pizza?");
        valor = escrever.nextDouble();
        System.out.println("voce mora a quantos KM de distancia?");
        distancia = escrever.nextDouble();
        total = valor + 2 * distancia;
        System.out.println("o total que o SR. tera que pagar junto com o frete sao de:" + " R$" + total );
              
    
    
    
    
    
    
    
    }
}
