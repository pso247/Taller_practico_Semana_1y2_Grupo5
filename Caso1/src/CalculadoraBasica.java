import java.util.Scanner;

public class CalculadoraBasica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1, num2, res=0;
		char operacion;
        Scanner scaner = new Scanner(System.in);

        System.out.println("Ingrese primer número:");
        num1 = scaner.nextDouble();

        System.out.println("Ingrese segundo número:");
        num2 = scaner.nextDouble();

        System.out.println("Seleccione operación (+, -, *, /):");
        operacion = scaner.next().charAt(0);

        switch (operacion) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
            	res = num1 - num2;
                break;
            case '*':
            	res = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                	res = num1 / num2;
                } else {
                    System.out.println("Error: división por cero");
                    return;
                }
                break;
            default:
                System.out.println("Operación no válida");
                return;
        }

        System.out.println("Resultado: " + res);
	}
	
}
