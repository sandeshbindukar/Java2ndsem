import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class Gui extends JFrame implements ActionListener{
	JTextField binduField, cdpField, resultField;
	JButton addBtn,subBtn,multBtn, divBtn;	
	public static void main(String[] args) {
		new Gui();
	}
	public Gui()
	{	
		setSize(200, 200);
		setLocationRelativeTo(null);
		Container cont = getContentPane();
		cont.setLayout(new FlowLayout());
		binduField = new JTextField(10);
		cont.add(binduField);
		cdpField = new JTextField(10);
		cont.add(cdpField);
		resultField = new JTextField(10);
		cont.add(resultField);
		addBtn = new JButton("+");
		cont.add(addBtn);
		addBtn.addActionListener(this);
		subBtn = new JButton("-");
		cont.add(subBtn);
		subBtn.addActionListener(this);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent event) {
		String s1 = binduField.getText();
		int first = Integer.parseInt(s1);
		String s2 = cdpField.getText();
		int second = Integer.parseInt(s2);
		double res = 0;
		if(event.getSource()==addBtn)
		{
			res= first+second;
			
		}
		if(event.getSource()==subBtn)
		{
			res= first-second;
		}
		
			String result = Double.toString(res);
			resultField.setText(result);
	}
 
}
