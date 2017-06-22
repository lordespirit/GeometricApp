package main;

public class GeoApp {

	public static void main(String[] args) {
		
		String option=null;
		UserInterface.showWelcome();
		
		do{
			
			UserInterface.showMenuInit();
			option = UserInterface.scanMenuInit().toLowerCase();
			char opt = option.toCharArray()[0];
			switch(option){
			case "triangulo":
			case "t":
				String optionTriangulo;
				do{
					UserInterface.showMenuTriangulo();
					optionTriangulo = UserInterface.scanMenuTriangulo();
					char optTri = optionTriangulo.toCharArray()[0];
					switch(optionTriangulo){
						case "equilatero":
						case "e":
							UserInterface.showMenuTrianguloEquilatero();
							float lado = UserInterface.scanMenuTrianguloEquilatero();
							Triangulo triangulo = new Triangulo(lado);
							UserInterface.showAreaPerimetro(option,optionTriangulo,triangulo.getArea(),triangulo.getPerimetro());
							break;
						case "isosceles":
						case "i":
							UserInterface.showMenuTrianguloIsosceles();
							float lados[] = UserInterface.scanMenuTrianguloIsosceles();
							Triangulo trianguloIsos = new Triangulo(lados[0],lados[1]);
							UserInterface.showAreaPerimetro(option,optionTriangulo,trianguloIsos.getArea(),trianguloIsos.getPerimetro());
							break;
						case "salir":
						case "s":
							System.out.println("Volviendo al menú principal");
							break;
						default:
							System.out.println("Opción no válida. Vuelva a introducir un triángulo válido");
							break;
					}
				}while(!optionTriangulo.equals("salir"));
				break;
			case "rectangulo":
			case "r":
				UserInterface.showMenuRectangulo();
				float lado[] = UserInterface.scanMenuRectangulo();
				Rectangulo rectangulo = new Rectangulo(lado[0],lado[1]);
				UserInterface.showAreaPerimetro(option, rectangulo.getArea(), rectangulo.getPerimetro());
				break;
			case "elipse":
			case "e":
				UserInterface.showMenuElipse();
				float radios[] = UserInterface.scanMenuElipse();
				Elipse elipse = new Elipse(radios[0],radios[1]);
				UserInterface.showAreaPerimetro(option, elipse.getArea(), elipse.getPerimetro());
				break;
			case "hexagono":
			case "h":
				UserInterface.showMenuHexagono();
				float edge = UserInterface.scanMenuHexagono();
				Hexagono hexagono = new Hexagono(edge);
				UserInterface.showAreaPerimetro(option, hexagono.getArea(), hexagono.getPerimetro());
				break;
			case "circulo":
			case "c":
				UserInterface.showMenuCirculo();
				float radio = UserInterface.scanMenuCirculo();
				Circulo crc = new Circulo(radio);
				UserInterface.showAreaPerimetro(option, crc.getArea(),crc.getPerimetro());
			default:
				System.out.println("Opción no válida. Vuelva a probar.");
				break;
			
			}
			
		}while(!option.equals("salir"));
		

	}

}
