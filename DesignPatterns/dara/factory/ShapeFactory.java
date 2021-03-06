package dara.factory;

public class ShapeFactory extends AbstractFactory{
	// Use getShape method to get object of type shape
	@Override
	public Shape getShape(String shapeType){
		if(shapeType==null){
			return null;
		}
		if(shapeType.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		}
		else if(shapeType.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();
		}
		else if(shapeType.equalsIgnoreCase("SQUARE")){
			return new Square();
		}
		return null;
	}
	  @Override
	   Color getColor(String color) {
	      return null;
	   }
}
