public class Square extends Shape {
    public void getArea() {
        System.out.print("Enter the length of a side of the square: ");
        float side = sc.nextFloat();

        double area = Math.pow(side, 2);

        System.out.println("The area of the square is " + df.format(area));
        return;
    }
}
