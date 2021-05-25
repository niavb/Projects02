package projects15;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MazeControll extends JPanel {
	private MazePanel mazePanel = new MazePanel();
	private JButton findPathBtn = new JButton("Find Path");
	private JButton cleanPathBtn = new JButton("Reset");
	
	public MazeControll(){
		setLayout(new BorderLayout());
		add(mazePanel, BorderLayout.CENTER);
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(findPathBtn);
		buttonPanel.add(cleanPathBtn);
		add(buttonPanel, BorderLayout.SOUTH);
		
		findPathBtn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mazePanel.findPath();
			}
			
		});
		
		cleanPathBtn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				mazePanel.cleanPath();
			}
			
		});
		
	}
	
	

}