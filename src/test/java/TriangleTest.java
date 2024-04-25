import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    Triangle triangle = new Triangle();

    @Test
    @DisplayName("Scalene Triangle")
    public void testScalene() {
        assertEquals("Scalene Triangle", triangle.checkTriangle(3, 4, 5));
        assertEquals("Scalene Triangle", triangle.checkTriangle(200, 199, 198));
    }

    @Test
    @DisplayName("Equilateral Triangle")
    public void testEquilateral() {
        assertEquals("Equilateral Triangle", triangle.checkTriangle(1, 1, 1));
        assertEquals("Equilateral Triangle", triangle.checkTriangle(200, 200, 200));
    }

    @Test
    @DisplayName("Equilateral Triangle")
    public void testIsosceles() {
        assertEquals("Isosceles Triangle", triangle.checkTriangle(2, 2, 1));
        assertEquals("Isosceles Triangle", triangle.checkTriangle(200, 200, 199));
        assertEquals("Isosceles Triangle", triangle.checkTriangle(200, 199, 200));
        assertEquals("Isosceles Triangle", triangle.checkTriangle(199, 200, 200));
    }

    @Test
    @DisplayName("Not a Triangle")
    public void testNotATriangle() {
        assertEquals("Not a Triangle", triangle.checkTriangle(1, 2, 3));
        assertEquals("Not a Triangle", triangle.checkTriangle(2, 3, 5));
        assertEquals("Not a Triangle", triangle.checkTriangle(5, 3, 2));

        assertEquals("Not a Triangle", triangle.checkTriangle(1, 2, 4));
        assertEquals("Not a Triangle", triangle.checkTriangle(2, 5, 2));
        assertEquals("Not a Triangle", triangle.checkTriangle(10, 2, 2));

    }

    @Test
    @DisplayName("Lower Boundary")
    public void testLowerBoundaryValues() {
        assertEquals("Value of x is not in the range of permitted values.", triangle.checkTriangle(0, 100, 100));
        assertEquals("Value of y is not in the range of permitted values.", triangle.checkTriangle(100, 0, 100));
        assertEquals("Value of z is not in the range of permitted values.", triangle.checkTriangle(100, 100, 0));
    }

    @Test
    @DisplayName("Upper Boundary")
    public void testUpperBoundaryValues() {
        assertEquals("Value of x is not in the range of permitted values.", triangle.checkTriangle(201, 100, 100));
        assertEquals("Value of y is not in the range of permitted values.", triangle.checkTriangle(100, 201, 100));
        assertEquals("Value of z is not in the range of permitted values.", triangle.checkTriangle(100, 100, 201));
    }
}