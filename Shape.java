import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;

abstract class Shape {
    public static final Scanner sc = new Scanner(System.in);
    public static final DecimalFormat df = new DecimalFormat("0.00");

    public abstract void getArea();
}
