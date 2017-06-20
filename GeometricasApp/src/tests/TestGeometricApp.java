package tests;
import org.junit.Assert;
import org.junit.Test;
import main.Circulo;
import main.Elipse;
import main.Hexagono;
import main.Rectangulo;
import main.Triangulo;

public class TestGeometricApp {
	
	@Test
	public void testCirculo(){
		
		Circulo crc = new Circulo(2f);
		
		Assert.assertEquals(12.566368, crc.getArea(),0.0001);
		
	}
	
	@Test
	public void testTriangulo(){
		
		Triangulo tri1 = new Triangulo(3f);
		Assert.assertEquals(3.897, tri1.getArea(),0.001);
		Assert.assertEquals(9, tri1.getPerimetro(),0);
		
		Triangulo tri2 = new Triangulo(3f,5.3f);
		Assert.assertEquals(7.95, tri2.getArea(),0.01);
		Assert.assertEquals(13.6, tri2.getPerimetro(),0.01);
	}
	
	@Test
	public void testElipse(){
		
		Elipse elip = new Elipse(3f, 2.8f);
		Assert.assertEquals(26.3894, elip.getArea(),0.01);
		Assert.assertEquals(18.2267, elip.getPerimetro(),0.01);
	}
	
	@Test
	public void testRectangulo(){
		
		Rectangulo rec = new Rectangulo(3f,5.5f);
		Assert.assertEquals(16.5, rec.getArea(),0.01);
		Assert.assertEquals(17, rec.getPerimetro(),0.01);
	}
	
	@Test
	public void testHexagono(){
		
		Hexagono hex = new Hexagono(2.2f);
		Assert.assertEquals(12.5747, hex.getArea(),0.001);
		Assert.assertEquals(13.2, hex.getPerimetro(),0.01);
	}

}
