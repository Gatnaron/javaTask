package until;

import javafx.scene.paint.Color;
import model.Shape;
import model.ShapeFactory;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class FileParser {
    public static Deque<Shape> parseToShapes(File file){
        var shapes = new ArrayDeque<Shape>();
        try(var bReader = new BufferedReader(new FileReader(file))) {
            while (bReader.ready()){
                String[] params = bReader.readLine().split(" ");
                if(params.length == 7){
                    var shape = new ShapeFactory().createShape(params[0]);
                    shape.setStrokeColor(parseToColor(params[1]));
                    shape.setFillColor(parseToColor(params[2]));
                    shape.setHeight(Double.parseDouble(params[3]));
                    shape.setWidth(Double.parseDouble(params[4]));
                    shape.setX(Double.parseDouble(params[5]));
                    shape.setY(Double.parseDouble(params[6]));

                    shapes.push(shape);
                }
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return shapes;
    }
    public static void parseToString(Deque<Shape> shapes, File file){
        try(FileWriter writer = new FileWriter(file, false))
        {
            Iterator<Shape> descIter = shapes.descendingIterator();
            while (descIter.hasNext()){
                var shape = descIter.next();
                writer.write(shape.discriptor());
                writer.append('\n');
            }
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    private static Color parseToColor(String strColor) {
        var color = Color.valueOf(strColor);
        return color;
    }
}
