package com.dio.sintaxe_basica.exercicios.estruturas_controle;

import java.util.Scanner;

public class Tabuada {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Digite um numero de 1-10:");
      int multiplicando = input.nextInt();

      while (multiplicando > 10) {
         System.out.println("Numero invalido, escolha entre 1-10:");
         multiplicando = input.nextInt();
      }
      System.out.println(" ");
      System.out.println("Tabuada de: " + multiplicando);
      for (int i = 1; i <= 10; i++) {
         System.out.println(multiplicando + " x " + i + " = " + (multiplicando * i));
      }

      input.close();
   }
}
