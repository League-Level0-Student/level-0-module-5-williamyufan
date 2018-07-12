/*
 *    Copyright (c) The League of Amazing Programmers 2013-2018
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {
		String goofyName = "";

		String name=JOptionPane.showInputDialog(null, "What is your FULL name?");

		System.out.println(name.toUpperCase());

		for(int i=0; i<name.length(); i++) {
			String cha=name.substring(i,i+1);
			if(i%2 ==0) {
				cha=cha.toUpperCase();
			}
			else {
				cha=cha.toLowerCase();
				
			}
			goofyName+=cha;
		}
		System.out.println(goofyName);
		
	
		
	}
}

