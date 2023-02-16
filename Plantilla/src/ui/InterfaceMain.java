package ui;

import java.util.Scanner;

// aqui se importan las librerias

public class InterfaceMain {
	
	// se coloca los atributos que se usaran 
	// *EJEMPLO* private Scanner "nombre del scaner" asi
	private Scanner sc;
	

	public static void main(String[] args) {
		
		//se creo el objeto de la clase 
		InterfaceMain main = new InterfaceMain();
		

		int option = 0;

		do {
			option = main.showMenu();
			main.executeOperation(option);

		} while (option != 0);
		

	}
	
	public InterfaceMain() { //nombre de la clase 
		
		sc = new Scanner(System.in);
		
		//constructor
		
	}

	private void executeOperation(int option) {
		
		//aqui van los procesos que interactuan con la clase controller de la carpeta model 
		
		switch(option) {
		case 0:
			break;
		case 1:
				
				method();
			
			break;
			// cada case son las opciones que hay en el menu y su funcion 
			
			
		}
		
	}

	

	private int showMenu() {
		int option = 0;
		// aqui va el menu de lo que quieras mostrar al user 
		
		System.out.println(	"\n [1] Option 1" 
							+"\n [2] OpPtion 2"
							+"\n [3] option 3"
							+"\n [0] salir de la app");
		
		
		option = sc.nextInt();
		
		return option;
	}
	
	private void method() {
		 
		// son los metodos que interactuan, procesan y agrupa datos 
		
		
	}
	
}


