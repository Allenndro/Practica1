public class MainVehiculos {
  public static void main(String[] args) {
    Vehiculos miVehiculo = new Vehiculos("Toyota", "Corolla", 2020);
    miVehiculo.encender();
    Auto miAuto = new Auto("Toyota", "Corolla", 2020, 50000);
    miAuto.encender();
  }
}
