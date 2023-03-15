package Creation.Factory.ShapeFactory.factory;

import Creation.Factory.ShapeFactory.Shape;
import Creation.Factory.ShapeFactory.object.Circle;
import Creation.Factory.ShapeFactory.object.Rectangle;
import Creation.Factory.ShapeFactory.object.Square;

public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType == null) {
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }

        return null;
    }
}
