package shape;

public class GeometryMain {

    public static void main(String[] args) {
        String equilateral = Geometry.getTriangleType(3,3,3);
        String isosceles = Geometry.getTriangleType(5,5,3);

        System.out.println(equilateral);
        System.out.println(isosceles);
    }

}
