package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import java.util.Locale;

public class Circle extends Shape{
    public Circle(){
        super("Круг", Color.BLACK, Color.GREEN, 90, 90);
    }
    @Override
    public void draw(GraphicsContext gc) {
        gc.setLineWidth(5.0);
        gc.setStroke(this.getStrokeColor());
        gc.strokeOval(this.getX() - (this.getHeight()/2), this.getY() - (this.getWidth()/2), this.getHeight(), this.getWidth());
        gc.setFill(this.getFillColor());
        gc.fillOval(this.getX() - (this.getHeight()/2), this.getY() - (this.getWidth()/2), this.getHeight(), this.getWidth());
    }

    @Override
    public String discriptor() {
        return String.format(Locale.US, "Круг %s %s %.1f %.1f %.1f %.1f", getStrokeColor(), getFillColor(), getHeight(), getWidth(), getX(), getY());
    }
}
