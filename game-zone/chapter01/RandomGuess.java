import javax.swing.JOptionPane;

public class RandomGuess {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Think of a number from 1 to 10");
		JOptionPane.showMessageDialog(null, "The number is " + (1 + (int)(Math.random() * 10)));

	}

}
