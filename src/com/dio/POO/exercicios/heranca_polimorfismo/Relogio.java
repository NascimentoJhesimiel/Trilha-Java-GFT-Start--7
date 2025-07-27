package com.dio.POO.exercicios.heranca_polimorfismo;

public abstract class Relogio {
  private int hora;
  private int minuto;
  private int segundo;

  public Relogio() {
    this.hora = 0;
    this.minuto = 0;
    this.segundo = 0;
  }

  public Relogio(int hora, int minuto, int segundo) {
    setHora(hora);
    setMinuto(minuto);
    setSegundo(segundo);
  }

  public int getHora() {
    return hora;
  }

  public void setHora(int hora) {
    if (hora >= 0 && hora <= 23) {
      this.hora = hora;
    } else {
      throw new IllegalArgumentException("Hora deve estar entre 0 e 23");
    }
  }

  public int getMinuto() {
    return minuto;
  }

  public void setMinuto(int minuto) {
    if (minuto >= 0 && minuto <= 59) {
      this.minuto = minuto;
    } else {
      throw new IllegalArgumentException("Minuto deve estar entre 0 e 59");
    }
  }

  public int getSegundo() {
    return segundo;
  }

  public void setSegundo(int segundo) {
    if (segundo >= 0 && segundo <= 59) {
      this.segundo = segundo;
    } else {
      throw new IllegalArgumentException("Segundo deve estar entre 0 e 59");
    }
  }

  public String getHoraFormatada() {
    return String.format("%02d:%02d:%02d", hora, minuto, segundo);
  }

  public abstract void sincronizarCom(Relogio outroRelogio);
}
class RelogioBrasileiro extends Relogio {

  public RelogioBrasileiro() {
    super();
  }

  public RelogioBrasileiro(int hora, int minuto, int segundo) {
    super(hora, minuto, segundo);
  }

  @Override
  public void sincronizarCom(Relogio outroRelogio) {
    this.setHora(outroRelogio.getHora());
    this.setMinuto(outroRelogio.getMinuto());
    this.setSegundo(outroRelogio.getSegundo());
    System.out.println("Relógio brasileiro sincronizado: " + this.getHoraFormatada());
  }

  @Override
  public String getHoraFormatada() {
    return super.getHoraFormatada() + " (BR)";
  }
}

class RelogioAmericano extends Relogio {

  public RelogioAmericano() {
    super();
  }

  public RelogioAmericano(int hora, int minuto, int segundo) {

    super(hora > 12 ? hora - 12 : (hora == 0 ? 12 : hora), minuto, segundo);
  }

  @Override
  public void setHora(int hora) {
    if (hora >= 1 && hora <= 12) {
      super.setHora(hora);
    } else {
      throw new IllegalArgumentException("Hora deve estar entre 1 e 12 para relógio americano");
    }
  }

  @Override
  public void sincronizarCom(Relogio outroRelogio) {
    int horaOriginal = outroRelogio.getHora();
    int horaConvertida;

    if (horaOriginal == 0) {
      horaConvertida = 12; // Meia-noite = 12 AM
    } else if (horaOriginal > 12) {
      horaConvertida = horaOriginal - 12; // PM
    } else {
      horaConvertida = horaOriginal; // AM
    }

    super.setHora(horaConvertida);
    this.setMinuto(outroRelogio.getMinuto());
    this.setSegundo(outroRelogio.getSegundo());

    String periodo = horaOriginal < 12 ? "AM" : "PM";
    System.out.println("Relógio americano sincronizado: " + this.getHoraFormatada() + " " + periodo);
  }

  @Override
  public String getHoraFormatada() {
    return super.getHoraFormatada() + " (US)";
  }
}
