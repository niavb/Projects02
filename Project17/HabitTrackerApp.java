package project02;

import javax.swing.JFrame;

public class HabitTrackerApp {
	public static void main(String[] args){
		JFrame frame = new JFrame();
		frame.setSize(500, 400);
		frame.add(new HabitTrackerControll());
		frame.setTitle("Habit Tracker");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
