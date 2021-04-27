package projects14;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle>{
	public int compare(Circle o1, Circle o2) {
		return o1.r - o2.r;
	}

}
