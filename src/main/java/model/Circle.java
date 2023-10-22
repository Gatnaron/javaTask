package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle extends Shape{
    private final double height, width;
    public Circle(Color strokeColor, Color fillColor, double height, double width){
        super(strokeColor, fillColor);
        this.height = height;
        this.width = width;
    }
    @Override
    public void draw(GraphicsContext gc) {
        gc.setStroke(this.strokeColor);
        gc.setLineWidth(5.0);
        gc.strokeOval(this.x - (height/2), this.y - (width/2), height, width);
        gc.setFill(this.fillColor);
        gc.fillOval(this.x - (height/2), this.y - (width/2), height, width);
    }
    @Override
    public String toString() {
        return "Фигура - Круг, Размеры (Высота x Ширина): "+height + "x" +width;
    }
}
