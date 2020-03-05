import junit.framework.TestCase;
import java.util.Arrays;

public class Shape3DTest extends TestCase {

    //////////////////////////////////////////////////////////////////////
    //
    // Cone tests
    //

    // construct a simple Cone, test the getSurfaceArea() computation
    public void testConeSurfaceArea() {
        Cone c = new Cone(3.0, 4.0);
        assertEquals(75.39822, c.getSurfaceArea(), 0.00001);
    }

    // construct a simple Cone, test the getVolume() computation
    public void testConeVolume() {
        Cone c = new Cone(3.0, 4.0);
        assertEquals(37.69911, c.getVolume(), 0.00001);
    }

    // Cone should have implemented the Shape3D interface
    public void testConeIsShape3D() {
        Cone c = new Cone(3.0, 4.0);
        assertTrue(c instanceof Shape3D);
    }

    // Cone should be comparable
    public void testConeIsComparable() {
        Cone c = new Cone(3.0, 4.0);
        assertTrue(c instanceof Comparable);
    }

    // construct an array of Cones and test sorting
    public void testSortedConeList1of3() {
        Cone c1 = new Cone(1.0, 2.0);
        Cone c2 = new Cone(2.0, 3.0);
        Cone c3 = new Cone(3.5, 4.5);

        Shape3D[] shapes = { c3, c1, c2 };
        Arrays.sort(shapes);
        assertEquals(c1, shapes[0]);
    }

    public void testSortedConeList2of3() {
        Cone c1 = new Cone(1.0, 2.0);
        Cone c2 = new Cone(2.0, 3.0);
        Cone c3 = new Cone(3.5, 4.5);

        Shape3D[] shapes = { c3, c1, c2 };
        Arrays.sort(shapes);
        assertEquals(c2, shapes[1]);
    }

    public void testSortedConeList3of3() {
        Cone c1 = new Cone(1.0, 2.0);
        Cone c2 = new Cone(2.0, 3.0);
        Cone c3 = new Cone(3.5, 4.5);

        Shape3D[] shapes = { c3, c1, c2 };
        Arrays.sort(shapes);
        assertEquals(c3, shapes[2]);
    }

    //////////////////////////////////////////////////////////////////////
    //
    // Cube tests
    //

    // construct a simple Cube, test the getSurfaceArea() computation
    public void testCubeSurfaceArea() {
        Cube cube = new Cube(2.5);
        assertEquals(37.5, cube.getSurfaceArea(), 0.001);
    }

    // construct a simple Cube, test the getVolume() computation
    public void testCubeVolume() {
        Cube cube = new Cube(2.5);
        assertEquals(15.625, cube.getVolume(), 0.001);
    }

    // is Cube a derived class?  it should be.
    public void testCubeIsDerived() {
        Cube cube = new Cube(1.0);
        Class cls = cube.getClass();
        assertNotNull(cls.getSuperclass());
    }

    // Cube should have implemented the Shape3D interface
    public void testCubeIsShape3D() {
        Cube cube = new Cube(1.0);
        assertTrue(cube instanceof Shape3D);
    }

    // Cube should be comparable
    public void testCubeIsComparable() {
        Cube cube = new Cube(1.0);
        assertTrue(cube instanceof Comparable);
    }

    // construct an array of Cubes and test sorting
    public void testSortedCubeList1of3() {
        Cube cube1 = new Cube(1.0);
        Cube cube2 = new Cube(2.0);
        Cube cube3 = new Cube(3.0);

        Shape3D[] shapes = { cube3, cube1, cube2 };
        Arrays.sort(shapes);
        assertEquals(cube1, shapes[0]);
    }

    public void testSortedCubeList2of3() {
        Cube cube1 = new Cube(1.0);
        Cube cube2 = new Cube(2.0);
        Cube cube3 = new Cube(3.0);

        Shape3D[] shapes = { cube3, cube1, cube2 };
        Arrays.sort(shapes);
        assertEquals(cube2, shapes[1]);
    }

    public void testSortedCubeList3of3() {
        Cube cube1 = new Cube(1.0);
        Cube cube2 = new Cube(2.0);
        Cube cube3 = new Cube(3.0);
        
        Shape3D[] shapes = { cube3, cube1, cube2 };
        Arrays.sort(shapes);
        assertEquals(cube3, shapes[2]);
    }

    //////////////////////////////////////////////////////////////////////
    //
    // Cylinder tests
    //

    // construct a simple Cylinder, test the getSurfaceArea() computation
    public void testCylinderSurfaceArea()
    {
        Cylinder c = new Cylinder(3.0, 4.0);
        assertEquals(131.946891, c.getSurfaceArea(), 0.000001);
    }

    // construct a simple Cylinder, test the getVolume() computation
    public void testCylinderVolume()
    {
        Cylinder c = new Cylinder(3.0, 4.0);
        assertEquals(113.097336, c.getVolume(), 0.000001);
    }

    // Cylinder should have implemented the Shape3D interface
    public void testCylinderIsShape3D()
    {
        Cylinder c = new Cylinder(3.0, 4.0);
        assertTrue(c instanceof Shape3D);
    }

    // Cylinder should be comparable
    public void testCylinderIsComparable()
    {
        Cylinder c = new Cylinder(3.0, 4.0);
        assertTrue(c instanceof Comparable);
    }

    // construct an array of Cylinders and test sorting
    public void testSortedCylinderList1of3() {
        Cylinder c1 = new Cylinder(1.0, 2.0);
        Cylinder c2 = new Cylinder(2.0, 3.0);
        Cylinder c3 = new Cylinder(3.5, 4.5);

        Shape3D[] shapes = { c3, c1, c2 };
        Arrays.sort(shapes);
        assertEquals(c1, shapes[0]);
    }

    public void testSortedCylinderList2of3() {
        Cylinder c1 = new Cylinder(1.0, 2.0);
        Cylinder c2 = new Cylinder(2.0, 3.0);
        Cylinder c3 = new Cylinder(3.5, 4.5);

        Shape3D[] shapes = { c3, c1, c2 };
        Arrays.sort(shapes);
        assertEquals(c2, shapes[1]);
    }

    public void testSortedCylinderList3of3() {
        Cylinder c1 = new Cylinder(1.0, 2.0);
        Cylinder c2 = new Cylinder(2.0, 3.0);
        Cylinder c3 = new Cylinder(3.5, 4.5);

        Shape3D[] shapes = { c3, c1, c2 };
        Arrays.sort(shapes);
        assertEquals(c3, shapes[2]);
    }

    //////////////////////////////////////////////////////////////////////
    //
    // RectangularPrism tests
    //

    // construct a simple RectangularPrism, test the getSurfaceArea() computation
    public void testRectangularPrismSurfaceArea() {
        RectangularPrism rp = new RectangularPrism(3.0, 4.0, 5.0);
        assertEquals(94.0, rp.getSurfaceArea(), 0.001);
    }

    // construct a simple RectangularPrism, test the getVolume() computation
    public void testRectangularPrismVolume() {
        RectangularPrism rp = new RectangularPrism(3.0, 4.0, 5.0);
        assertEquals(60.0, rp.getVolume(), 0.001);
    }

    // RectangularPrism should have implemented the Shape3D interface
    public void testRectangularPrismIsShape3D() {
        RectangularPrism rp = new RectangularPrism(3.0, 4.0, 5.0);
        assertTrue(rp instanceof Shape3D);
    }

    // RectangularPrism should be comparable
    public void testRectangularPrismIsComparable() {
        RectangularPrism rp = new RectangularPrism(3.0, 4.0, 5.0);
        assertTrue(rp instanceof Comparable);
    }

    // construct an array of RectangularPrisms and test sorting
    public void testSortedRectangularPrismList1of3() {
        RectangularPrism rp1 = new RectangularPrism(1.0, 2.0, 3.0);
        RectangularPrism rp2 = new RectangularPrism(2.0, 3.0, 4.0);
        RectangularPrism rp3 = new RectangularPrism(3.5, 4.5, 5.5);

        Shape3D[] shapes = { rp3, rp1, rp2 };
        Arrays.sort(shapes);
        assertEquals(rp1, shapes[0]);
    }

    public void testSortedRectangularPrismList2of3() {
        RectangularPrism rp1 = new RectangularPrism(1.0, 2.0, 3.0);
        RectangularPrism rp2 = new RectangularPrism(2.0, 3.0, 4.0);
        RectangularPrism rp3 = new RectangularPrism(3.5, 4.5, 5.5);

        Shape3D[] shapes = { rp3, rp1, rp2 };
        Arrays.sort(shapes);
        assertEquals(rp2, shapes[1]);
    }

    public void testSortedRectangularPrismList3of3() {
        RectangularPrism rp1 = new RectangularPrism(1.0, 2.0, 3.0);
        RectangularPrism rp2 = new RectangularPrism(2.0, 3.0, 4.0);
        RectangularPrism rp3 = new RectangularPrism(3.5, 4.5, 5.5);

        Shape3D[] shapes = { rp3, rp1, rp2 };
        Arrays.sort(shapes);
        assertEquals(rp3, shapes[2]);
    }

    //////////////////////////////////////////////////////////////////////
    //
    // RectangularPyramid tests
    //

    // construct a simple RectangularPyramid, test the getSurfaceArea() computation
    public void testRectangularPyramidSurfaceArea() {
        RectangularPyramid rp = new RectangularPyramid(3.0, 4.0, 6.0);
        assertEquals(55.7123, rp.getSurfaceArea(), 0.0001);
    }

    // construct a simple RectangularPyramid, test the getVolume() computation
    public void testRectangularPyramidVolume() {
        RectangularPyramid rp = new RectangularPyramid(3.0, 4.0, 6.0);
        assertEquals(24.0, rp.getVolume(), 0.001);
    }

    // RectangularPyramid should have implemented the Shape3D interface
    public void testRectangularPyramidIsShape3D() {
        RectangularPyramid rp = new RectangularPyramid(3.0, 4.0, 6.0);
        assertTrue(rp instanceof Shape3D);
    }

    // RectangularPyramid should be comparable
    public void testRectangularPyramidIsComparable() {
        RectangularPyramid rp = new RectangularPyramid(3.0, 4.0, 6.0);
        assertTrue(rp instanceof Comparable);
    }

    // construct an array of RectangularPyramids and test sorting
    public void testSortedRectangularPyramidList1of3() {
        RectangularPyramid rp1 = new RectangularPyramid(1.0, 2.0, 3.0);
        RectangularPyramid rp2 = new RectangularPyramid(2.0, 3.0, 4.0);
        RectangularPyramid rp3 = new RectangularPyramid(3.5, 4.5, 5.5);

        Shape3D[] shapes = { rp3, rp1, rp2 };
        Arrays.sort(shapes);
        assertEquals(rp1, shapes[0]);
    }

    public void testSortedRectangularPyramidList2of3() {
        RectangularPyramid rp1 = new RectangularPyramid(1.0, 2.0, 3.0);
        RectangularPyramid rp2 = new RectangularPyramid(2.0, 3.0, 4.0);
        RectangularPyramid rp3 = new RectangularPyramid(3.5, 4.5, 5.5);

        Shape3D[] shapes = { rp3, rp1, rp2 };
        Arrays.sort(shapes);
        assertEquals(rp2, shapes[1]);
    }

    public void testSortedRectangularPyramidList3of3() {
        RectangularPyramid rp1 = new RectangularPyramid(1.0, 2.0, 3.0);
        RectangularPyramid rp2 = new RectangularPyramid(2.0, 3.0, 4.0);
        RectangularPyramid rp3 = new RectangularPyramid(3.5, 4.5, 5.5);

        Shape3D[] shapes = { rp3, rp1, rp2 };
        Arrays.sort(shapes);
        assertEquals(rp3, shapes[2]);
    }

    //////////////////////////////////////////////////////////////////////
    //
    // Sphere tests
    //

    // construct a simple Sphere, test the getSurfaceArea() computation
    public void testSphereSurfaceArea() {
        Sphere sphere = new Sphere(2.5);
        assertEquals(78.53982, sphere.getSurfaceArea(), 0.00001);
    }

    // construct a simple Sphere, test the getVolume() computation
    public void testSphereVolume() {
        Sphere sphere = new Sphere(2.5);
        assertEquals(65.44985, sphere.getVolume(), 0.00001);
    }

    // Sphere should have implemented the Shape3D interface
    public void testSphereIsShape3D() {
        Sphere sphere = new Sphere(1.0);
        assertTrue(sphere instanceof Shape3D);
    }

    // Sphere should be comparable
    public void testSphereIsComparable() {
        Sphere sphere = new Sphere(1.0);
        assertTrue(sphere instanceof Comparable);
    }

    // construct an array of Spheres and test sorting
    public void testSortedSphereList1of3() {
        Sphere sphere1 = new Sphere(1.0);
        Sphere sphere2 = new Sphere(2.0);
        Sphere sphere3 = new Sphere(3.0);

        Shape3D[] shapes = { sphere3, sphere1, sphere2 };
        Arrays.sort(shapes);
        assertEquals(sphere1, shapes[0]);
    }

    public void testSortedSphereList2of3() {
        Sphere sphere1 = new Sphere(1.0);
        Sphere sphere2 = new Sphere(2.0);
        Sphere sphere3 = new Sphere(3.0);

        Shape3D[] shapes = { sphere3, sphere1, sphere2 };
        Arrays.sort(shapes);
        assertEquals(sphere2, shapes[1]);
    }

    public void testSortedSphereList3of3() {
        Sphere sphere1 = new Sphere(1.0);
        Sphere sphere2 = new Sphere(2.0);
        Sphere sphere3 = new Sphere(3.0);

        Shape3D[] shapes = { sphere3, sphere1, sphere2 };
        Arrays.sort(shapes);
        assertEquals(sphere3, shapes[2]);
    }

    //////////////////////////////////////////////////////////////////////
    //
    // SquarePyramid tests
    //

    // construct a simple SquarePyramid, test the getSurfaceArea() computation
    public void testSquarePyramidSurfaceArea() {
        SquarePyramid sp = new SquarePyramid(2.5, 6.0);
        assertEquals(36.89413, sp.getSurfaceArea(), 0.00001);
    }

    // construct a simple SquarePyramid, test the getVolume() computation
    public void testSquarePyramidVolume() {
        SquarePyramid sp = new SquarePyramid(2.5, 6.0);
        assertEquals(12.5, sp.getVolume(), 0.001);
    }

    // is SquarePyramid a derived class?  it should be.
    public void testSquarePyramidIsDerived() {
        SquarePyramid sp = new SquarePyramid(1.0, 1.0);
        Class cls = sp.getClass();
        assertNotNull(cls.getSuperclass());
    }

    // SquarePyramid should have implemented the Shape3D interface
    public void testSquarePyramidIsShape3D() {
        SquarePyramid sp = new SquarePyramid(1.0, 1.0);
        assertTrue(sp instanceof Shape3D);
    }

    // SquarePyramid should be comparable
    public void testSquarePyramidIsComparable() {
        SquarePyramid sp = new SquarePyramid(1.0, 1.0);
        assertTrue(sp instanceof Comparable);
    }

    // construct an array of SquarePyramids and test sorting
    public void testSortedSquarePyramidList1of3() {
        SquarePyramid sp1 = new SquarePyramid(1.0, 6.0);
        SquarePyramid sp2 = new SquarePyramid(2.0, 6.0);
        SquarePyramid sp3 = new SquarePyramid(3.0, 6.0);

        Shape3D[] shapes = { sp3, sp1, sp2 };
        Arrays.sort(shapes);
        assertEquals(sp1, shapes[0]);
    }

    public void testSortedSquarePyramidList2of3() {
        SquarePyramid sp1 = new SquarePyramid(1.0, 6.0);
        SquarePyramid sp2 = new SquarePyramid(2.0, 6.0);
        SquarePyramid sp3 = new SquarePyramid(3.0, 6.0);

        Shape3D[] shapes = { sp3, sp1, sp2 };
        Arrays.sort(shapes);
        assertEquals(sp2, shapes[1]);
    }

    public void testSortedSquarePyramidList3of3() {
        SquarePyramid sp1 = new SquarePyramid(1.0, 6.0);
        SquarePyramid sp2 = new SquarePyramid(2.0, 6.0);
        SquarePyramid sp3 = new SquarePyramid(3.0, 6.0);

        Shape3D[] shapes = { sp3, sp1, sp2 };
        Arrays.sort(shapes);
        assertEquals(sp3, shapes[2]);
    }

    //////////////////////////////////////////////////////////////////////
    //
    // Shape tests
    //

    // constuct an array of 7 different shapes and test sorting
    public void testSortedShapeList1of2() {
        // volume = 113.097336
        Cylinder cylinder = new Cylinder(3.0, 4.0);

        // volume = 65.44985
        Sphere sphere = new Sphere(2.5);

        // volume = 60.0
        RectangularPrism rprism = new RectangularPrism(3.0, 4.0, 5.0);

        // volume = 37.69911
        Cone cone = new Cone(3.0, 4.0);

        // volume = 24.0
        RectangularPyramid rpyramid = new RectangularPyramid(3.0, 4.0, 6.0);

        // volume = 15.625
        Cube cube = new Cube(2.5);

        // volume = 12.5
        SquarePyramid spyramid = new SquarePyramid(2.5, 6.0);

        Shape3D[] shapes = { cylinder, sphere, rprism, cone, rpyramid, cube, spyramid };
        Arrays.sort(shapes);
        assertEquals(spyramid, shapes[0]);
    }

    public void testSortedShapeList2of2() {
        // volume = 113.097336
        Cylinder cylinder = new Cylinder(3.0, 4.0);

        // volume = 65.44985
        Sphere sphere = new Sphere(2.5);

        // volume = 60.0
        RectangularPrism rprism = new RectangularPrism(3.0, 4.0, 5.0);

        // volume = 37.69911
        Cone cone = new Cone(3.0, 4.0);

        // volume = 24.0
        RectangularPyramid rpyramid = new RectangularPyramid(3.0, 4.0, 6.0);

        // volume = 15.625
        Cube cube = new Cube(2.5);

        // volume = 12.5
        SquarePyramid spyramid = new SquarePyramid(2.5, 6.0);

        Shape3D[] shapes = { cylinder, sphere, rprism, cone, rpyramid, cube, spyramid };
        Arrays.sort(shapes);
        assertEquals(cylinder, shapes[6]);
    }

}
