public class Cube extends Shape {
    public void getArea() {
        System.out.print("Enter the length of a side of the cube: ");
        float side = sc.nextFloat();

        double surface_area = 6 * Math.pow(side, 2);

        System.out.println("The surface area of the cube is " + df.format(surface_area));
        return;
    }
}
