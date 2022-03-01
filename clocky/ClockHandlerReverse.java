package clocky;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ClockHandlerReverse implements EventHandler<ActionEvent> {

    private ClockGUI clock;

    public ClockHandlerReverse(ClockGUI clock) {
        this.clock = clock;
    }

    @Override
    public void handle(ActionEvent arg0) {
        clock.turnCounterClockwise();
    }
    
}
