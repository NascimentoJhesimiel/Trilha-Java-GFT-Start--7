package com.dio.sintaxe_basica.exercicios.fundamentos_linguagem;

import java.util.Calendar;
import java.util.Scanner;

public class ImprimeNomeEIdade {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Digite seu nome:");
      String nome = input.next();

      System.out.println("Digite seu ano de nascimento");
      int anoNascimento = input.nextInt();

      while (anoNascimento <= 1850) {
         System.out.println("Idade invalida");
         anoNascimento = input.nextInt();
      }
      Calendar calendario = Calendar.getInstance();
      int idade = calendario.get(Calendar.YEAR) - anoNascimento;
      System.out.println("Ola " + nome +  " voce tem: " + idade);
   }
}
