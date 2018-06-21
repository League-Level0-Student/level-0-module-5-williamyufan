import javax.swing.JOptionPane;

public class primeornot {
	
	public static void main(String[] args) {
		
		String prime=JOptionPane.showInputDialog(null, "Ask a number and we will tell you whether it's prime or \"Severus Snape\" or not a prime number");
		
		int pri=Integer.parseInt(prime);
		
		for(int i=2; i<pri; i++) {
			if(pri%i==0) {
				JOptionPane.showMessageDialog(null, "\"Severus Snape\" or not a prime number ");
				System.exit(0);
				
			}
			JOptionPane.showMessageDialog(null, "Prime Number");
		}
	}

}
