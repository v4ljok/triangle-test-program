public class Triangle {
    public String checkTriangle(int x, int y, int z) {

        if (x < 1 || x > 200) return "Value of x is not in the range of permitted values.";
        if (y < 1 || y > 200) return "Value of y is not in the range of permitted values.";
        if (z < 1 || z > 200) return "Value of z is not in the range of permitted values.";

        if (x + y <= z || x + z <= y || y + z <= x) {
            return "Not a Triangle";
        } else if (x == y && y == z) {
            return "Equilateral Triangle";
        } else if (x == y || y == z || z == x) {
            return "Isosceles Triangle";
        } else {
            return "Scalene Triangle";
        }
    }
}
