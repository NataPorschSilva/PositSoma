
package com.mycompany.positsoma;

import java.util.Scanner;

/**
 *
 * @author Natã
 */
public class PositSoma {

    public static void main(String[] args) {
        
        System.out.println("Digite um número inteiro positivo:");
        
        Scanner teclado = new Scanner(System.in);
        
        int limite = teclado.nextInt();
        int soma = 0;
        int contador = 1;        
      
        do{
            soma += contador;
            System.out.println(contador);
            contador++;
            
        }while(contador <= limite);
        System.out.println("A soma dos números " + limite + " é: " + soma);
        }
    }

