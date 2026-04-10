
public class Operacion {
    // Primer método de sobrecarga 1: suma de 2 enteros
	
    int sumar(int a, int b) {
        return a + b;
    }

    // Segundo método de sobrecarga 2: suma de 2 decimales
    
    double sumar(double a, double b) {
        return a + b;
    }

    // Tercer método de sobrecarga: suma de 3 enteros
    
    int sumar(int a, int b, int c) {
        return a + b + c;
    }

	public static void main(String[] args) {
		
		Operacion sobrecarga = new Operacion();
		
		   System.out.println("Suma de 2 enteros: " + sobrecarga.sumar(5, 3));			// Enteros con 2 números
		   System.out.println("Suma de 2 decimales: " + sobrecarga.sumar(5.5, 3.8));	// Decimales
		   System.out.println("Suma de 3 enteros: " + sobrecarga.sumar(1, 2, 3));		// Enteros con 3 números
	}
	

}

//README
//Este es un pequeño programa donde se desarrollo la sobrecargade métodos mediante la creación de varios métodos con el mismo nombre, llamado (sumar))