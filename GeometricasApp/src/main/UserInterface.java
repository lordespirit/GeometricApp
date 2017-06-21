package main;

import utils.Input;

public class UserInterface {

	public static void showWelcome(){
		
		System.out.println("**********************************");
		System.out.println("*** BIENVENIDO A GEOMETRIC APP ***");
		System.out.println("**********************************");
		
	}
	
	public static void showMenuInit(){
		
		System.out.print("Introduce la figura geom�trica con la que deseas trabajar: ");
		System.out.println("> Triangulo");
		System.out.println("> Rectangulo");
		System.out.println("> Elipse");
		System.out.println("> Hexagono");
		System.out.println("> Circulo");
		System.out.println("> Salir");
		System.out.print("\nIntroduce una option > ");
		
	}
	
	public static String scanMenuInit(){
		return Input.scannLine().toLowerCase();
	}
	
	public static void showMenuTriangulo(){
		
		System.out.println("Tipo de triangulo : ");
		System.out.println("> Equilatero");
		System.out.println("> Isosceles");
		System.out.println("> Salir");
		System.out.print("\nIntroduce una option > ");
	}
	
	public static String scanMenuTriangulo(){
		return Input.scannLine().toLowerCase();
	}
	
	public static void showMenuTrianguloEquilatero(){
		
		System.out.println("TRIANGULO EQUILATERO");
		System.out.println("Debes introducir �nicamente la medida de un lado");
		System.out.print("lado > ");

	}
	
	public static void showMenuElipse(){
		
		System.out.println("ELIPSE");
		System.out.println("Debes introducir las medidas del 'Radio mayor' y del 'Radio menor'");

	}
	
	public static void showMenuRectangulo(){
		
		System.out.println("RECTANGULO");
		System.out.println("Debes introducir las medidas de 'alto' y 'ancho'");

	}
	
	public static void showMenuHexagono(){
		
		System.out.println("HEXAGONO REGULAR");
		System.out.println("Debes introducir la medida de uno de los lados");

	}

	public static void showMenuCirculo(){
	
	System.out.println("CIRCULO");
	System.out.println("Debes introducir la medida del radio");

	}
	
	public static void showMenuTrianguloIsosceles(){
		
		System.out.println("TRIANGULO ISOSCELES");
		System.out.println("Debes introducir la medida de la base y de la altura");

	}
	
	public static float scanMenuTrianguloEquilatero(){
		return Input.scannFloat();
	}
	
	public static float[] scanMenuTrianguloIsosceles(){
		
		float[] trisosceles = new float[2];
		System.out.println("Base > ");
		trisosceles[0] = Input.scannFloat();
		System.out.println("Altura > ");
		trisosceles[1] = Input.scannFloat();
		return trisosceles;
	}
	
	public static float[] scanMenuRectangulo(){
		
		float[] rectangulo = new float[2];
		System.out.println("Alto > ");
		rectangulo[0] = Input.scannFloat();
		System.out.println("Ancho > ");
		rectangulo[1] = Input.scannFloat();
		return rectangulo;
	}

	public static float[] scanMenuElipse(){
	
	float[] elipse = new float[2];
	System.out.println("Radio Mayor > ");
	elipse[0] = Input.scannFloat();
	System.out.println("Radio Menor > ");
	elipse[1] = Input.scannFloat();
	return elipse;
	}

	public static float scanMenuHexagono(){
	
	float lado;
	System.out.println("Lado > ");
	lado = Input.scannFloat();
	return lado;
	}

	public static float scanMenuCirculo(){
	
	float radio;
	System.out.println("Radio > ");
	radio = Input.scannFloat();
	return radio;
	}

	public static void showAreaPerimetro(String option, float area, float perimetro) {
		System.out.println("************ RESULTADO ************");
		System.out.println("******** " + option + " ********");
		System.out.println("***********************************");
		System.out.println("> Area : \t\t" + area);
		System.out.println("> Per�metro : \t" + perimetro);
		System.out.println("***********************************\n");
	}

	public static void showAreaPerimetro(String option, String optionTriangulo, float area, float perimetro) {
		System.out.println("************ RESULTADO ************");
		System.out.println("****** " + option + " " + optionTriangulo + " ******");
		System.out.println("***********************************");
		System.out.println("> Area : \t" + area);
		System.out.println("> Per�metro : \t" + perimetro);
		System.out.println("***********************************\n");
	}
	
}
