
public class RectangularPrism extends Rectangle{
	private double _l;
	private double _w;
	private double _h;
	
	public RectangularPrism(Double l, Double w, Double h) {
		this._l = l;
		this._w = w;
		this._h = h;
	}
	
	public RectangularPrism(Double l) {
		this._l = l;
	}
	
	public double getVolume() {
		return this._l * this._w * this._h;
	}
	
	public double getSurfaceArea() {
		return ((_w * _l) + (_h * _l) + (_h * _w)) * 2;
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
