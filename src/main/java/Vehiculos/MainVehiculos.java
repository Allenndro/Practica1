package Vehiculos;

public class MainVehiculos {
  public static void main(String[] args) {
    Vehiculos miVehiculo = new Vehiculos("Toyota", "Corolla", 2020);
    miVehiculo.encender();
    Carro miCarro = new Carro("Toyota", "Corolla", 2020, 50000);
    miCarro.encender();
  }
}
