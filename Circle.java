public class Circle extends Shape {
    public void getArea() {
        System.out.print("Enter the radius of the circle: ");
        float radius = sc.nextFloat();

        double area = (Math.PI * Math.pow(radius, 2));

        System.out.println("The area of the circle is " + df.format(area));
        return;
    }
}
