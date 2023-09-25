public class Cylinder extends Shape {
    public void getArea() {
        System.out.print("Enter the radius of the cylinder: ");
        float radius = sc.nextFloat();

        System.out.print("Enter the height of the cylinder: ");
        float height = sc.nextFloat();

        double surface_area = 2 * ((Math.PI * radius * height) + (Math.PI * Math.pow(radius, 2)));

        System.out.println("The surface area of the cube is " + df.format(surface_area));
        return;
    }
}
