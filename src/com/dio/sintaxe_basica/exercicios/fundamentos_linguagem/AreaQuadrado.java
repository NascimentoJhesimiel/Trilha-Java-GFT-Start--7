package com.dio.sintaxe_basica.exercicios.fundamentos_linguagem;

import java.util.Scanner;

public class AreaQuadrado {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Detemine o lado o quadrado: ");
      double ladoQuadrado = input.nextDouble();

      while (ladoQuadrado <= 0) {
         System.out.println("Tamanhos negativos nao sao validos");
         ladoQuadrado = input.nextDouble();
      }

      System.out.println("A area do quadrado eh: " + (Math.pow(ladoQuadrado, 2)));

      input.close();
   }
}
