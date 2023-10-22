package com.example.javatask;

import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import model.*;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Canvas canvas;

    @FXML
    private ColorPicker fillColorPicker;

    @FXML
    private TextField heightTextField;

    @FXML
    private Button selectCircleButton;

    @FXML
    private Button selectRectangleButton;

    @FXML
    private Button selectRoundRectangleButton;

    @FXML
    private Button selectTriangleButton;

    @FXML
    private ColorPicker strokeColorPicker;

    @FXML
    private Label titleShapeLabel;

    @FXML
    private TextField widthTextField;

    private GraphicsContext gc;

    private Shape shape;

    private static void initializeHandlers(HelloController controller){
        controller.canvas.setOnMouseClicked(controller::drawShapesHandler);
        controller.selectRectangleButton.setOnMouseClicked(controller::selectRectangleHandler);
        controller.selectCircleButton.setOnMouseClicked(controller::selectCircleHandler);
        controller.selectRoundRectangleButton.setOnMouseClicked(controller::selectRoundRectangleHandler);
        controller.selectTriangleButton.setOnMouseClicked(controller::selectTriangleHandler);
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        gc = canvas.getGraphicsContext2D();
        HelloController.initializeHandlers(this);
    }
    private void drawShapesHandler(MouseEvent event){
        shape.setX(event.getX());
        shape.setY(event.getY());
        shape.draw(gc);
        titleShapeLabel.setText(shape.toString());
    }
    private void selectRectangleHandler(MouseEvent event){
        if (heightTextField.getText().isEmpty() || widthTextField.getText().isEmpty())
            displayWarningMessage("Введите высоту или ширину прямоугольника!");
        else {
            shape = new Rectangle(strokeColorPicker.getValue(),
                    fillColorPicker.getValue(),
                    Double.parseDouble(heightTextField.getText()),
                    Double.parseDouble(widthTextField.getText()));
        }
    }
    private void selectCircleHandler(MouseEvent event) {
        if (heightTextField.getText().isEmpty() || widthTextField.getText().isEmpty())
            displayWarningMessage("Введите высоту или ширину овала!");
        else {
            shape = new Circle(strokeColorPicker.getValue(),
                    fillColorPicker.getValue(),
                    Double.parseDouble(heightTextField.getText()),
                    Double.parseDouble(widthTextField.getText()));
        }
    }
    private void selectRoundRectangleHandler(MouseEvent event){
        if (heightTextField.getText().isEmpty() || widthTextField.getText().isEmpty())
            displayWarningMessage("Введите высоту или ширину Скруг. прямоугольника!");
        else {
            shape = new RoundRectangle(strokeColorPicker.getValue(),
                    fillColorPicker.getValue(),
                    Double.parseDouble(heightTextField.getText()),
                    Double.parseDouble(widthTextField.getText()), 15);
        }
    }
    private void selectTriangleHandler(MouseEvent event){
        if (heightTextField.getText().isEmpty() || widthTextField.getText().isEmpty())
            displayWarningMessage("Введите высоту или ширину треугольника!");
        else {
            shape = new Triangle(strokeColorPicker.getValue(),
                    fillColorPicker.getValue(),
                    Double.parseDouble(heightTextField.getText()),
                    Double.parseDouble(widthTextField.getText()));
        }
    }
    private void displayWarningMessage(String text){
        var alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Ошибка!");
        alert.setHeaderText("Ошибка!");
        alert.setContentText(text);
        alert.showAndWait();
    }
}