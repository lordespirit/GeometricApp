package main;

public class Triangulo extends Geometria {
	private float altura;
	private float base;
	
	public Triangulo(float base, float altura){
		this.base = base;
		this.altura = altura;
	}
	
	public Triangulo(float base){
		this.base = base;
		this.altura = -1;
	}
	
	@Override
	public float getPerimetro() {
		if(altura==-1){
			return 3*base;
		}else{
			return 	2*altura+base;
		}
	}
	
	@Override
	public float getArea(){
		if(altura==-1){
			return (float) ((Math.sqrt(3)/4)*base*base);
		}else{
			return ((base*altura)/2);	
		}
	}
}
