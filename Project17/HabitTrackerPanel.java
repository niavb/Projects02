package project02;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
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
	
	public void addHabitRow(String filePath){
		this.habitsRow++;
		System.out.print(habitsRow);
		for(int i = 0; i < ht.table.length; i++) {
			for(int j = 0; j < ht.table[i].length; j++) {
				System.out.print(ht.table[i][j]);
			}
			System.out.println();
		}
		repaint();
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.WHITE);
		int width = getWidth()/ht.table[0].length - 2;
		int height = getHeight()/habitsRow - 2;
		for (int i = 0; i < ht.table.length; i++) {
			for (int j = 0; j < ht.table[i].length; j++) {
				if (ht.table[i][j] == 0 ) {
					g.fillRect(2 + j * (width + 2), 2 + i * (height + 2), width, height);
				} 
			}
		}
		g.setColor(Color.BLACK);
		Graphics2D g1 = (Graphics2D) g;
		g1.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		Font font = new Font("Serif", Font.PLAIN, 22);
		g1.setFont(font);
		g1.drawString("Habit", width/4, height / 2);
		
		}

}
