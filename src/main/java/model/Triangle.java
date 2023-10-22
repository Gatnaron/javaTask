package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Triangle extends Shape{
    private final double height, width;
    public Triangle(Color strokeColor, Color fillColor, double height, double width){
        super(strokeColor, fillColor);
        this.height = height;
        this.width = width;
    }
    @Override
    public void draw(GraphicsContext gc) {
        gc.setLineWidth(5.0);
        gc.setStroke(this.strokeColor);
        gc.strokePolygon(new double[] {x, x - (width/2), x + (width/2)}, new double[] {y - (height/2), y + (height/2), y + (height/2)}, 3);
        gc.setFill(this.fillColor);
        gc.fillPolygon(new double[] {x, x - (width/2), x + (width/2)}, new double[] {y - (height/2), y + (height/2), y + (height/2)}, 3);
    }
    @Override
    public String toString() {
        return "Фигура - Треугольник, Размеры (Высота x Ширина): "+height + "x" +width;
    }
}
