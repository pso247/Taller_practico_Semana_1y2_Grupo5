
public class Contador {
	private static int contador=0;
	public Contador(){
		contador++;
	}
	public static int getContador() {
		return contador;
	}
	

	public static void main(String[] args) {
		new Contador ();
		new Contador ();
		new Contador ();
		new Contador ();
		System.out.println("Objetos Creados : "+ Contador.getContador());

	}

}
