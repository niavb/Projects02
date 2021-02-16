package projects03;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JPanel;

public class SierpinskiTrianglePanel extends JPanel {
	private int order = 0;

	/** Set a new order */
	public void setOrder(int order) {
		this.order = order;
		repaint();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// Select three points in proportion to the panel size
		Point p1 = new Point(getWidth() / 2, 10);
		Point p2 = new Point(10, getHeight() - 10);
		Point p3 = new Point(getWidth() - 10, getHeight() - 10);
		displayTriangles(g, order, p1, p2, p3, 0);
	}

	private static void displayTriangles(Graphics g, int order, Point p1, Point p2, Point p3, int R) {
		if (order == 0) {
			// Draw a triangle to connect three points
			g.drawLine(p1.x, p1.y, p2.x, p2.y);
			g.drawLine(p1.x, p1.y, p3.x, p3.y);
			g.drawLine(p2.x, p2.y, p3.x, p3.y);
			//fill triangle
			int xpoints[] = {p1.x, p2.x, p3.x};
			int ypoints[] = {p1.y, p2.y, p3.y};
			Color myColor = new Color(R, 153, R+10);
			g.setColor(myColor);
			g.fillPolygon(xpoints, ypoints, 3);
		} else {
			// Get the midpoint on each edge of the triangle
			Point p12 = midpoint(p1, p2);
			Point p23 = midpoint(p2, p3);
			Point p31 = midpoint(p3, p1);
			// Recursively display three triangles
			displayTriangles(g, order - 1, p1, p12, p31, R+10);
			displayTriangles(g, order - 1, p12, p2, p23, R+20);
			displayTriangles(g, order - 1, p31, p23, p3, R+30);
		}
	}

	private static Point midpoint(Point p1, Point p2) {
		return new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
	}
	
}