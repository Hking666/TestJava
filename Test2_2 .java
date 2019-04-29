import java.util.Scanner;
public class Test2_2 {
	public static void main(String[] args) {
		
		final  double PI = 3.14159;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the radius and length of a cylinder : ");
		
		double radius = input.nextDouble(); 
		
		double length = input.nextDouble();
		
		double area =(double)Math.round( Math.pow(radius , 2 ) *  PI * 10000 )  / 10000 ;
		
		double volume = (double) Math.round( area * length * 10 ) / 10;
		
		System.out.println("The area is " + area);
		
		System.out.println("The volume is " + volume);
		
	}
	
}

