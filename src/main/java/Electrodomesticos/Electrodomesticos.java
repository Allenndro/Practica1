interface Consumible {
    double calcularConsumo(double horasUso);
}


class Electrodomesticos {
    protected String marca;

    public Electrodomesticos(String marca) {
        this.marca = marca;
    }

    public void mostrarMarca() {
        System.out.println("Marca: " + marca);
    }
}


class Televisor extends Electrodomesticos implements Consumible {
    private double consumoPorHora;

    public Televisor(String marca, double consumoPorHora) {
        super(marca);
        this.consumoPorHora = consumoPorHora;
    }

    public double calcularConsumo(double horasUso) {
        return consumoPorHora * horasUso;
    }
}


class Heladera extends Electrodomesticos implements Consumible {
    private double consumoPorHora;

    public Heladera(String marca, double consumoPorHora) {
        super(marca);
        this.consumoPorHora = consumoPorHora;
    }

    public double calcularConsumo(double horasUso) {
        return consumoPorHora * horasUso;
    }
}


