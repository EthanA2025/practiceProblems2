package clocky;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ClockHandler implements EventHandler<ActionEvent>{

    private ClockGUI clock;

    public ClockHandler(ClockGUI clock) {
        this.clock = clock;
    }

    @Override
    public void handle(ActionEvent event) {
        clock.turnClockwise();
    }
}