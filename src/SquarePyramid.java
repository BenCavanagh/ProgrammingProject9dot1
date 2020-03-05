
public class SquarePyramid extends RectangularPyramid {
	private double _l;
	private double _h;
	
	public SquarePyramid(Double a, Double h) {
		super(a, h);
		_l = a;
		_h = h;
	}
	
	public double getVolume() {
		return Math.pow(_l, 2) * (_h / 3);
	}
	
	public double getSurfaceArea() {
		return (2 * _l) * Math.sqrt(Math.pow(_l, 2) / 4  + Math.pow(_h, 2)) + Math.pow(_l, 2);
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
