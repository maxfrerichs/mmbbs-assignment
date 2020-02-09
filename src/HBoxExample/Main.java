package HBoxExample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        GridPane root = new GridPane();
        primaryStage.setTitle("Hello World");
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.getChildren().addAll(button1, button2, button3);
        root.getChildren().add(hBox);
        primaryStage.setScene(new Scene(root, 300, 200));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
