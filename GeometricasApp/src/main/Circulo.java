package main;

public class Circulo extends Geometria {
	
	private float radio;
	final private float  PI = 3.141592653589f;
	
	public Circulo(float radio){
		this.radio = radio;
	}

	@Override
	public float getPerimetro() {
		return 2 * PI * radio;
	}
	
	@Override
	public float getArea(){
		return (float) (PI * Math.pow(radio, 2));
	}

}
