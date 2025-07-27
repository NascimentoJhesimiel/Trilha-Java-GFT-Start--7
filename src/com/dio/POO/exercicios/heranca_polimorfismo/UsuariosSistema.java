package com.dio.POO.exercicios.heranca_polimorfismo;

public class UsuariosSistema {
  private String name;
  private String email;
  private String password;
  protected boolean isAdmin;

  public UsuariosSistema() {}

  public UsuariosSistema(String name, String email, String password, boolean isAdmin) {
    this.name = name;
    this.email = email;
    this.password = password;
    this.isAdmin = isAdmin;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public boolean isAdmin() {
    return isAdmin;
  }

  // Métodos comuns
  public void realizarLogin() {
    System.out.println(name + " realizou login no sistema");
  }

  public void realizarLogoff() {
    System.out.println(name + " realizou logoff do sistema");
  }

  public void alterarDados(String novoNome, String novoEmail) {
    this.name = novoNome;
    this.email = novoEmail;
    System.out.println("Dados alterados com sucesso");
  }

  public void alterarSenha(String novaSenha) {
    this.password = novaSenha;
    System.out.println("Senha alterada com sucesso");
  }
}

final class Gerente extends UsuariosSistema {

  public Gerente() {
    super();
    this.isAdmin = true;
  }

  public Gerente(String name, String email, String password) {
    super(name, email, password, true);
  }

  public void gerarRelatorioFinanceiro() {
    System.out.println("Relatório financeiro gerado pelo gerente " + getName());
  }

  public void consultarVendas() {
    System.out.println("Gerente " + getName() + " consultou as vendas");
  }
}

class Vendedor extends UsuariosSistema {
  private int quantidadeVendas;

  public Vendedor() {
    super();
    this.isAdmin = false; // Sempre falso
    this.quantidadeVendas = 0;
  }

  public Vendedor(String name, String email, String password) {
    super(name, email, password, false);
    this.quantidadeVendas = 0;
  }

  public int getQuantidadeVendas() {
    return quantidadeVendas;
  }

  public void realizarVenda() {
    this.quantidadeVendas++;
    System.out.println("Venda realizada! Total de vendas: " + quantidadeVendas);
  }

  public void consultarVendas() {
    System.out.println("Vendedor " + getName() + " possui " + quantidadeVendas + " vendas");
  }
}