package projects03;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SierpinskiTriangleFrame extends JFrame {
	static int r = 0, gr = 0, b = 255;

//	private JTextField jtfOrder = new JTextField("0", 5); // Order
	private static int order = 0;
	private JButton plus = new JButton("+");
	private JButton minus = new JButton("-");
	private SierpinskiTrianglePanel trianglePanel = new SierpinskiTrianglePanel(); // To display the pattern

	public SierpinskiTriangleFrame() {
		// Panel to hold label, text field, and a button
		JPanel panel = new JPanel();
		panel.add(new JLabel("Enter an order: "));
		panel.add(minus);
		panel.add(plus);
		
		// Add a Sierpinski triangle panel to the frame
		add(trianglePanel);
		add(panel, BorderLayout.SOUTH);
		
		// Register a listener
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				order++;
				trianglePanel.setOrder(order);
			}
		});

		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (order != 0) {
					order--;
					trianglePanel.setOrder(order);
				}
			}
		});

	}

}
