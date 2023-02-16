package model;

import java.util.ArrayList;

public class Controller {
	
	private ArrayList<String[][]> stringMatrices;

	public Controller() {
		
		stringMatrices = new ArrayList<String[][]>();
	}
	
	public void Matrix() {
		
		
		
		String[][] caracter = new String[2][2];
		
		caracter
		[0][0] = "+" ;
		caracter
		[0][1] = "-"; 
		caracter
		[0][2] = "x" ;
		caracter
		[1][0] = "/" ;
		caracter
		[1][1] = "modulo" ;
		caracter
		[1][2] = "porcentaje" ;
		caracter
		[2][0] = "raiz" ;
		caracter
		[2][1] = "null" ;
		caracter
		[2][2] = "null" ;
		
		stringMatrices.add(caracter);
		
		
		
	}
	
	public String showCaracteres() {
		String out = "";
		
		out += "\n Que deseas hacer? \n";
		
		for (int i = 0 ; i < stringMatrices.size();i++) { 
			
			out +=
			printStringMatrix(stringMatrices.get(i));
			
		}
		
		
		return out;
	}
	
	private String printStringMatrix(String[][] caracter) {
		
		String print = "";
		for (int i = 0; i < caracter.length; i++) { // filas numbers.length
			for (int j = 0; j < caracter[0].length; j++) { // columnas numbers[0].length
				print += caracter[i][j] + " ";
			}
			print += "\n";
		}

		return print;
	}
	
	

}
