
import java.util.Scanner;

public class Formula_General {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        int a, b, c, residuo;

        System.out.println("1a. Parte: Resolver la fórmula general");

        // Repetir N veces
        System.out.print("Ingrese el número de ecuaciones a resolver (N): ");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Ecuación " + (i + 1));

            // Solicitar valores de A, B y C
            System.out.print("Ingrese el valor de A: ");
            a = scanner.nextInt();
            System.out.print("Ingrese el valor de B: ");
            b = scanner.nextInt();
            System.out.print("Ingrese el valor de C: ");
            c = scanner.nextInt();

            // Calcular residuo
            residuo = b * b - 4 * a * c;

            // Validar si hay raíces imaginarias
            if (residuo < 0) {
                System.out.println("Raíz imaginaria");
            } else {
                // Calcular y mostrar resultados de X1 y X2
                double x1 = (-b + Math.sqrt(residuo)) / (2.0 * a);
                double x2 = (-b - Math.sqrt(residuo)) / (2.0 * a);

                System.out.println("X1 = " + x1);
                System.out.println("X2 = " + x2);
            }
        }

   
        scanner.close();
    }
}
