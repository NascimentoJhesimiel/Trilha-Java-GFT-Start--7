package com.dio.sintaxe_basica.exercicios.estruturas_controle;

import java.util.Scanner;

public class RestoDivisao {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Informe um numero");
      int numeroInicial = input.nextInt();

      System.out.println("Informe outro numero ");
      int numeroPosterior = input.nextInt();

      while (!(numeroPosterior % numeroInicial == 0) || numeroPosterior <= numeroInicial) {
         if (numeroPosterior > numeroInicial && !(numeroPosterior % numeroInicial == 0)) {
            System.out.println();
            System.out.println("O numero posterior deve permitir que o resto da divisao com o primeiro resulte em 0, tente novamente");
            numeroPosterior = input.nextInt();
         }
         if (numeroPosterior < numeroInicial) {
            System.out.println("Tente um numero maior que o primeiro");
            System.out.println();
            numeroPosterior = input.nextInt();
         }
      }

      System.out.println("Voce conseguiu! Fim do programa");
      input.close();
   }
}
