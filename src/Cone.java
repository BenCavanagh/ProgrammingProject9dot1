
public class Cone extends Cylinder{
	private double _r;
	private double _h;
	
	public Cone(Double r, Double h) {
		super(r, h);
		_r = r;
		_h = h;
	}
	
	public double getVolume() {
		return (_h / 3.0) * Math.pow(_r, 2) * Math.PI;
	}
	
	public double getSurfaceArea(){
		double p1 = Math.sqrt(Math.pow(_h, 2) + Math.pow(_r, 2));
		return (p1 + _r) * _r * Math.PI;
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
