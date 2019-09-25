package Booking;

import Booking.Command;

public class CancelBookingCommand extends Command  {
    
    public CancelBookingCommand(Button button)
    {
	super(button);
    }
    
    @Override
    public boolean execute() {
	return true;
    }
}
