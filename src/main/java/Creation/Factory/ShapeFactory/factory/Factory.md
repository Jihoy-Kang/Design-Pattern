# Factory

## Shape Inteface
```java
public interface Shape {
    void draw();
}
```

## Shape의 자식 클래스
```java
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
```

## ShapeFactory
```java
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
```
getShape는 Shape 클래스를 리턴 해준다. 이는 자식 클래스들이 모두 같은 Shape라는 부모 클래스를 갖기 때문에 가능하다.
getShape 메서드는 shapeType이라는 파라미터를 받고 이에 맞는 클래스를 반환해준다.
팩토리패턴는 팩토리메서드를 통해서 파라미터를 받아 이에 맞는 값을 리턴해주는 패턴을 의미한다.

하지만 Factory는 객체를 생성하고 반환하는 메서드 하나만 갖고 있는 패턴이다. 만약 각 객체마다 다른 기능을 부여하기 위해서 ShapeFactory에 다른 메서들르 넣는다고 가정할 경우 이는 SRP원칙에 벗어날 뿐만 아니라 이후 확장에도 어려움을 갖게된다.
때문에 생성메서드와 기능메서드를 분리한 FactoryMethod 패턴이 있다.                 
