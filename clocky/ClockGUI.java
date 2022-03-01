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

    public static Label makeLabel(String text, Color color) {
        Label label = new Label(text);
        label.setFont(new Font("Arial", 48));
        label.setBackground(new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY)));
        label.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        label.setPrefSize(125, 150);
        label.setAlignment(Pos.CENTER);
        return label;
    }

    public static Button makeButtonClockwise() {
        Button button = new Button();
        button.setPrefSize(250, 20);
        button.setText("Clockwise");
        return button;
    }

    
    public static Button makeButtonCounterClockwise() {
        Button button = new Button();
        button.setPrefSize(250, 20);
        button.setText("Counter-Clockwise");
        return button;
    }

    @Override
    public void start(Stage stage) throws Exception {
        // create vbox that contains a border pane and 2 buttons
        VBox vbox = new VBox();
        GridPane pane = new GridPane();
        pane.add(makeLabel("1", Color.GREEN), 0, 0);
        pane.add(makeLabel("2", Color.CYAN), 1, 0);
        pane.add(makeLabel("4", Color.SALMON), 0, 1);
        pane.add(makeLabel("3", Color.PINK), 1, 1);

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