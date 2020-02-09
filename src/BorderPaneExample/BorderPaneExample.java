package BorderPaneExample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneExample extends Application {
    //Instantiating the BorderPane class
    @Override
    public void start(Stage stage) {
        // Erzeuge ein neues BorderPane-Objekt
        BorderPane borderPane = new BorderPane();

        borderPane.setTop(new TextField("Top"));
        borderPane.setBottom(new TextField("Bottom"));
        borderPane.setLeft(new TextField("Left"));
        borderPane.setRight(new TextField("Right"));
        borderPane.setCenter(new TextField("Center"));

        Scene scene = new Scene(borderPane);

        stage.setTitle("BorderPane Example");

        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    //Setting the top, bottom, center, right and left nodes to the pane

}
