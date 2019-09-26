package Booking;

import Booking.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button {
    public JTextArea textField;
    public String clipboard;
    
    public void init() {
    JFrame frame = new JFrame("Main Menu");
    JPanel content = new JPanel();
    frame.setContentPane(content);
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
    textField = new JTextArea();
    textField.setLineWrap(true);
    content.add(textField);
    JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
    JButton booking = new JButton("Booking");
    JButton cancelBooking = new JButton("Cancel Booking");
    Button button = this;
    
    
    //all the buttons you want to add.
    booking.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
	    executeCommand(new BookingCommand(button));
	}
    });
    
    buttons.add(booking);
    content.add(buttons);
    frame.setSize(450, 200);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
   
    }
    private void executeCommand(Command command) {
        command.execute();
    } 


    
    
    
    private JTextField fnameField;
    private JTextField lnameField;
    private JTextField dateInField;
    private JTextField dateOutField;
    private JTextField roomsBooked;
    private JTextField type;
    private JButton submitBtn;
    private JButton cancelBtn;
    
    public void BookingView() {
	JFrame frame2 = new JFrame("Booking");
	JPanel content2 = new JPanel();
	
	
	JPanel fName = new JPanel();
	JLabel fnameLabel = new JLabel("First Name: ",JLabel.CENTER);
	fnameField = new JTextField("",10);
	fName.add(fnameLabel);
	fName.add(fnameField);
	
	JPanel lName = new JPanel();
	JLabel lnameLabel = new JLabel("Last Name: ",JLabel.CENTER);
	lnameField = new JTextField("",10);
	lName.add(lnameLabel);
	lName.add(lnameField);

	JPanel dateInPanel = new JPanel();
	JLabel dateInLabel = new JLabel("Date in: ",JLabel.CENTER);
	dateInField = new JTextField("",10);
	dateInPanel.add(dateInLabel);
	dateInPanel.add(dateInField);

	JPanel dateOutPanel = new JPanel();
	JLabel dateOutLabel = new JLabel("Date out: ",JLabel.CENTER);
	dateOutField = new JTextField("",10);
	dateOutPanel.add(dateOutLabel);
	dateOutPanel.add(dateOutField);
	
	JPanel roomsPanel = new JPanel();
	JLabel roomLabel = new JLabel("Rooms: ",JLabel.CENTER);
	roomsBooked= new JTextField("",10);
	roomsPanel.add(roomLabel);
	roomsPanel.add(roomsBooked);
	
	JPanel typePanel = new JPanel();
	JLabel typeLabel = new JLabel("Type: ",JLabel.CENTER);
	type = new JTextField("",10);
	typePanel.setVisible(true);
	typePanel.add(typeLabel);
	typePanel.add(type);
	
	JPanel control = new JPanel(new FlowLayout(FlowLayout.CENTER));
	submitBtn = new JButton("Submit");
	control.add(submitBtn);
	
	content2.add(fName);
	content2.add(lName);
	content2.add(dateInPanel);
	content2.add(dateOutPanel);
	content2.add(typePanel);
	content2.add(roomsPanel);
	content2.add(control);
	
	Button button = this;
	
	submitBtn.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		    executeCommand(new SubmitCommand(button));
		}
	    });
	
	frame2.setSize(450, 200);
	frame2.setLocationRelativeTo(null);
	frame2.setVisible(true);
    }
}
