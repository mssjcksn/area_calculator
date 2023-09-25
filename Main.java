import java.util.*;
import java.text.DecimalFormat;
import java.lang.Math;

public class Main {
    public static final Scanner sc = new Scanner(System.in);
    public static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String args[]) {
        menu();
    }

    public static void menu() {
        String[] shapes = { "Triangle", "Square", "Circle", "Pyramid", "Cube", "Cylinder", "Exit" };

        System.out.println("FIND THE AREA OF THE GEOMETRIC SHAPE");
        for (int i = 0; i < shapes.length; i++) {
            System.out.println((i + 1) + "] " + shapes[i]);
        }

        System.out.print("Enter choice: ");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                areaTriangle(); // Calls designated function
                tryAgain(); // Prompts if user wants to try again
                break;

            case 2:
                areaSquare();
                tryAgain();
                break;

            case 3:
                areaCircle();
                tryAgain();
                break;

            case 4:
                areaPyramid();
                tryAgain();
                break;

            case 5:
                areaCube();
                tryAgain();
                break;

            case 6:
                areaCylinder();
                tryAgain();
                break;

            case 7:
                System.out.print("Program terminating. Thank you for using.");
                break;

            default:
                System.out.println("Incorrect input. Try again.");
                menu();
        }
    }

    public static void tryAgain() {
        System.out.print("Try again? [y/n]: ");
        char ans = sc.next().charAt(0);

        switch (ans) {
            case 'y':
                System.out.println();
                menu();
                break;
            case 'n':
                System.out.print("Program terminating. Thank you for using.");
                break;
            default:
                tryAgain();
        }
    }

    public static void areaTriangle() {
        System.out.print("Enter the base of the triangle: ");
        float base = sc.nextFloat();
        System.out.print("Enter the height of the triangle: ");
        float height = sc.nextFloat();

        float area = (base * height) / 2;

        System.out.println("The area of the circle is " + df.format(area));
        return;
    }

    public static void areaSquare() {
        System.out.print("Enter the length of a side of the square: ");
        float side = sc.nextFloat();

        double area = Math.pow(side, 2);

        System.out.println("The area of the square is " + df.format(area));
        return;
    }

    public static void areaCircle() {
        System.out.print("Enter the radius of the circle: ");
        float radius = sc.nextFloat();

        double area = (Math.PI * Math.pow(radius, 2));

        System.out.println("The area of the circle is " + df.format(area));
        return;

    }

    public static void areaPyramid() {
        System.out.print("Enter the length of the base of the pyramid: ");
        float base = sc.nextFloat();

        System.out.print("Enter the height of the pyramid: ");
        float height = sc.nextFloat();

        double slant_height = Math.sqrt((Math.pow(base, 2) / 4) + Math.pow(height, 2));

        double area = Math.pow(base, 2) + (base * slant_height) * 2;

        System.out.println("The surface area of the pyramid is " + df.format(area));
        return;
    }

    public static void areaCube() {
        System.out.print("Enter the length of a side of the cube: ");
        float side = sc.nextFloat();

        double surface_area = 6 * Math.pow(side, 2);

        System.out.println("The surface area of the cube is " + df.format(surface_area));
        return;
    }

    public static void areaCylinder() {
        System.out.print("Enter the radius of the cylinder: ");
        float radius = sc.nextFloat();

        System.out.print("Enter the height of the cylinder: ");
        float height = sc.nextFloat();

        double surface_area = 2 * ((Math.PI * radius * height) + (Math.PI * Math.pow(radius, 2)));

        System.out.println("The surface area of the cube is " + df.format(surface_area));
        return;
    }
}
