package main;

public class Rectangulo extends Geometria {

	private float ancho;
	private float alto;
	
	public Rectangulo(float ancho, float alto){
		this.ancho=ancho;
		this.alto=alto;
	}
	
	@Override
	public float getPerimetro() {
		return 2*(alto+ancho);
	}
	
	@Override
	public float getArea(){
		return ancho*alto;
	}
}
