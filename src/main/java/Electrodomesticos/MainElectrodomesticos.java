
public class MainElectrodomesticos {
    public static void main(String[] args) {
        Televisor tv = new Televisor("Samsung", 0.1);
        Heladera hela = new Heladera("LG", 0.15);

        double horas = 5;

        tv.mostrarMarca();
        System.out.println("Consumo TV en " + horas + " horas: " + tv.calcularConsumo(horas) + " kWh");

        hela.mostrarMarca();
        System.out.println("Consumo Refrigerador en " + horas + " horas: " + hela.calcularConsumo(horas) + " kWh");
    }
}