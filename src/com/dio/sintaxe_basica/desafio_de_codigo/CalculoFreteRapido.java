package com.dio.sintaxe_basica.desafio_de_codigo;

import java.util.Scanner;

public class CalculoFreteRapido {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      double pesoPacote = scanner.nextDouble();

      double valorFrete = scanner.nextDouble();

      double valorTotalFrete = pesoPacote * valorFrete;

      String valorDuasCasas = String.format("%.2f", valorTotalFrete);

      System.out.println(valorDuasCasas);

      scanner.close();
   }
}
