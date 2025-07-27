package com.dio.POO.exercicios.abtracao_encapsulamento.exercicios;

public class Petshop {
   private int nivelAgua = 0;
   private int nivelShampoo = 0;
   private boolean petNaMaquina = false;
   private boolean petLimpo = false;
   private boolean maquinaSuja = false;

   public String abastecerAgua() {
      if (nivelAgua + 2 > 30) {
         nivelAgua = 30;
         return "Tanque de água cheio (30L).";
      }
      nivelAgua += 2;
      return "Abastecido com 2L de água. Nível atual: " + nivelAgua + "L.";
   }

   public String abastecerShampoo() {
      if (nivelShampoo + 2 > 10) {
         nivelShampoo = 10;
         return "Tanque de shampoo cheio (10L).";
      }
      nivelShampoo += 2;
      return "Abastecido com 2L de shampoo. Nível atual: " + nivelShampoo + "L.";
   }

   public void getNivelAgua() {
      System.out.println(nivelAgua);
   }

   public void getNivelShampoo() {
      System.out.println(nivelShampoo);
   }

   public boolean isPetNaMaquina() {
      return petNaMaquina;
   }

   public String colocarPetNaMaquina() {
      if (petNaMaquina) return "Já existe um pet na máquina.";
      if (maquinaSuja) return "A máquina está suja. Realize a limpeza antes de colocar outro pet.";
      petNaMaquina = true;
      petLimpo = false;
      return "Pet colocado na máquina.";
   }

   public String retirarPetDaMaquina() {
      if (!petNaMaquina) return "Não há pet na máquina.";
      String msg = petLimpo ? "Pet retirado limpo." : "Pet retirado sujo. Máquina precisa de limpeza.";
      petNaMaquina = false;
      if (!petLimpo) maquinaSuja = true;
      petLimpo = false;
      return msg;
   }

   public String darBanho() {
      if (!petNaMaquina) return "Não há pet na máquina.";
      if (petLimpo) return "O pet já está limpo.";
      if (nivelAgua < 10) return "Água insuficiente para o banho.";
      if (nivelShampoo < 2) return "Shampoo insuficiente para o banho.";
      if (maquinaSuja) return "A máquina está suja. Realize a limpeza antes do banho.";
      nivelAgua -= 10;
      nivelShampoo -= 2;
      petLimpo = true;
      return "Banho realizado com sucesso!";
   }

   public String limparMaquina() {
      if (!maquinaSuja) return "A máquina já está limpa.";
      if (nivelAgua < 3) return "Água insuficiente para limpeza.";
      if (nivelShampoo < 1) return "Shampoo insuficiente para limpeza.";
      nivelAgua -= 3;
      nivelShampoo -= 1;
      maquinaSuja = false;
      return "Máquina limpa com sucesso!";
   }
}
