package com.dio.sintaxe_basica.exercicios.fundamentos_linguagem;

import java.util.Scanner;

public class DiferencaIdade {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Digite a primeira idade: ");
      int idade1 = input.nextInt();

      System.out.println("Digite a segunda idade: ");
      int idade2 = input.nextInt();

      System.out.println("A diferenca de idades eh: " + Math.abs(idade1 - idade2));
      input.close();
   }
}
