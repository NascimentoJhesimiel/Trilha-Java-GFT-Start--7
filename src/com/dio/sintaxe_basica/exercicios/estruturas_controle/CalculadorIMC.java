package com.dio.sintaxe_basica.exercicios.estruturas_controle;


import java.util.Scanner;

public class CalculadorIMC {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Declare seu peso (Kg): ");
      double peso = input.nextDouble();

      while (peso <= 0) {
         System.out.println("Entrada invalida, insira um valor valido");
         peso = input.nextDouble();
      }

      System.out.println("Declare sua altura em cm: ");
      double altura = input.nextDouble();

      while (altura <= 45.0) {
         System.out.println("Altura nao valida, tente novamente");
         altura = input.nextDouble();
      }
      double alturaEmDuasCasasDecimais = (altura * 0.10) * 0.10;

      double IMC = peso / (alturaEmDuasCasasDecimais * alturaEmDuasCasasDecimais);

      if (IMC <= 18.5) {
         System.out.println("Abaixo do peso");
      } else if (IMC <= 18.6 && IMC <= 24.9) {
         System.out.println("Peso ideal");
      }  else if (IMC <= 25.0 && IMC <= 29.9) {
         System.out.println("Levemente Acima do peso");
      }  else if (IMC <= 30.0 && IMC <= 34.9) {
         System.out.println("Obesidade Grau I");
      }  else if (IMC <= 35.0 && IMC <= 39.9) {
         System.out.println("Obesidade Grau II (Severa)");
      } else {
         System.out.println("Obesidade III (Morbida)");
      }

      input.close();
   }
}
