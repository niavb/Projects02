package test01;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VidimSpektur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JPanel controlPanel = new JPanel();
		controlPanel.setSize(400, 100);
		panel.add(controlPanel);
		
		JPanel colorPanel = new JPanel();
		colorPanel.setSize(400, 300);
		panel.add(colorPanel);
		
		JLabel label = new JLabel("Enter lenght: ");
		controlPanel.add(label);
		
		JTextField lenght = new JTextField("0", 5);
		controlPanel.add(lenght);
		
		JButton checkButton = new JButton("See color");
		controlPanel.add(checkButton);
		
		checkButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int lenght1 = Integer.valueOf(lenght.getText());
				if(lenght1<750 && lenght1>=620 ) {
					colorPanel.setBackground(Color.RED);
				}else if(lenght1<620 && lenght1>=590 ){
					colorPanel.setBackground(Color.ORANGE);
				}else if(lenght1<590 && lenght1>=570 ){
					colorPanel.setBackground(Color.YELLOW);
				}else if(lenght1<570 && lenght1>=495 ){
					colorPanel.setBackground(Color.GREEN);
				}else if(lenght1<495 && lenght1>=450 ){
					colorPanel.setBackground(Color.BLUE);
				}else if(lenght1<450 && lenght1>=380 ){
					colorPanel.setBackground(Color.PINK);
				}else {
					colorPanel.setBackground(Color.WHITE);
				}

			}
		});

		
		frame.setVisible(true);

	}

}
