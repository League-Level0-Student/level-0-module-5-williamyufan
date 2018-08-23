import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
public static void main(String[] args) {

SkillPractice skills = new SkillPractice();
          	skills.skill1();
          	skills.skill2();
          	skills.skill3();
          	skills.skill4();
          	skills.skill5();
}

void skill1() {
// Use pop-ups for the following.
// Ask the user how many dimes they have

String Dimes=JOptionPane.showInputDialog(null, "How many dimes do you have????????????????");


// Tell them how many cents they have (hint multiply by 10)

 int Dime=Integer.parseInt(Dimes);
System.out.println( Dime*10 );



// Ask the user how tall they are (inches)

String Tall=JOptionPane.showInputDialog(null, "How tall are you??????(in inches)");


// If they are shorter than 36 inches, tell them to eat their Wheaties


int tall=Integer.parseInt(Tall);
if(tall<36) {
	
	System.out.println("Wheaties!!!!!");
}


}

void skill2() { 
	
	
	// Write a loop to print every third number between 1 and 30 to the console 


	for(int i=1; i<=30; i+=3) {
		
		System.out.println(i);
		
	}

}

void skill3() { // Get a random number that is less than 20 and print it to the console 

Random gen=new Random();


int num=gen.nextInt(20);


// Get another random number that is less than 10 and print it to the console 

Random gen1=new Random();


int numm=gen1.nextInt(10);

// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction 

System.out.println(num+"-"+numm+"="+(num-numm));

}

void skill4() { // In a pop-up, ask the user for the city they live in 


	String City=JOptionPane.showInputDialog(null, "Whcih City Do You Live In??");

// If they answered "San Diego", tell them they live in America's Finest City 

if(City.equals("New York City")) {
	System.out.println("You live in the finest city in America!!");
}
else {
	System.out.println("Move to New York City");
}

// Otherwise, tell them to move to San Diego 



// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 

String car=JOptionPane.showInputDialog(null, "How many cars do you have?????");
int cars=Integer.parseInt(car);

if(cars==0) {
	System.out.println("I bet you use public transportation.");
}
else if(cars==1) {
	System.out.println("Porshe!");
}
else {
	System.out.println(cars*4);
}
// If there is 1 car, use a pop-up to display the make/model of the car 



// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them. 



}

void skill5() { // In a pop-up, ask the user for the name of their school 



// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message. 

	
	String school=JOptionPane.showInputDialog(null, "What is the FULL name of your school??????");
	
JOptionPane.showMessageDialog(null, school+" is a amazing school!!!!!!!!!!!!!!!!!!!!");


}
}
