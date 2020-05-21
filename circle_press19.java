// Write a program that displays the color of a circle as red when the mouse button is 
// pressed and as blue when the mouse button is released.

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class circle_press19 extends Application {

    @Override
    public void start(Stage primaryStage) {
        double width = 400;
        double height = 400;
        Circle c = new Circle(width / 2, height / 2, Math.min(width, height) / 10, Color.BLUE);

        c.setStroke(Color.RED);

        StackPane pane = new StackPane(c);

        primaryStage.setScene(new Scene(pane, width, height));
        pane.setOnMousePressed(e -> c.setFill(Color.RED));
        pane.setOnMouseReleased(e -> c.setFill(Color.BLUE));
        primaryStage.setTitle("The Waste Circle");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);

    }
}
