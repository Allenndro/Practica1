package Lampara;

public class Main {
  public static void main(String[] args) {
    Lampara lampara = new Lampara();
    lampara.setColor("Blanco");
    lampara.setIntensidad("Media");
    lampara.setEncendida(false);
    lampara.encender();
    lampara.mostrarEstado();
    lampara.apagar();
    lampara.mostrarEstado();
    lampara.encender();
    lampara.mostrarEstado();
    lampara.apagar();
    lampara.mostrarEstado();
  }
}


  