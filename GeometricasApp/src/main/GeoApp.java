package main;

public class GeoApp {

	public static void main(String[] args) {
		
		String option=null;
		UserInterface.showWelcome();
		
		do{
			
			UserInterface.showMenuInit();
			option = UserInterface.scanMenuInit().toLowerCase();
			
			switch(option){
			case "triangulo":
				String optionTriangulo;
				do{
					UserInterface.showMenuTriangulo();
					optionTriangulo = UserInterface.scanMenuTriangulo();
					switch(optionTriangulo){
						case "equilatero":
							UserInterface.showMenuTrianguloEquilatero();
							float lado = UserInterface.scanMenuTrianguloEquilatero();
							Triangulo triangulo = new Triangulo(lado);
							UserInterface.showAreaPerimetroTriangulo(option,optionTriangulo,triangulo.getArea(),triangulo.getPerimetro());
							break;
						case "isosceles":
							UserInterface.showMenuTrianguloIsosceles();
							float lados[] = UserInterface.scanMenuTrianguloIsosceles();
							Triangulo trianguloIsos = new Triangulo(lados[0],lados[1]);
							UserInterface.showAreaPerimetroTriangulo(option,optionTriangulo,trianguloIsos.getArea(),trianguloIsos.getPerimetro());
							break;
						case "salir":
							System.out.println("Volviendo al menú principal");
							break;
						default:
							System.out.println("Opción no válida. Vuelva a introducir un triángulo válido");
							break;
					}
				}while(!optionTriangulo.equals("salir"));
				break;
			case "rectangulo":
				
				break;
			case "elipse":
				
				break;
			case "hexagono":
				
				break;
			case "circulo":
				
			default:
				System.out.println("Opción no válida. Vuelva a probar.");
				break;
			
			}
			
		}while(!option.equals("salir"));
		

	}

}
