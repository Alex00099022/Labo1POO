//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    sumar(scanner);
                    break;
                case 2:
                    restar(scanner);
                    break;
                case 3:
                    multiplicar(scanner);
                    break;
                case 4:
                    dividir(scanner);
                    break;
                case 5:
                    System.out.println("Cerrando");
                    break;
                default:
                    System.out.println("no existe");
                    break;
            }
        } while (opcion != 5);

        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("Menú:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public static void sumar(Scanner scanner) {
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.println("Resultado: " + (num1 + num2));
    }

    public static void restar(Scanner scanner) {
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.println("Resultado: " + (num1 - num2));
    }

    public static void multiplicar(Scanner scanner) {
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.println("Resultado: " + (num1 * num2));
    }

    public static void dividir(Scanner scanner) {
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        if (num2 != 0) {
            System.out.println("Resultado: " + (num1 / num2));
        } else {
            System.out.println("No se puede dividir por cero.");
        }
    }
}