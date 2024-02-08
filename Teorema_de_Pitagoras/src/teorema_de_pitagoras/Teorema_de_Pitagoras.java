package teorema_de_pitagoras;

import java.util.Scanner;

public class Teorema_de_Pitagoras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cateto1;
        int cateto2;
        int hipotenusa;
        int opcion;
        boolean salir = false;

        while (!salir) {
            System.out.println("Que desea calcular?");
            System.out.println("1. Hipotenusa");
            System.out.println("2. Cateto a");
            System.out.println("3. Cateto b");
            System.out.println("4. Salir");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.println("Ingrese la longitud del primer cateto:");
                cateto1 = scanner.nextInt();

                System.out.println("Ingrese la longitud del segundo cateto:");
                cateto2 = scanner.nextInt();

                if (cateto1 >= 0 && cateto2 >= 0) {
                    hipotenusa = (int) Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
                    System.out.println("La longitud de la hipotenusa es: " + hipotenusa);
                } else {
                    System.out.println("Error: Por favor ingrese valores positivos para los catetos.");
                }
            } else if (opcion == 2) {
                System.out.println("Ingrese la longitud de la hipotenusa:");
                hipotenusa = scanner.nextInt();

                System.out.println("Ingrese la longitud del otro cateto (b):");
                cateto2 = scanner.nextInt();

                if (hipotenusa >= 0 && cateto2 >= 0 && Math.pow(hipotenusa, 2) >= Math.pow(cateto2, 2)) {
                    int catetoA = (int) Math.sqrt(Math.pow(hipotenusa, 2) - Math.pow(cateto2, 2));
                    System.out.println("La longitud del cateto a es: " + catetoA);
                } else {
                    System.out.println("Error: Por favor ingrese valores positivos para la hipotenusa y el cateto b, y asegurese de que la hipotenusa sea mayor o igual que el cateto b.");
                }
            } else if (opcion == 3) {
                System.out.println("Ingrese la longitud de la hipotenusa:");
                hipotenusa = scanner.nextInt();

                System.out.println("Ingrese la longitud del otro cateto (a):");
                cateto1 = scanner.nextInt();

                if (hipotenusa >= 0 && cateto1 >= 0 && Math.pow(hipotenusa, 2) >= Math.pow(cateto1, 2)) {
                    int catetoB = (int) Math.sqrt(Math.pow(hipotenusa, 2) - Math.pow(cateto1, 2));
                    System.out.println("La longitud del cateto b es: " + catetoB);
                } else {
                    System.out.println("Error: Por favor ingrese valores positivos para la hipotenusa y el cateto a, y asegurese de que la hipotenusa sea mayor o igual que el cateto a.");
                }
            } else if (opcion == 4) {
                salir = true;
                System.out.println("Hasta luego!");
            } else {
                System.out.println("Opcion no valida. Por favor, seleccione una opcion valida.");
            }
        }
    }
}

