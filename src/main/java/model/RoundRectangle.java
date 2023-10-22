package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class RoundRectangle extends Shape{
    private final double height, width, arc;
    public RoundRectangle(Color strokeColor, Color fillColor, double height, double width, double arc){
        super(strokeColor, fillColor);
        this.height = height;
        this.width = width;
        this.arc = arc;
    }
    @Override
    public void draw(GraphicsContext gc) {
        gc.setLineWidth(5.0);
        gc.setStroke(this.strokeColor);
        gc.strokeRoundRect(this.x - (width/2), this.y - (height/2), width, height, arc, arc);
        gc.setFill(this.fillColor);
        gc.fillRoundRect(this.x - (width/2), this.y - (height/2), width, height, arc , arc);
    }
    @Override
    public String toString() {
        return "Фигура - Скруг. прямоугольник, Размеры (Высота x Ширина): "+height + "x" +width;
    }
}
