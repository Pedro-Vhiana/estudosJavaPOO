package Estudo;

public class rectangleArea {

	public double width;
	public double height;
	
	public double area() {
		double area = width*height;
		return area;
	}
	
	public double perimeter() {
		double p = 2 * (width + height);
		return p;
	}
	
	public double diagonal() {
		double d = Math.sqrt((height*height)+(width*width));
		return d;
	}
	
	

}
