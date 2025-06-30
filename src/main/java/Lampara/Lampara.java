public class Lampara {
    private String color;
    private String intensidad;
    private boolean encendida;

    public Lampara() {
    }

    public Lampara(String color, String intensidad, boolean encendida) {
        this.color = color;
        this.intensidad = intensidad;
        this.encendida = encendida;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setIntensidad(String intensidad) {
        this.intensidad = intensidad;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }

    public void encender() {
        if (encendida) {
            System.out.println("La lámpara ya está encendida con una intensidad " + intensidad + " y de color " + color);
        } else {
            encendida = true;
            System.out.println("La lámpara se encendió");
        }
    }

    public void apagar() {
        if (!encendida) {
            System.out.println("La lámpara ya está apagada");
        } else {
            encendida = false;
            System.out.println("La lámpara se apagó");
        }
    }

    public void mostrarEstado() {
        if (encendida) {
            System.out.println("La lámpara está encendida");
        } else {
            System.out.println("La lámpara está apagada");
        }
    }
}
