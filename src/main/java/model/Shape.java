package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Shape
{
    protected final Color strokeColor, fillColor;
    protected double x, y;

    public abstract void draw(GraphicsContext gc);
    public Shape(Color strokeColor, Color fillColor){
        this.strokeColor = strokeColor;
        this.fillColor = fillColor;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }

    public abstract String toString();
}

