import java.awt.*;

import java.awt.event.*;

public class Monitor implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.out.println("a button has been pressed"+
				"the relative info is:\n"+e.getActionCommand());
	}
}