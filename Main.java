import java.util.*;

public class Main {
    public static final Scanner sc = new Scanner(System.in);
    public static String[] shapes = { "Triangle", "Square", "Circle", "Pyramid", "Cube", "Cylinder", "Exit" };

    public static void main(String args[]) {
        menu();
    }

    public static void menu() {
        System.out.println("FIND THE AREA OF THE GEOMETRIC SHAPE");
        for (int i = 0; i < shapes.length; i++) {
            System.out.println((i + 1) + "] " + shapes[i]);
        }

        System.out.print("Enter choice: ");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                Triangle t = new Triangle();
                t.getArea(); // Calls designated function
                tryAgain(); // Prompts if user wants to try again
                break;

            case 2:
                Square sq = new Square();
                sq.getArea();
                tryAgain();
                break;

            case 3:
                Circle c = new Circle();
                c.getArea();
                tryAgain();
                break;

            case 4:
                Pyramid p = new Pyramid();
                p.getArea();
                tryAgain();
                break;

            case 5:
                Cube cu = new Cube();
                cu.getArea();
                tryAgain();
                break;

            case 6:
                Cylinder cy = new Cylinder();
                cy.getArea();
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
}
