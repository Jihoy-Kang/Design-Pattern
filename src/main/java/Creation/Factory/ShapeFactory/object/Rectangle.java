package Creation.Factory.ShapeFactory.object;

import Creation.Factory.ShapeFactory.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
