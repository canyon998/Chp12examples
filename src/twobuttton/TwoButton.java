package twobuttton;
import java.awt.*; 
import javax.swing.*;
import java.awt.event.*;
public class TwoButton implements ActionListener{ 
	JButton redButton;
    JButton greenButton;
    JButton blueButton;
    JButton blackButton;
    JButton yellowButton;
    JButton pinkButton;
    JFrame myFrame;
    JLabel mylabel;
	public static void main(String[] args) {
		 // create new JFrame
	     new TwoButton();
	   }

	public TwoButton() {
		 myFrame = new JFrame();

	      // set the frame title, size, location
	      myFrame.setTitle("Pink");
	      myFrame.setSize(550, 150);
	      myFrame.setLocation(200, 300);

	      // make sure program terminates when window is closed
	      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	      // assign a layout
	      FlowLayout myLayout = new FlowLayout();
	      myFrame.setLayout(myLayout);

	      // create and add buttons to the frame
	       mylabel = new JLabel("Pick your favorite color ");
	       redButton = new JButton("Red");
	       greenButton = new JButton("Green");
	       blueButton = new JButton("Blue");
	       blackButton = new JButton("Black");
	       yellowButton = new JButton("Yellow");
	       pinkButton = new JButton("Pink");
	       
	       
	       blueButton.addActionListener(this);
	       blackButton.addActionListener(this);
	       yellowButton.addActionListener(this);
	       pinkButton.addActionListener(this);
	       redButton.addActionListener(this);
	       greenButton.addActionListener(this);
	       
	      myFrame.add(mylabel);
	      
	      myFrame.add(redButton);
	      myFrame.add(greenButton);
	      myFrame.add(blueButton);
	      myFrame.add(blackButton);
	      myFrame.add(yellowButton);
	      myFrame.add(pinkButton);
	      // make the frame visible
	      myFrame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		Object control = event.getSource();

	      // if redButton was clicked
	      if (control == redButton)
	      {
	         myFrame.getContentPane().setBackground(Color.red);
	      }
	      // else if greenButton was clicked
	      else if (control == greenButton)
	      {
	         myFrame.getContentPane().setBackground(Color.green);
	      }
	      else if (control == blueButton)
	      {
	         myFrame.getContentPane().setBackground(Color.blue);
	      }
	      else if (control == blackButton)
	      {
	         myFrame.getContentPane().setBackground(Color.black);
	      }
	      else if (control == yellowButton)
	      {
	         myFrame.getContentPane().setBackground(Color.yellow);
	      }
	      else if (control == pinkButton)
	      {
	         myFrame.getContentPane().setBackground(Color.pink);
	         mylabel.setText("What are you a girl");
	      }
		
	}

	}


