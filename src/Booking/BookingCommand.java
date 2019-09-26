package Booking;

import Booking.Command;

public class BookingCommand extends Command{
    
    public BookingCommand(Button button) 
    {
	super(button);
    }
    
    @Override
    public boolean execute() {
	System.out.println("You entered Booking Menu.");
	Button button = new Button();
	button.BookingView();	
	return true;
    }
}
