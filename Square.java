
public class Square implements Shape {
	private double side;
	
	public Square() {
		this.side = 0;
	}
	
	public Square(double side) {
		this.side = side;
	}
	
	public void draw() {
		System.out.println("You are drawing Square");
	}
	
	public double calculateArea() {
		return this.side*this.side;
	}

	public Shape getClone() {
		return new Square(this.side);
	}
	
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
}
