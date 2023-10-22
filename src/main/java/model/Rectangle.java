package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import java.util.Locale;

public class Rectangle extends Shape{
    public Rectangle(){
        super("Прямоугольник", Color.BLACK, Color.RED, 90, 90);
    }
    @Override
    public void draw(GraphicsContext gc) {
        gc.setLineWidth(5.0);
        gc.setStroke(this.getStrokeColor());
        gc.strokeRect(this.getX() - (this.getWidth()/2), this.getY() - (this.getHeight()/2), this.getWidth(), this.getHeight());
        gc.setFill(this.getFillColor());
        gc.fillRect(this.getX() - (this.getWidth()/2), this.getY() - (this.getHeight()/2), this.getWidth(), this.getHeight());
    }

    @Override
    public String discriptor() {
        return String.format(Locale.US, "Квадрат %s %s %.1f %.1f %.1f %.1f", getStrokeColor(), getFillColor(), getHeight(), getWidth(), getX(), getY());
    }
}
