package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import java.util.Locale;

public class Triangle extends Shape{
    public Triangle(){
        super("Треугольник", Color.BLACK, Color.BLUE, 90, 90);
    }
    @Override
    public void draw(GraphicsContext gc) {
        gc.setLineWidth(5.0);
        gc.setStroke(this.getStrokeColor());
        gc.strokePolygon(new double[] {getX(), getX() - (getWidth()/2), getX() + (getWidth()/2)}, new double[] {getY() - (getHeight()/2), getY() + (getHeight()/2), getY() + (getHeight()/2)}, 3);
        gc.setFill(this.getFillColor());
        gc.fillPolygon(new double[] {getX(), getX() - (getWidth()/2), getX() + (getWidth()/2)}, new double[] {getY() - (getHeight()/2), getY() + (getHeight()/2), getY() + (getHeight()/2)}, 3);
    }

    @Override
    public String discriptor() {
        return String.format(Locale.US, "Треугольник %s %s %.1f %.1f %.1f %.1f", getStrokeColor(), getFillColor(), getHeight(), getWidth(), getX(), getY());
    }
}
