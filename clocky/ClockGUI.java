package clocky;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ClockGUI extends Application {

    private Label topLeft = makeLabel("1", Color.GREEN);
    private Label topRight = makeLabel("2", Color.CYAN);
    private Label bottomLeft = makeLabel("4", Color.SALMON);
    private Label bottomRight = makeLabel("3", Color.PINK);

    public static Label makeLabel(String text, Color color) {
        Label label = new Label(text);
        label.setFont(new Font("Arial", 48));
        label.setBackground(new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY)));
        label.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        label.setPrefSize(125, 150);
        label.setAlignment(Pos.CENTER);
        return label;
    }

    public Button makeButtonClockwise() {
        Button button = new Button();
        button.setPrefSize(250, 20);
        button.setText("Clockwise");
        ClockHandler handler = new ClockHandler(this);
        button.setOnAction(handler);
        return button;
    }

    
    public Button makeButtonCounterClockwise() {
        Button button = new Button();
        button.setPrefSize(250, 20);
        button.setText("Counter-Clockwise");
        ClockHandlerReverse handler = new ClockHandlerReverse(this);
        button.setOnAction(handler);
        return button;
    }

    public void turnClockwise() {
        String bottomLeftText = bottomLeft.getText();
        String bottomRightText = bottomRight.getText();
        String topRightText = topRight.getText();
        String topLeftText = topLeft.getText();

        topLeft.setText(bottomLeftText);
        bottomLeft.setText(bottomRightText);
        bottomRight.setText(topRightText);
        topRight.setText(topLeftText);
        // sets the text to the label to the left of it
    }

    public void turnCounterClockwise() {
        String bottomLeftText = bottomLeft.getText();
        String bottomRightText = bottomRight.getText();
        String topRightText = topRight.getText();
        String topLeftText = topLeft.getText();

        topLeft.setText(topRightText);
        bottomLeft.setText(topLeftText);
        bottomRight.setText(bottomLeftText);
        topRight.setText(bottomRightText);
        // sets the text to the label to the left of it
    }

    @Override
    public void start(Stage stage) throws Exception {
        // create vbox that contains a border pane and 2 buttons
        VBox vbox = new VBox();
        GridPane pane = new GridPane();

        pane.add(topLeft, 0, 0);
        pane.add(topRight, 1, 0);
        pane.add(bottomLeft, 0, 1);
        pane.add(bottomRight, 1, 1);

        Button clockwise = makeButtonClockwise();
        Button counterClockwise = makeButtonCounterClockwise();

        vbox.getChildren().addAll(pane, clockwise, counterClockwise);

        stage.setScene(new Scene(vbox));
        stage.setTitle("clock");
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}