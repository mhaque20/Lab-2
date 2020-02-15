import java.util.Scanner;
public class SphereVolume {
	public static void main(String[] args) {
		
		double diam;
		double radius;
		double volume;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Calculate volume of the sphere.");
		
		System.out.print("Enter the diameter of a sphere: ");
		diam = in.nextDouble();
		
		radius = diam / 2;
		
		volume = (4.0/3.0) * (Math.PI) * (Math.pow(radius,3));
		
		System.out.println("Volume of the Sphere is "+ volume);
		
		
		
	}
}
