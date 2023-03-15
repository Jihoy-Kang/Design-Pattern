package Creation.Factory.ShapeFactory.object;

import Creation.Factory.ShapeFactory.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
