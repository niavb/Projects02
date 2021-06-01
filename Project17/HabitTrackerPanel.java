package app;

import java.io.FileNotFoundException;

import javax.swing.JPanel;

public class HabitTrackerPanel extends JPanel {
	HabitTracker ht;
	int habitsRow = 2;
	
	public HabitTrackerPanel() {
		try {
			ht = new HabitTracker("src/app/savedProgress.txt", habitsRow);
			//print maze before
			for(int i = 0; i < ht.table.length; i++) {
				for(int j = 0; j < ht.table[i].length; j++) {
					System.out.print(ht.table[i][j]);
				}
				System.out.println();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
