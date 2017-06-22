package main;

public class GeoApp {

	public static void main(String[] args) {
		
		char option;
		UserInterface.showWelcome();
		
		do{
			
			UserInterface.showMenuInit();
			option = UserInterface.scanMenuInit().toLowerCase().toCharArray()[0];
			switch(option){
			case 't':
				char optionTriangulo;
				do{
					UserInterface.showMenuTriangulo();
					optionTriangulo = UserInterface.scanMenuTriangulo().toCharArray()[0];
					switch(optionTriangulo){
						case 'e':
							UserInterface.showMenuTrianguloEquilatero();
							float lado = UserInterface.scanMenuTrianguloEquilatero();
							Triangulo triangulo = new Triangulo(lado);
							UserInterface.showAreaPerimetro(triangulo.getArea(),triangulo.getPerimetro());
							break;
						case 'i':
							UserInterface.showMenuTrianguloIsosceles();
							float lados[] = UserInterface.scanMenuTrianguloIsosceles();
							Triangulo trianguloIsos = new Triangulo(lados[0],lados[1]);
							UserInterface.showAreaPerimetro(trianguloIsos.getArea(),trianguloIsos.getPerimetro());
							break;
						case 's':
							System.out.println("Volviendo al menú principal");
							break;
						default:
							System.out.println("Opción no válida. Vuelva a introducir un triángulo válido");
							break;
					}
				}while(option!='s');
				break;
			case 'r':
				UserInterface.showMenuRectangulo();
				float lado[] = UserInterface.scanMenuRectangulo();
				Rectangulo rectangulo = new Rectangulo(lado[0],lado[1]);
				UserInterface.showAreaPerimetro(rectangulo.getArea(), rectangulo.getPerimetro());
				break;
			case 'e':
				UserInterface.showMenuElipse();
				float radios[] = UserInterface.scanMenuElipse();
				Elipse elipse = new Elipse(radios[0],radios[1]);
				UserInterface.showAreaPerimetro(elipse.getArea(), elipse.getPerimetro());
				break;
			case 'h':
				UserInterface.showMenuHexagono();
				float edge = UserInterface.scanMenuHexagono();
				Hexagono hexagono = new Hexagono(edge);
				UserInterface.showAreaPerimetro(hexagono.getArea(), hexagono.getPerimetro());
				break;
			case 'c':
				UserInterface.showMenuCirculo();
				float radio = UserInterface.scanMenuCirculo();
				Circulo crc = new Circulo(radio);
				UserInterface.showAreaPerimetro(crc.getArea(),crc.getPerimetro());
			default:
				System.out.println("Opción no válida. Vuelva a probar.");
				break;
			
			}
			
		}while(option!='s');
		

	}

}
