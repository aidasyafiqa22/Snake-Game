
/**
 * An simplified version of snake game in java  
 * Using Threads and Java Swing to display the game
 * Written and modified by Aida Syafiqa with Internet References
 * 
 * Played using arrow keys, if lose, close and re-open to restart game
 */
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
            //Creating the window with all snake features
            Window f1= new Window();
		
            //Setting up the window settings
            f1.setTitle("Snake");
            f1.setSize(300,300);
            f1.setVisible(true);
            f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             

	}
}
