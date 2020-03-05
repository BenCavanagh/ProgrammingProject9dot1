
public class RectangularPyramid extends Rectangle{
	private double _l;
	private double _w;
	private double _h;
	
	public RectangularPyramid(Double l, Double w, Double h) {
		this._l = l;
		this._w = w;
		this._h = h;
	}
	
	public RectangularPyramid(Double l, Double h) {
		this._l = l;
		this._h = h;
	}
	
	public double getVolume() {
		return (_l * _w * _h) / 3;
	}
	
	public double getSurfaceArea() {
		// p stands for part - I split the equation into two parts since it was complicated
		double p1;
		double p2;
		p1 = ((_l * _w)) + (_l * Math.sqrt(Math.pow(_w / 2.0, 2) + Math.pow(_h, 2)));
		p2 = _w * Math.sqrt(Math.pow((_l / 2), 2) + Math.pow(_h, 2));
		return p1 + p2;
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
