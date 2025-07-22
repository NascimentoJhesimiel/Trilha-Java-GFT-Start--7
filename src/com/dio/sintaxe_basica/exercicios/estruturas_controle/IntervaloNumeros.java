package com.dio.sintaxe_basica.exercicios.estruturas_controle;

import java.util.Scanner;

public class IntervaloNumeros {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Digite o primeiro número:");
      int primeiroNumero = input.nextInt();

      System.out.println("Digite o segundo número (maior que o primeiro):");
      int segundoNumero = input.nextInt();

      // Validação para garantir que o segundo número seja maior
      while (segundoNumero <= primeiroNumero) {
         System.out.println("O segundo número deve ser maior que o primeiro. Digite novamente:");
         segundoNumero = input.nextInt();
      }

      System.out.println("Escolha uma opção:");
      System.out.println("1 - Números pares");
      System.out.println("2 - Números ímpares");
      int opcao = input.nextInt();

      // Validação da opção
      while (opcao != 1 && opcao != 2) {
         System.out.println("Opção inválida. Digite 1 para pares ou 2 para ímpares:");
         opcao = input.nextInt();
      }

      System.out.println();
      if (opcao == 1) {
         System.out.println("Números pares no intervalo (ordem decrescente):");
         for (int i = segundoNumero; i >= primeiroNumero; i--) {
            if (i % 2 == 0) {
               System.out.println(i);
            }
         }
      } else {
         System.out.println("Números ímpares no intervalo (ordem decrescente):");
         for (int i = segundoNumero; i >= primeiroNumero; i--) {
            if (i % 2 != 0) {
               System.out.println(i);
            }
         }
      }

      input.close();
   }
}
