
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Code4Life {
	public static void main(String[] args) {
		
	

	String code = JOptionPane.showInputDialog(null, "How many hours did you spent coding this week?");
	int code1=Integer.parseInt(code);
	if(code1<=2)
	{
		System.out.println("Stop watching YouTube and write code instead!!!!!!!!!!!");
	}
	else if(3<=code1&&code1<=5)
	{
		System.out.println("You are a Code Ninja!");
	}else
	{playBatmanTheme();
	}}

	

	private static void playBatmanTheme() {
    	try {
   		 Clip clip = AudioSystem.getClip();
   		 clip.open(AudioSystem.getAudioInputStream(Code4Life.class.getResource("batman.wav")));
   		 clip.start();
   		 Thread.sleep(60002);
   	} catch (Exception ex) {
     	ex.printStackTrace();
   	}
    }
}
