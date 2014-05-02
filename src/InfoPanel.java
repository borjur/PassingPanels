import javax.swing.JPanel;
import javax.swing.JTextArea;


public class InfoPanel extends JPanel
{
	JTextArea textLabel = new JTextArea(10,30);

	public InfoPanel()
	{
		textLabel.setLineWrap(true);
		add(textLabel);
	}
	
	public void setText(String textIn)
	{
		String temp = textLabel.getText();
		textLabel.setText(temp+ " "+ textIn);
	}
	
}
