
public interface Shape3D extends Comparable<Shape3D> {
    public double getSurfaceArea();
    public double getVolume();
    public int compareTo(Shape3D other);
}
