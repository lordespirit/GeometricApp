package main;

public abstract class Geometria {

	private String color;
	
	public Geometria(){
		this.color = "black";
	}
	
	public Geometria(String color){
		this.color = color;
	}
	
	public float getArea(){
		return 0;
	}
	
	public abstract float getPerimetro();
	
	
}
