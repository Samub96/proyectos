package ui;
import java.util.Scanner;
import model.Controller;


public class Calculadora {
	
	static Scanner reader = new Scanner(System.in);
	static Controller cal = new Controller();
	
	public static void main(String[] args) {
		
		
		
		System.out.println("\n Bienvenido a la calculadora de Samuel" 
				
				+ cal.showCaracteres()
		
		+ "\n [1] Suma" 
		+ "\n [2] resta"
		+ "\n [3] multiplicacion"
		+ "\n [4] division"
		+ "\n [5] modulo");
		
		
		
		String optionTemp = reader.nextLine();
		int option = Integer.parseInt(optionTemp); 
		switch (option) {
		
		case 1 :
			break;
			
		case 2:
			break;
			
		case 3: 
			break;
			
		case 4:
			break;
		
		case 5: 
			break;
		
		}

	}
	
	

}
