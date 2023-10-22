package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Shape
{
    private String name;
    private Color strokeColor;
    private Color fillColor;
    private double height;
    private double width;
    private double x;
    private double y;

    public Shape(String name, Color strokeColor, Color fillColor, double height, double width) {
        this.name = name;
        this.strokeColor = strokeColor;
        this.fillColor = fillColor;
        this.height = height;
        this.width = width;
    }
    public Color getStrokeColor(){
        return this.strokeColor;
    }
    public void setStrokeColor(Color value){this.strokeColor = value;}
    public Color getFillColor(){return this.fillColor;}
    public void setFillColor(Color value){this.fillColor = value;}
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double value) {this.height = value;}
    public double getWidth() {return this.width;}
    public void setWidth(double value) {this.width = value;}
    public double getX() {
        return x;
    }
    public void setX(double value){
        this.x = value;
    }
    public double getY() {
        return y;
    }
    public void setY(double value){
        this.y = value;
    }
    public abstract void draw(GraphicsContext gc);
    public abstract String discriptor();
}

