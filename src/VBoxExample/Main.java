package VBoxExample;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


// VBox ordnet alle darin enthaltenen Elemente vertikal an
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        // The "code way"
        GridPane root = new GridPane();
        primaryStage.setTitle("Hello World");
        Node button1 = new Button("Button 1");
        Node button2 = new Button("Button 2");
        Node button3 = new Button("Button 3");
        VBox vbox = new VBox();
        vbox.setSpacing(10);
        vbox.getChildren().addAll(button1, button2, button3);
        root.getChildren().add(vbox);
        primaryStage.setScene(new Scene(root, 300, 200));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
