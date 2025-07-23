package com.dio.POO.abtracao_encapsulamento.exercicios;

public class ContaBancaria {

   private int idAccount;

   private double balance;

   private double chequeEspecial;

   public ContaBancaria(double deposit) {
       balance = deposit;
       chequeEspecial = balance * 0.10;
   }

   public double getBalance() {
      return balance + chequeEspecial;
   }

   public void depositMoney(double money) {
      balance += money;
   }

   public String withdrawMoney(double money) {
      money -= balance;
      return "Voce sacou: R$" + money + " da sua conta";
   }

   public String payBill(double cost) {
      return "Voce pagou o boleto de valor: " + cost;
   }
}
