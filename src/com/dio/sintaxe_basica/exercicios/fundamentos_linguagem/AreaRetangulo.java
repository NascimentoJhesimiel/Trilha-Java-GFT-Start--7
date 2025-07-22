package com.dio.sintaxe_basica.exercicios.fundamentos_linguagem;

import java.util.Scanner;

public class AreaRetangulo {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Determine a base do retangulo");
      double baseRetangulo = input.nextDouble();

      while (baseRetangulo <= 0) {
         System.out.println("Valor invalido, tente novamente");
         baseRetangulo = input.nextDouble();
      }

      System.out.println("Determine a altura do retangulo");
      double alturaRetangulo = input.nextDouble();

      while (alturaRetangulo <= 0) {
         System.out.println("Valor invalido, tente novamente");
         alturaRetangulo = input.nextDouble();
      }

      System.out.println("A area do retangulo eh: " + (baseRetangulo * alturaRetangulo));
      input.close();
   }
}
