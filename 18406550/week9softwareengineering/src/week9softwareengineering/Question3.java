package week9softwareengineering;

import javax.swing.*;

public class Question3 {
	public static void main(String[] args){
		int index =0;
		boolean check = false;
		char[] sizeArrays = {'S', 'M', 'L', 'X'};
		double[] priceArrays = {6.99, 8.99, 12.50, 15.00}; 
		char size= JOptionPane.showInputDialog("Enter the size of pizza: ").charAt(0);
		for(int i=0; i<sizeArrays.length;i++){
			if(size == sizeArrays[i]){
				index = i;
				check = true;
				break;
			}
		}
		if(check){
			JOptionPane.showMessageDialog(null, "$ " +priceArrays[index]);
		}
		else
			JOptionPane.showMessageDialog(null, "Tetro pizza ya bandaina ");
	}
} 
