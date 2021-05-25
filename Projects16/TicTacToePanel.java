package projects16;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class TicTacToePanel extends JPanel{
	public int[][] gameField = new int[3][3];
	String nextTurnOrWinText = "X's turn";
	boolean thereIsWin = false;
	int XsMoves = 0;
	int OsMoves = 0;
	BufferedImage imageX, imageO;
	
	public TicTacToePanel() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				this.gameField[i][j] = 0;
			}
		}
	}
	
	public boolean wonTTT(int winnerNumber) {
		if ((gameField[0][0]==winnerNumber && gameField[1][1]==winnerNumber && gameField[2][2]==winnerNumber)
				|| (gameField[2][0]==winnerNumber && gameField[1][1]==winnerNumber && gameField[0][2]==winnerNumber)
				|| (gameField[0][0]==winnerNumber && gameField[0][1]==winnerNumber && gameField[0][2]==winnerNumber)
				|| (gameField[1][0]==winnerNumber && gameField[1][1]==winnerNumber && gameField[1][2]==winnerNumber)
				|| (gameField[2][0]==winnerNumber && gameField[2][1]==winnerNumber && gameField[2][2]==winnerNumber)
				|| (gameField[0][0]==winnerNumber && gameField[1][0]==winnerNumber && gameField[2][0]==winnerNumber)
				|| (gameField[0][1]==winnerNumber && gameField[1][1]==winnerNumber && gameField[2][1]==winnerNumber)
				|| (gameField[0][2]==winnerNumber && gameField[1][2]==winnerNumber && gameField[2][2]==winnerNumber)) {
			return true;
		}else {
			return false;
		}	
	}
	
	public void playTurn(int x, int y) {
		if(!thereIsWin) {
			if(nextTurnOrWinText == "X's turn" && gameField[x][y]==0) {
				this.gameField[x][y]=1;
				XsMoves++;
			}else if(nextTurnOrWinText == "O's turn" && gameField[x][y]==0) {
				this.gameField[x][y]=2;
				OsMoves++;
			}
		}
		repaint();
	}
	
	public void checkNextStep() {
		if(wonTTT(1)) {
			thereIsWin = true;
			this.nextTurnOrWinText = "X won";
		}else if(wonTTT(2)) {
			thereIsWin = true;
			this.nextTurnOrWinText = "O won";
		}else if(XsMoves==OsMoves) {
			this.nextTurnOrWinText = "X's turn";
		}else if(XsMoves>OsMoves) {
			boolean isTie = true;
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					if(gameField[i][j] == 0) isTie = false;
				}
			}
			if(!isTie) {
				this.nextTurnOrWinText = "O's turn";
			}else {
				thereIsWin=true;
				this.nextTurnOrWinText = "Tie";
			}
		}
	}
	
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.WHITE);
		int width = getWidth()/3 - 2;
		int height = getHeight()/3 - 2;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(gameField[i][j]==0) {
				g.fillRect(2 + i * (width + 2), 2 + j * (height + 2), width, height);
				}
			}
		}
		try {
			imageX = ImageIO.read(new File("D:\\Eclipse Work\\Exercises2\\src\\projects16\\x.jpg"));
			imageO = ImageIO.read(new File("D:\\Eclipse Work\\Exercises2\\src\\projects16\\o.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		g.setColor(Color.RED);
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(gameField[i][j]==1) {
//				g.fillRect(2 + i * (width + 2), 2 + j * (height + 2), width, height);
				g.drawImage(imageX, 2 + i * (width + 2), 2 + j * (height + 2), width, height, this);
				}
			}
		}
//		g.setColor(Color.GREEN);
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(gameField[i][j]==2) {
//				g.fillRect(2 + i * (width + 2), 2 + j * (height + 2), width, height);
				g.drawImage(imageO, 2 + i * (width + 2), 2 + j * (height + 2), width, height, this);
				}
			}
		}

		
	}

}
