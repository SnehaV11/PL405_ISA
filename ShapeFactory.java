
public class ShapeFactory {
	
public Shape getInstance(ShapeType type) {
		Shape shape = null;
			
		switch(type) 
		{
			case CIRCLE:
				shape = new Circle(15);
				break;
				
			case RECTANGLE:
				shape = new Rectangle(10,5);
				break;
				
			case SQUARE:
				shape = new Square(6);
				break;
				
			case TRIANGLE:
				shape = new Triangle(10,5);
				break;		
		}
		return shape;
	}
}
