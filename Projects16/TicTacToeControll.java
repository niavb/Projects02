package projects16;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class TicTacToeControll extends JPanel {
	TicTacToePanel gamePanel = new TicTacToePanel();
	JPanel textPanel = new JPanel();
	JLabel nextTurnLabel = new JLabel("X's turn");
	JPanel buttonPanel = new JPanel();

	public TicTacToeControll() {

		setLayout(new BorderLayout());
		add(gamePanel, BorderLayout.CENTER);
		textPanel.add(nextTurnLabel);
		add(textPanel, BorderLayout.SOUTH);
		
		gamePanel.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				int x, y;
				int width = gamePanel.getWidth()/3;
				int height = gamePanel.getHeight()/3;
				
				if(e.getX()<=width) x = 0;
				else if(e.getX()>width && e.getX()<=2*width) x = 1;
				else x = 2;
				
				if(e.getY()<=height) y = 0;
				else if(e.getY()>height && e.getY()<=2*height) y = 1;
				else y = 2;
				gamePanel.playTurn(x, y);
				gamePanel.checkNextStep();
				nextTurnLabel.setText(gamePanel.nextTurnOrWinText);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});


	}

}
