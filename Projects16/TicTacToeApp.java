package projects16;

import java.awt.*;
import javax.swing.*;

public class TicTacToeApp {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500, 400);
		frame.add(new TicTacToeControll());
		frame.setTitle("Tic Tac Toe");
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
