import java.util.*;
public class Sphere extends Circle{
	// field data
	private double _radius;
	// constructor
	public Sphere(Double radius) {
		this._radius = radius;
	}
	public double getVolume() {
		return (4.0 / 3.0) * Math.PI * (Math.pow(this._radius, 3));
	}
	public double getSurfaceArea() {
		return 4.0 * Math.PI * Math.pow(this._radius, 2);
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
