
public class Main {
    public static void main(String[] args) {
        int nota = 10;

        if (nota >= 9) {
            System.out.println("Avanzado");
        }
        else if (nota <= 8 && nota >= 6) {
            System.out.println("Suficiente");
        }
        else if (nota <= 5) {
            System.out.println("En Proceso");
        }
    }
}
