package sample;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Favorite Fruit");

        Label title = new Label("What fruits do you like?");
        Label response = new Label("");
        Label selected = new Label("");

        CheckBox bananaCB = new CheckBox("Banana");
        CheckBox mangoCB = new CheckBox("Mango");
        CheckBox papayaCB = new CheckBox("Papaya");
        CheckBox grapefruitCB = new CheckBox("Grapefruit");

        // Set up the Stage and Scene
        FlowPane flowPaneRoot = new FlowPane(Orientation.VERTICAL, 5, 5);
        flowPaneRoot.setAlignment(Pos.CENTER);

        // We add all of our controls
        flowPaneRoot.getChildren().add(title);
        flowPaneRoot.getChildren().addAll(bananaCB, mangoCB,
                papayaCB, grapefruitCB, response, selected);

        Scene scene = new Scene(flowPaneRoot, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.show();

        showAll();

    }

    void showAll() {
        //String fruits = "";
    }

    public static void main(String[] args) {
        launch();
    }
}