package clocky;

import javafx.event.ActionEvent;

public class ClockHandlerReverse extends ClockHandler {

    private ClockGUI clock;

    public ClockHandlerReverse(ClockGUI clock) {
        super(clock);
    }

    @Override
    public void handle(ActionEvent arg0) {
        clock.turnCounterClockwise();
    }
    
}
