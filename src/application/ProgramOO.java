package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;
public class ProgramOO {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Triangle x, y;
		double a, b, c;
		System.out.println("Enter the measures of triangle X: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		x = new Triangle(a, b, c);
		System.out.println("Enter the measures of triangle Y: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		y = new Triangle(a, b, c);
		double areaX = x.area();
		double areaY = y.area();
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area: Y");
		}
		sc.close();
	}
}
