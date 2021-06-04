package project02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class HabitTrackerControll extends JPanel{
	private HabitTrackerPanel htPanel = new HabitTrackerPanel();
	private JComboBox<String> dropDownMenuWithHabits = new JComboBox<String>();
	private JButton doneBtn = new JButton("Done");
	private JButton missedBtn = new JButton("Missed");
	private JButton deleteBtn = new JButton("Delete");
	private JTextField habitToAdd = new JTextField();
	private JButton addBtn = new JButton("Add");
	
	public HabitTrackerControll(){
		setLayout(new BorderLayout());
		htPanel.setBounds(0, 0, 400, 400);
		add(htPanel, BorderLayout.CENTER);
		JPanel controllPanel = new JPanel();
		controllPanel.setBounds(410, 0, 200, 400);
		controllPanel.setLayout(new BoxLayout(controllPanel, BoxLayout.Y_AXIS));
		controllPanel.add(dropDownMenuWithHabits);
		controllPanel.add(doneBtn);
		controllPanel.add(missedBtn);
		controllPanel.add(deleteBtn);
		controllPanel.add(habitToAdd);
		controllPanel.add(addBtn);
		add(controllPanel, BorderLayout.EAST);
		
		doneBtn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		missedBtn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		deleteBtn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		addBtn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				htPanel.addHabitRow("src/project02/savedProgress.txt");
			}
			
		});
	}
	
	
}
