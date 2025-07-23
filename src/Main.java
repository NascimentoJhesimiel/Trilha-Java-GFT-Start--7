import com.dio.POO.abtracao_encapsulamento.exercicios.ContaBancaria;


public class Main {
   public static void main(String[] args) {
      ContaBancaria minhaConta = new ContaBancaria(300.00);

      System.out.println(minhaConta.getBalance());

      minhaConta.depositMoney(100);

      System.out.println(minhaConta.getBalance());
      }
   }