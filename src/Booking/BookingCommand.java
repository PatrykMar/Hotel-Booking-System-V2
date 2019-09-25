package Booking;

import Booking.Command;

public class BookingCommand extends Command{
    
    public BookingCommand(Button button) 
    {
	super(button);
    }
    
    @Override
    public boolean execute() {
	    return true;
    }
}
