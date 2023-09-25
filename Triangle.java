public class Triangle extends Shape {
    public void getArea() {
        System.out.print("Enter the base of the triangle: ");
        float base = sc.nextFloat();
        System.out.print("Enter the height of the triangle: ");
        float height = sc.nextFloat();

        float area = (base * height) / 2;
        System.out.println("The area of the circle is " + df.format(area));
        return;
    }

}