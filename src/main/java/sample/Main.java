package sample;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

//problem with javafx library
// still thinking

public class Main extends Application implements EventHandler {

    private CheckBox bananaCB;
    private CheckBox mangoCB;
    private CheckBox papayaCB;
    private CheckBox grapefruitCB;

    private Label response;
    private Label selected;
    private Label title;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Favorite Fruit");

        title = new Label("What fruits do you like?");
        response = new Label("");
        selected = new Label("");

        bananaCB = new CheckBox("Banana");
        mangoCB = new CheckBox("Mango");
        papayaCB = new CheckBox("Papaya");
        grapefruitCB = new CheckBox("Grapefruit");

        // Register all of our checkboxes
        bananaCB.setOnAction(this);
        mangoCB.setOnAction(this);
        papayaCB.setOnAction(this);
        grapefruitCB.setOnAction(this);

        // Set up the Stage and Scene
        FlowPane flowPaneRoot = new FlowPane(Orientation.VERTICAL, 5, 5);
        flowPaneRoot.setAlignment(Pos.CENTER);

        // We add all of our controls
        flowPaneRoot.getChildren().add(title);
        flowPaneRoot.getChildren().addAll(bananaCB, mangoCB,
                papayaCB, grapefruitCB, response, selected);

        // Attach eventListeners to our checkboxes


        Scene scene = new Scene(flowPaneRoot, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.show();

        showAll();

    }

    void showAll() {
        String fruits = "";
        if (bananaCB.isSelected()) fruits = " Banana";
        if (mangoCB.isSelected()) fruits += " Mango";
        if (papayaCB.isSelected()) fruits += " Papaya";
        if (grapefruitCB.isSelected()) fruits += " Grapefruit";

        selected.setText("Fruits selected: " + fruits);
    }

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void handle(Event event) {
        Object fruitChecked = event.getSource();
        if (bananaCB.equals(fruitChecked)) {
            if (bananaCB.isSelected()) {
                response.setText("Banana Selected");
            } else response.setText("Banana cleared!");

            showAll();
        }

        if (mangoCB.equals(fruitChecked)) {
            if (mangoCB.isSelected()) {
                response.setText("Mango Selected");
            } else response.setText("Mango cleared!");

            showAll();
        }

        if (papayaCB.equals(fruitChecked)) {
            if (papayaCB.isSelected()) {
                response.setText("Papaya Selected");
            } else response.setText("Papaya cleared!");

            showAll();
        }

        if (grapefruitCB.equals(fruitChecked)) {
            if (grapefruitCB.isSelected()) {
                response.setText("Grapefruit Selected");
            } else response.setText("Grapefruit cleared!");

            showAll();
        }

        if (bananaCB.isSelected() && mangoCB.isSelected() && papayaCB.isSelected() && grapefruitCB.isSelected()) {
            title.setText("Congratulations, you like all fruits");
        }else title.setText("What fruits do you like?");
    }
}