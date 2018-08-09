/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

public class CircleRing {
    public static void main(String[] args) throws Exception {

    	Robot bob=new Robot();
    	bob.setX(150);
    	bob.setY(200);
    	bob.penDown();
    	bob.setSpeed(1000);
    	bob.miniaturize();
    	bob.sparkle();
    	for(int i=0; i<=360; i++) {
    		bob.move(3);
    		bob.turn(1);
    		if(i%20==0) {
    			for(int m=0; m<=360; m++) {
        			bob.move(1);
        			bob.turn(1);
    		}
    		
    		}
    	}
    	
        
}
}
