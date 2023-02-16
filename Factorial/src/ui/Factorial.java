package ui;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean exit = false;
		
		int n = 0 ; int serie =0;
		
		while (!exit) {
		System.out.println("\n [1] factorial" 
						 + "\n [2] fibonachi"
						 + "\n [3] terminar"
						 + "\n [4] secuencia");
		
		
		int option = sc.nextInt();
		
		
		
		
		
		switch (option) {
		
		case 1 :
			
			System.out.println("valor n");
			
			 n = sc.nextInt();	
			 
				boolean salir  = false;
				
				while (!salir) {
					
				System.out.println("tipo de factorial"
						+ "\n [1] iterativo" 
						+ "\n [2] recursivo"
						+ "\n [3] volver");
				
				int factorial = sc.nextInt();
				
					switch (factorial) {
	
				case 1 :
					System.out.println(factorialIterativo(n));
					
					break;
					
				case 2: 
					System.out.println(factorialRecursivo(n));
					
					break;
					
				case 3: 
					
					salir = true;
					
					break;
			
					}
					
				}
			
			
			break;
			
		case 2:
				boolean volver = false;
				
				while (!volver) {
					
				System.out.println("tipo de fibonachi"
						+ "\n [1] iterativo" 
						+ "\n [2] recirsivo"
						+ "\n [3] volver ");
				
				
					int fibonachi = sc.nextInt();
					
					
					
					if (fibonachi != 3) {
						
						System.out.println("serie");
						
						serie = sc.nextInt();
						
						
					}
					
					switch (fibonachi) {
					
					case 1:
						System.out.println(fiboachiIterativo(serie));
						break;
						
					case 2:
						System.out.println(fibonachiRecursivo(serie));
						break;
						
					case 3: 
						
						volver = true;
						
						break;
					
					}
				}
				
			break;
			
		case 3 :
			exit = true;
			break;
		
		case 4:
			
			System.out.println("nuemro n");
			
			n = sc.nextInt();
			
			System.out.println(secuencia(n));
			
			break;
		}
		}

	}
	
	 public static int factorialIterativo(int n){
		 
		 int result = 1;
		 
		 for (int i = 1 ; i<= n;i++) {
			 
			 result = result*i;
			 
		 }
		 
		 
		 return result;
		 
	 }
	 
	 public static int factorialRecursivo(int n) {
		 
		 if (n > 0) {
			 
			 int resultado = n * factorialRecursivo(n-1);
			 
			 
			 return resultado;
			 
		 }
		 return 1;
		 
	 }
	 
	 
	 public static int fiboachiIterativo(int serie) {
		 
		 int result =1,  num1 = 0 , num2 = 1;
		 
		 for (int i = 1; i< serie ; i++) {
			 
			 result= num1+num2;
			 
			 num1 = num2;
			 
			 num2 = result;
			 
		 }
		 
		 return result;
	 }
	 
	 
	 public static int fibonachiRecursivo(int n) {
		 
		 if (n == 0) {
			 
	            return 0;
	               
	        } 
		 
		 else if (n == 1) {
			 
	          return 1;
	        } 
		 
	        else {
	            
	            return fibonachiRecursivo(n - 1) + fibonachiRecursivo(n - 2);
	        }
	 
		 
	 }
	 
	 public static String secuencia(int n) {
		 
		 if(n ==1) {
			 
			 
			 return "" +1;
			 
		 }else {
		 
		 return secuencia(n-1) +" "+n;
		 
		 }
	 }
	 
	 public static String nombre () {
		 
		 String msg = "";
		 
		 
		 return msg;
	 }
}
