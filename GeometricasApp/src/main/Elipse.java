package main;

public class Elipse extends Geometria {
	final private float  PI = 3.141592653589f;
	private float radioMayor;
	private float radioMenor;
	
	public Elipse(float radioMayor, float radioMenor){
		this.radioMayor = radioMayor;
		this.radioMenor = radioMenor;
	}
	
	@Override
	public float getPerimetro() {
		return (float) (2*PI*Math.sqrt((Math.pow(radioMayor, 2)+Math.pow(radioMenor, 2))/2));
	}
	
	@Override
	public float getArea(){
		return PI*radioMayor*radioMenor;
	}
}
