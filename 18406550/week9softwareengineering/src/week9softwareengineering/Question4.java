package week9softwareengineering;

import javax.swing.JOptionPane;

public class Question4 {
	public static void main(String[] args){
		int index = 0;
		boolean check = false;
		int[] IdArrays = new int[2] ;
		String[] lNameArrays = new String[2];
		for(int i=0; i<IdArrays.length; i++){
			IdArrays[i]= Integer.parseInt(JOptionPane.showInputDialog("Enter the employee id: "));
			lNameArrays[i] = JOptionPane.showInputDialog("Enter last names:");
		}
		int id =Integer.parseInt(JOptionPane.showInputDialog("Enter the employee id to view: "));
		for(int i=0; i<IdArrays.length; i++){
			if(id == IdArrays[i]){
				index = i;
				check = true;
				break;
			}
		}
		if(check){
			JOptionPane.showMessageDialog(null, lNameArrays[index]);
		}
		else
			JOptionPane.showMessageDialog(null, "Yo thar vako manxey ya kam gardaina ");
	}
} 

