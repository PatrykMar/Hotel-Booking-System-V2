package Booking;

public class SubmitCommand extends Command{
    
    public SubmitCommand(Button button) 
    {
	super(button);
    }
    
    @Override
    public boolean execute() {
	System.out.println("You submitted something.");
	    return true;
    }
}