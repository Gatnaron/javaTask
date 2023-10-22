package model;

public class ShapeFactory {
    public Shape createShape(String name) {
        return switch (name) {
            case "Круг" -> new Circle();
            case "Квадрат" -> new Rectangle();
            case "Треугольник" -> new Triangle();
            default -> null;
        };
    }
}
