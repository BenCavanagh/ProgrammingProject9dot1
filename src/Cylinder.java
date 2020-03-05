
public class Cylinder extends Circle{
	public double _r;
	public double _h;
	
	public double getRadius() {
		return this._r;
	}
	
	public double getHeight() {
		return this._h;
	}
	
	public Cylinder(Double r, Double h) {
		this._r = r;
		this._h = h;
	}
	
	public double getVolume() {
		return (Math.PI * Math.pow(this._r, 2)) * this._h;
	}
	
	public double getSurfaceArea() {
		return (2.0 * Math.PI * this._r * this._h) + (2 * Math.PI * Math.pow(this._r, 2));
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
