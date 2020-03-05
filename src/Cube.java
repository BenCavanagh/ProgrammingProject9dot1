
public class Cube extends RectangularPrism{
	private double _l;
	
	public Cube(double l) {
		super(l);
		_l = l;
	}
	
	public double getVolume() {
		//System.out.println(Math.pow(_l, 3));
		return Math.pow(_l, 3);
	}
	
	public double getSurfaceArea() {
		return Math.pow(_l, 2) * 6;
	}
	
	public int compareTo(Shape3D other) {
		if (this.getVolume() == other.getVolume()) {
			return 0;
		}
		if (this.getVolume() > other.getVolume()) {
			return 1;
		} else {
			return -1;
		}
	}
}
