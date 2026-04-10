import java.util.Scanner;

public class Calculadora {

    // Usando metodo
    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("No se puede dividir entre 0");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1, num2;
        int opcion;

        System.out.print("Ingresa el primer número: ");
        num1 = sc.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        num2 = sc.nextDouble();

        System.out.println("Elige operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        opcion = sc.nextInt();

        double resultado = 0;

        // Condicional ( usando switch)
        switch(opcion) {
            case 1:
                resultado = sumar(num1, num2);
                break;
            case 2:
                resultado = restar(num1, num2);
                break;
            case 3:
                resultado = multiplicar(num1, num2);
                break;
            case 4:
                resultado = dividir(num1, num2);
                break;
            default:
                System.out.println("Opción inválida");
                return;
        }

        System.out.println("Resultado: " + resultado);
        sc.close();
    }
}