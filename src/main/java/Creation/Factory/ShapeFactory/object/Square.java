package Creation.Factory.ShapeFactory.object;

import Creation.Factory.ShapeFactory.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
