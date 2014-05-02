import java.awt.BorderLayout;

import javax.swing.JFrame;


public class MainFrame extends JFrame implements Runnable
{

	public MainFrame()
	{
		ControlPanel theControlPanel = new ControlPanel();
		InfoPanel theInfoPanel = new InfoPanel();
		
		//this is the magic.  Create a special purpose function to allow you to pass the panel to the other panel
		theControlPanel.setInfoPanel(theInfoPanel);
		
		setLayout(new BorderLayout());
		add(theControlPanel,BorderLayout.PAGE_START);
		add(theInfoPanel,BorderLayout.CENTER);
	}
	
	public void run()
	{
		setSize(700,300);
		setTitle("A silly program");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
