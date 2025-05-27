
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa tu nota: ");
        int nota = scanner.nextInt();

        if (nota >= 9) {
            System.out.println("Avanzado");
        }
        else if (nota <= 8 && nota >= 6) {
            System.out.println("Suficiente");
        }
        else if (nota <= 5) {
            System.out.println("En Proceso");
        }
        
        scanner.close();
    }
}
