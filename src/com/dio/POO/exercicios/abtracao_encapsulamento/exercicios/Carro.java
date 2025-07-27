//package com.dio.POO.exercicios.abtracao_encapsulamento.exercicios;
//
//public class Carro {
//  private boolean ignicao;
//
//  private int velocidade;
//
//  private String direction;
//
//  private int marcha;
//
//  public Carro() {
//    ignicao = false;
//    velocidade = 0;
//    marcha = 0;
//    direction = "reto";
//  }
//
//  public String ligar() {
//    if (!ignicao && marcha == 0 && velocidade == 0) {
//      ignicao = true;
//      return "Carro ligado.";
//    }
//    return "Não é possível ligar o carro.";
//  }
//
//  public String desligar() {
//    if (ignicao && marcha == 0 && velocidade == 0) {
//      ignicao = false;
//      return "Carro desligado.";
//    }
//    return "Não é possível desligar o carro. Reduza a velocidade para 0 e coloque em ponto morto.";
//  }
//
//  public String acelerar() {
//    if (!ignicao) return "Carro desligado.";
//    if (marcha == 0) return "Não é possível acelerar em ponto morto.";
//    if (velocidade >= 120) return "Velocidade máxima atingida.";
//    int maxVel = getMaxVelocidadePorMarcha();
//    if (velocidade + 1 > maxVel) return "Troque de marcha para acelerar mais.";
//    velocidade++;
//    return "Acelerando. Velocidade: " + velocidade + " km/h";
//  }
//
//  public String desacelerar() {
//    if (!ignicao) return "Carro desligado.";
//    if (velocidade == 0) return "Carro já está parado.";
//    velocidade--;
//    return "Desacelerando. Velocidade: " + velocidade + " km/h";
//  }
//
//  public String virar(String direcao) {
//    if (!ignicao) return "Carro desligado.";
//    if (velocidade < 1 || velocidade > 40) return "Só é possível virar entre 1km/h e 40km/h.";
//    if (!direcao.equalsIgnoreCase("esquerda") && !direcao.equalsIgnoreCase("direita")) return "Direção inválida.";
//    direction = direcao.toLowerCase();
//    return "Virando para " + direction;
//  }
//
//  public String trocarMarcha(int novaMarcha) {
//    if (!ignicao) return "Carro desligado.";
//    if (novaMarcha < 0 || novaMarcha > 6) return "Marcha inválida.";
//    if (Math.abs(novaMarcha - marcha) != 1) return "Só é permitido trocar para a marcha imediatamente acima ou abaixo.";
//    if (!velocidadeCompativelComMarcha(novaMarcha)) return "Velocidade incompatível com a marcha.";
//    marcha = novaMarcha;
//    return "Marcha atual: " + marcha;
//  }
//
//  public int getVelocidade() {
//    return velocidade;
//  }
//
//  public int getMarcha() {
//    return marcha;
//  }
//
//  public String getStatus() {
//    return ignicao ? "Ligado" : "Desligado";
//  }
//
//  private int getMaxVelocidadePorMarcha() {
//    switch (marcha) {
//      case 1:
//        return 20;
//      case 2:
//        return 40;
//      case 3:
//        return 60;
//      case 4:
//        return 80;
//      case 5:
//        return 100;
//      case 6:
//        return 120;
//      default:
//        return 0;
//    }
//  }
//
//  private boolean velocidadeCompativelComMarcha(int marcha) {
//    switch (marcha) {
//      case 0:
//        return velocidade == 0;
//      case 1:
//        return velocidade >= 0 && velocidade <= 20;
//      case 2:
//        return velocidade >= 21 && velocidade <= 40;
//      case 3:
//        return velocidade >= 41 && velocidade <= 60;
//      case 4:
//        return velocidade >= 61 && velocidade <= 80;
//      case 5:
//        return velocidade >= 81 && velocidade <= 100;
//      case 6: return velocidade >= 101 && velocidade <= 120;
//    }
//}
