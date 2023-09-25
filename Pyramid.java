public class Pyramid extends Shape {
    public void getArea() {
        System.out.print("Enter the length of the base of the pyramid: ");
        float base = sc.nextFloat();

        System.out.print("Enter the height of the pyramid: ");
        float height = sc.nextFloat();

        double slant_height = Math.sqrt((Math.pow(base, 2) / 4) + Math.pow(height, 2));

        double area = Math.pow(base, 2) + (base * slant_height) * 2;

        System.out.println("The surface area of the pyramid is " + df.format(area));
        return;
    }
}
