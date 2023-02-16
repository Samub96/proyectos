package ui;
import java.util.Scanner;
public class Seguimineto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean exit = false;
		
		while (!exit) {
			
			System.out.println("seguimineto" 
								+ "\n seleciona un punto"
								+ "\n [1] punto 1"
								+ "\n [2] punto 2"
								+ "\n [3] punto 3"
								+ "\n [4] punto 4"
								+ "\n [5] punto 5"
								+ "\n [6] Exit");
			
			int punto = sc.nextInt();
		
			switch (punto) {
			
			case 1:
				System.out.println("Elegiste el punto 1"
									+ "\n Sumar array de forma recursiva \r\n"
									+ " \n Cree un método llamado sum que reciba un arreglo de enteros y que calcule la sumatoria de todos los numeros del arreglo. \r\n"
									+ "El metodo debe devolver un entero.\r\n"
									+ "");
				
				
				
				break;
				
			case 2:
				System.out.println("Elegiste el punto 2"
									+ " \n Revertir un String. \r\n	"
									+ "Desarrolle un método recursivo que permita revertir un String de entrada. \r\n");
				
				break;
			case 3:
				System.out.println("Elegiste el punto 3"
									+ "\n Promedio del array\r\n"
									+ "Desarrolle a partir del ejercicio del punto 1 un método prom, que permita sacar el promedio del arreglo. El método debe devolver un double \r\n");
				
				break;
				
			case 4:
				System.out.println("Elegiste el punto 4"
									+ "\n Posición de un elemento en el arreglo \r\n"
									+ "\n Dado un arreglo de entrada y un número, el programa devuelve la posición de ese número en el arreglo. Si hay más de una coincidencia, devuelva el primero que encuentre \r\n");
				break;
				
			case 5:
				System.out.println("Elegiste el punto 5"
									+ "\n Capacidad de la maleta \r\n"
									+ "\n Hay una maleta con una cantidad límite de peso de 500g. Su objetivo es llenar la maleta con exactamente el peso límite. \r\n"
									+ "Tiene los siguientes objetos a disposición:\r\n"
									+ "a.Lonchera: 250g\r\n"
									+ "b. Computador: 200g\r\n"
									+ "c. Cuaderno: 100g\r\n"
									+ "d. Manzana: 50g\r\n"
									+ "e. Lápiz: 25g\r\n"
									+ "f. Lapicero: 25g\r\n"
									+ "g. Sacapuntas: 25g\r\n"
									+ "h. Borrador: 25g\r\n"
									+ "Analíce de qué forma un algoritmo recursivo puede ayudarle a solucionar este problema.\r\n"
									+ "Una vez resuelto el problema, pruebe con distintos pesos de los objetos para evaluar la solución.\r\n"
									+ "");
				break;
				
			case 6 :
				exit = true;
				break; 
				
				
			default:
				System.out.println("thanks for see el seguimiento");
			}
			
		}
				

	}
	
	/*
	 * 
	 * PUNTO 1 
	 * 
	 * 
	 */
	
	
public static int sum(int inicio, int fin, int[] lista ) {
		
		if(inicio == fin) {
			
			return lista[inicio];
			
		}
		
		int mitad = (inicio + fin)/2 ; //parti el arreglo en mitades
		
		int parte1 = sum(inicio,mitad,lista);
		int parte2 = sum(mitad+1, fin, lista);
		
		
		return parte1 + parte2;
		
		
	}
	
	/*
	 * punto 2
	 * 
	 * pendiente
	 * 
	 * 
	 */
	
	public static String nombre () {
		
		
		String msg = "";
		
		return msg;
		
	}
	
	public static double prom() {
		
		return 1;
	}

}
