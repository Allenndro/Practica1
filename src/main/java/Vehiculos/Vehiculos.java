public class Vehiculos {
  private String marca;
  private String modelo;
  private int anio;
  public Vehiculos(String marca, String modelo, int anio){
    this.marca = marca;
    this.modelo = modelo;
    this.anio = anio;
  }
  public void encender(){
    System.out.println("El vehiculo no enciende");
  }
}

public class Auto extends Vehiculos {
  private int KM;
}
public Auto(String marca, String modelo, int anio, int KM){
  super(marca, modelo, anio);
  this.KM = KM;
}

public void encender(){
  super.encender();
  System.out.println("El auto enciende");
}


