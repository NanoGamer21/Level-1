import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class cliker implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton button; 
public static void main(String[] args) {
	new cliker().createUI();
}
public void createUI() {
	frame=new JFrame();
    panel=new JPanel();
    button=new JButton("click Me");
    frame.add(panel);
    panel.add(button);
    button.addActionListener(this);
    frame.pack();
    frame.setVisible(true);
    
}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
if(arg0.getSource()==button) {
	JOptionPane.showMessageDialog(null, "you cliked me thanks.");
}
}
}
