import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
	   	Robot bob=new Robot();
	 	bob.setSpeed(100);
	 	bob.miniaturize();
	 	bob.sparkle();
		
		
		//1. Create a new Robot

		//2. Set the speed to 100

		int colorChoice=JOptionPane.showOptionDialog(null, "hello", "title", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Yellow","Blue", "Red"}, 0);   
		
		if(colorChoice==0) {
			bob.setPenColor(0,100,100);
		}
		else if(colorChoice==1) {
			bob.setPenColor(0,0,240);
		}
		else if(colorChoice==2) {
			bob.setPenColor(240,0,0);
		}
		
		String polygon=JOptionPane.showInputDialog(null, "How many polygons do you want???????");
		
		
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		
		//4. Ask the use how many polygons they want to be drawn.
		
		//5. Use the robot to draw the number of polygons the user requested.
		int numberofpolygon=Integer.parseInt(polygon);
		for(int i=0; i<=numberofpolygon; i++) {
			bob.penDown();
			bob.move(20);
			bob.turn(90);
			bob.move(20);
			bob.turn(90);
			bob.move(20);
			bob.turn(90);
			bob.move(20);
			bob.penUp();
			bob.move(40);
			bob.turn(90);
		}
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
}

