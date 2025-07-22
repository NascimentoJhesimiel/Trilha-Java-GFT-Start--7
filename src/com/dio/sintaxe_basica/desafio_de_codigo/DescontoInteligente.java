package com.dio.sintaxe_basica.desafio_de_codigo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DescontoInteligente {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      // TODO: Leia o valor original do produto:
      double valorProduto = scanner.nextDouble();

      // TODO: Leia a porcentagem de desconto:
      double porcentagem = scanner.nextDouble();

      // TODO: Verifique se o desconto está dentro de um intervalo válido:
      if (porcentagem <= 0 || porcentagem > 100) {
         System.out.println("Desconto invalido");
      } else {
         double desconto = valorProduto * (porcentagem / 100);

         double valorFinal = valorProduto - desconto;

         DecimalFormat df = new DecimalFormat("0.00");
         System.out.println(df.format(valorFinal));
      }
   }
}
