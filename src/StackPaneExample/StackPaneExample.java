package StackPaneExample;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Sphere;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


// StackPane ermöglicht das "Stapeln" von UI-Elementen -
public class StackPaneExample extends Application {
    @Override
    public void start(Stage stage) {
        // 1 nicer kreis
        Circle circle = new Circle(300, 135, 100);
        circle.setFill(Color.DARKSLATEBLUE);
        circle.setStroke(Color.BLACK);
        Sphere sphere = new Sphere(50);

        //
        Text text = new Text("Hello FIAE18M");

        text.setFont(Font.font(null, FontWeight.BOLD, 15));
        text.setFill(Color.CRIMSON);
        text.setX(20);
        text.setY(50);

        StackPane stackPane = new StackPane();

        stackPane.setMargin(circle, new Insets(50, 50, 50, 50));
        ObservableList list = stackPane.getChildren();
        list.addAll(circle, sphere, text);
        Scene scene = new Scene(stackPane);
        stage.setTitle("Stack Pane Example");
        stage.setScene(scene);
        stage.show();
    }

}
