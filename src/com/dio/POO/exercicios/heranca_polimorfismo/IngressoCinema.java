package com.dio.POO.exercicios.heranca_polimorfismo;

public class IngressoCinema {
  protected double value;
  private String name;
  private String subtitles;

  public IngressoCinema(double value, String name, String subtitles) {
    this.value = value;
    this.name = name;
    this.subtitles = subtitles;
  }

  public double getValue() {
    return value;
  }


  public String getName() {
    return name;
  }


  public String getSubtitles() {
    return subtitles;
  }


  public static void main(String[] args) {
   MeiaEntrada meia = new MeiaEntrada(25,
                                       "Filme 1",
                                     "Dublado");
    System.out.println(meia.getValue());
    Familia familia = new Familia(40, "Filme2", "legendado", 2);
    System.out.println(familia.getValue());
  }
}

final class MeiaEntrada extends IngressoCinema{

  public MeiaEntrada(double value, String name, String subtitles) {
    super(value, name, subtitles);
  }

  @Override
  public double getValue() {
    return super.getValue() * 0.5;
  }

}

class Familia extends IngressoCinema {

  private int familyMembers;

  public Familia(double value, String name, String subtitles, int familyMembers) {
    super(value, name, subtitles);
    this.familyMembers = familyMembers;
  }

  public int getFamilyMembers() {
    return familyMembers;
  }

  public void setFamilyMembers(int familyMembers) {
    this.familyMembers = familyMembers;
  }

  @Override
  public double getValue() {
    double total = this.value * familyMembers;
    return familyMembers > 3 ? total * 0.95 : total;
  }
}
