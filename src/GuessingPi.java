/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GuessingPi {
	public static void main(String[] args) {
		String Pi="3.141592653589793238462643383279502884197169399375105820974944592307816406286208998628034825342117067982148086513282306647093844609550582231725359408128481117450284102701938521105559644622948954930381964428810975665933446128475648233786783165271201909145648566923460348610454326648213393607260249141273724587006606315588174881520920962829254091715364367892590360011330530548820466521384146951941511609433057270365759591953092186117381932611793105118548074462379962749567351885752724891227938183011949129833673362440656643086021394946395224737190702179860943702770539217176293176752384674818467669405132000568127145263560827785771";
		
	System.out.println(	Pi.charAt(0) );
	System.out.println(Pi.charAt(2));
	System.out.println(Pi.charAt(3));
	
	for(int i=0; i<4; i++) {
		
		for(int w=4; w<=Pi.length(); w++) {
			
			String N=JOptionPane.showInputDialog(null, "What is the next digit of Pi (If you get one wrong, it goes back to the begining)");
			
			if(N.equals(Pi.charAt(w)+"")){
				
				JOptionPane.showMessageDialog(null, "Correct");
			}
			else {
				
				JOptionPane.showMessageDialog(null, "InCorrect");
				break;
			}
		
		}
	}
		
	}
// 2. Make a String variable to hold the value of Pi.
		//    Get the first few digits from http://www.piday.org/million/.

		// 3. Print out the first 3 digits of Pi to the console.
		//    The first value is "pi.charAt(0)", the second is "pi.charAt(1)", etc.
		//    Run your program to see how this works.

		// 9. If you want to give the user more than one chance to guess,
		//    put a for loop around steps 4-8.

			// 4. Create a for loop that will step through each digit of pi (steps 5-8)
			//    NOTE: The number of digits in your string will be
			//       yourStringVariable.length()

				// 5. Ask the user for the NEXT digit of pi.

				// 6. Compare the user's input to the next digit of your pi variable 
				//    (look at step 3 for a clue).
				//    HINT: use charAt(0) to get 1st char of user input String 

					// 7. If they are correct, print out "correct".

					// 8. If they are not, print out "incorrect" and tell them
					//    to start over. Use 'break;' to break out of the loop.

}


