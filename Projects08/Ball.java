package projects08;

import java.awt.Color;
import java.util.Comparator;
import java.util.Random;

class Ball implements Comparable<Ball>{
	Random rn = new Random();
	int x = 0;
	int y = 0; // Current ball position
	int dx = 2; // Increment on ball's x-coordinate
	int dy = 2; // Increment on ball's y-coordinate
	int radius = rn.nextInt(19) + 2; // Ball radius
	Color color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));

	@Override
	public int compareTo(Ball o) {
		// TODO Auto-generated method stub
		return o.radius - this.radius;
	}
}
