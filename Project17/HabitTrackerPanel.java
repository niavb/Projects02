package project02;

import java.awt.Color;
import java.awt.Graphics;
import java.io.FileNotFoundException;
import javax.swing.JPanel;

public class HabitTrackerPanel extends JPanel {
	HabitTracker ht;
	int habitsRow = 2;
	
	public HabitTrackerPanel() {
		try {
			ht = new HabitTracker("src/project02/savedProgress.txt", habitsRow);
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
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.WHITE);
		int width = getWidth()/ht.table[0].length - 2;
		int height = getHeight()/ht.table.length - 2;
		for (int i = 0; i < ht.table.length; i++) {
			for (int j = 0; j < ht.table[i].length; j++) {
				if (ht.table[i][j] == 0 ) {
					g.fillRect(2 + j * (width + 2), 2 + i * (height + 2), width, height);
					// System.out.print(m.maze[i][j]);
				} 
			}
//			System.out.println();
		}
		
		
		}

}
