import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ControlPanel extends JPanel
{

	InfoPanel theInfoPanel;
	JButton addButton = new JButton("Add some text");
	JTextField someText = new JTextField(30);
	JLabel textLabel = new JLabel("Type something:");
	
	
	public ControlPanel()
	{
		add(textLabel);
		add(someText);
		add(addButton);
		addButton.addActionListener(new buttonHandler());
		
	}
	
	//when you pass stuff around, this is a good way to do it.
	// this way, you don't have constructor dependencies. You construct both objects, then set
	// the references to each other. 
	public void setInfoPanel(InfoPanel infoPanelIn)
	{
		theInfoPanel = infoPanelIn;
	}
	
	public class buttonHandler implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			String temp = someText.getText();
			theInfoPanel.setText(temp);
			
		}
		
	}
	
	
	
	
}
