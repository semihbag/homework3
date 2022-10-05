
import java.util.Scanner;

public class HW3_150120070 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean condition = true;
		while(condition) {
			
			System.out.println("Which shape would you like to draw?\n1. Line\n2. Triangle\n3. Rectangle\n4. Parabola\n5. Circle\n6.Exit");
			int selection = input.nextInt(); // What does the user want to print?
			
			// Variables
			int x = 0;
			int y = 0;
			int situation = 0;
			double a, b, c, d, e, f, r, edgeEquation1, edgeEquation2, edgeEquation3, edgeEquation4 ;
			double g = 1;
			double h = 1;
			double x1 = 1;
			double x2 = 1;
			double x3 = 1;
			double x4 = 1;
			double y1 = 1;
			double y2 = 1;
			double y3 = 1;
			double y4 = 1;
			
			switch (selection) {
			
				// if user selected to draw line
				case 1: 
					System.out.println("Line formula is y = ax + b\nPlease enter the coefficients a and b:"); // Line formula
					
					a = input.nextDouble();
					b = input.nextDouble();
					
					// Loop structure for line
					for (y = 11 ; y >= -10 ; y--) { 
						for (x = -10 ; x <=  11 ; x++) {
							if ((y == a * x +b) || ((y == 0) && (y == a * x +b)) || ((x == 0) && (y == a * x +b))) { // Condition which print star
								if (x == 11)
									System.out.println("*");
								else
									System.out.print("*");
							}
							else if ((y == 0) && (y != a * x +b)) {
								if (x == 11 )
									System.out.println("x");
								else if (x == 0)
									System.out.print("|");
								else
									System.out.print("-");
							}
							else if ((x == 0) && (y != a * x +b)) {
								if (y == 11)
									System.out.print("y");
								else
									System.out.print("|");
							}
							else if (x < 11) {
								System.out.print(" ");
							}
							else {
								System.out.println(" ");
							}
						}
					}
					break;
					
				// if user selected to draw triangle
				case 2:
					System.out.print("For triangle, we need the coordinates of the points for three vertices."
							+ "\nPlease enter the coordinates of 3 vertices a, b, c, d, e, f:");
					
					a = input.nextDouble();
					b = input.nextDouble();
				 	c = input.nextDouble();
					d = input.nextDouble();
					e = input.nextDouble();
					f = input.nextDouble();
					
					// Loop structure for triangle
					for (y = 11 ; y >= -10 ; y--) {
						for (x = -10 ; x <=  11 ; x++) {
							
							// Equation formulas for each edge
							edgeEquation1 = (a-c == 0)? y : (((b - d) / (a - c)) * (x - a) + b ) ;
							edgeEquation2 = (c-e == 0)? y : (((d - f) / (c - e)) * (x - c) + d ) ;
							edgeEquation3 = (e-a == 0)? y : (((f - b) / (e - a)) * (x - e) + f ) ;
							
							// Condition which print star
							if (((x == a) && (y == b)) || ((x == c) && (y == d)) || ((x == e) && (y == f)) || 
								((y == edgeEquation1) && ((b==d)? ((y >= Math.min(b, d)) && (y <= Math.max(b, d))) : ((y > Math.min(b, d)) && (y < Math.max(b, d)))) && ((a==c)? ((x >= Math.min(a, c)) && (x <= Math.max(a, c))) : ((x > Math.min(a, c)) && (x < Math.max(a, c))))) || 
								((y == edgeEquation2) && ((d==f)? ((y >= Math.min(d, f)) && (y <= Math.max(d, f))) : ((y > Math.min(d, f)) && (y < Math.max(d, f)))) && ((c==e)? ((x >= Math.min(c, e)) && (x <= Math.max(c, e))) : ((x > Math.min(c, e)) && (x < Math.max(c, e))))) || 
								((y == edgeEquation3) && ((f==b)? ((y >= Math.min(f, b)) && (y <= Math.max(f, b))) : ((y > Math.min(f, b)) && (y < Math.max(f, b)))) && ((e==a)? ((x >= Math.min(e, a)) && (x <= Math.max(e, a))) : ((x > Math.min(e, a)) && (x < Math.max(e, a)))))) {
								if(x == 11)
									System.out.println("*");
								else
									System.out.print("*");
							}
							else if (((y == 0) && (y != edgeEquation1)) || ((y == 0) && (y != edgeEquation2)) || ((y == 0) && (y != edgeEquation3))) {
								if (x == 11)
									System.out.println("x");
								else if (x == 0)
									System.out.print("|");
								else
									System.out.print("-");
							}
							else if (((x == 0) && (y != edgeEquation1)) || ((x == 0) && (y != edgeEquation2)) || ((x == 0) && (y != edgeEquation3))) {
								if (y == 11)
									System.out.print("y");
								else 
									System.out.print("|");
							}
							else if (x < 11) {
								System.out.print(" ");
							}
							else {
								System.out.println(" ");
							}	
						}
					}
					break;
					
				// if user selected to draw rectangle	
				case 3:
				System.out.println("For rectangle, we need the coordinates of the points for three vertices."
						+ "\nPlease enter the coordinates of 3 vertices a, b, c, d, e, f:");
				 
				a = input.nextDouble();
				b = input.nextDouble();
				c = input.nextDouble();
				d = input.nextDouble();
				e = input.nextDouble();
				f = input.nextDouble();
				
				// Specify one of the three states that print a rectangle
				// For each state the variables of the equation will change
				// This step is necessary to enter coordinates randomly
				if (Math.pow(a - c, 2) + Math.pow(b - d, 2) + Math.pow(a - e, 2) + Math.pow(b - f, 2) == Math.pow(c - e, 2) + Math.pow(d - f, 2))
					situation = 1;
				else if (Math.pow(c - a, 2) + Math.pow(d - b, 2) + Math.pow(c - e, 2) + Math.pow(d - f, 2) == Math.pow(a - e, 2) + Math.pow(b - f, 2))
					situation = 2;
				else if (Math.pow(e - a, 2) + Math.pow(f - b, 2) + Math.pow(e - c, 2) + Math.pow(f - d, 2) == Math.pow(a - c, 2) + Math.pow(b - d, 2))
					situation = 3;
				else
					situation = 0;
				
				if (!(((a == c) && (b == d)) || ((a == e) && (b == f)) || ((c == e) && (d == f))) &&
				   (situation == 1 || situation == 2 || situation == 3)) {
					
					// Loop structure for rectangle
					for (y = 11 ; y >= -10 ; y--) {
						for (x = -10 ; x <=  11 ; x++) {
							// Determine the state and assign equation variables for each possible three state
							switch (situation) {
								case 1:
									g = e - (a - c);
									h = f - (b - d);
									x1 = a; x2 = c;	x3 = e;	x4 = g;	y1 = b;	y2 = d;	y3 = f;	y4 = h;
									
									break;
								case 2:
									g = e - (c - a);
									h = f - (d - b);
									x1 = c;	x2 = a; x3 = e;	x4 = g;	y1 = d;	y2 = b;	y3 = f;	y4 = h;
								
									break;
								case 3:
									g = c - (e - a);
									h = d - (f - b);
									x1 = e;	x2 = a;	x3 = c;	x4 = g;	y1 = f;	y2 = b;	y3 = d;	y4 = h;
									
									break;
							}
							
							// Equation formulas for each edge
							edgeEquation1 = (x1 - x2 == 0)? y : (((y1 - y2) / (x1 - x2)) * (x - x1) + y1 ) ;
							edgeEquation2 = (x1 - x3 == 0)? y : (((y1 - y3) / (x1 - x3)) * (x - x1) + y1 ) ;
							edgeEquation3 = (x4 - x2 == 0)? y : (((y4 - y2) / (x4 - x2)) * (x - x4) + y4 ) ;
							edgeEquation4 = (x4 - x3 == 0)? y : (((y4 - y3) / (x4 - x3)) * (x - x4) + y4 ) ;
							
							// Condition which print star
							if (((x == a) && (y == b)) || ((x == c) && (y == d)) || ((x == g) && (y == h)) || ((x == e) && (y == f)) || 
									((y == edgeEquation1) && ((y1==y2)? ((y >= Math.min(y1, y2)) && (y <= Math.max(y1, y2))) : ((y > Math.min(y1, y2)) && (y < Math.max(y1, y2)))) && ((x1==x2)? ((x >= Math.min(x1, x2)) && (x <= Math.max(x1, x2))) : ((x > Math.min(x1, x2)) && (x < Math.max(x1, x2))))) || 
									((y == edgeEquation2) && ((y1==y3)? ((y >= Math.min(y1, y3)) && (y <= Math.max(y1, y3))) : ((y > Math.min(y1, y3)) && (y < Math.max(y1, y3)))) && ((x1==x3)? ((x >= Math.min(x1, x3)) && (x <= Math.max(x1, x3))) : ((x > Math.min(x1, x3)) && (x < Math.max(x1, x3))))) || 
									((y == edgeEquation3) && ((y4==y2)? ((y >= Math.min(y4, y2)) && (y <= Math.max(y4, y2))) : ((y > Math.min(y4, y2)) && (y < Math.max(y4, y2)))) && ((x4==x2)? ((x >= Math.min(x4, x2)) && (x <= Math.max(x4, x2))) : ((x > Math.min(x4, x2)) && (x < Math.max(x4, x2))))) || 
									((y == edgeEquation4) && ((y4==y3)? ((y >= Math.min(y4, y3)) && (y <= Math.max(y4, y3))) : ((y > Math.min(y4, y3)) && (y < Math.max(y4, y3)))) && ((x4==x3)? ((x >= Math.min(x4, x3)) && (x <= Math.max(x4, x3))) : ((x > Math.min(x4, x3)) && (x < Math.max(x4, x3)))))) {
									if(x == 11)
										System.out.println("*");
									else
										System.out.print("*");				
								}
								else if (((y == 0) && (y != edgeEquation1)) || ((y == 0) && (y != edgeEquation2)) || ((y == 0) && (y != edgeEquation3)) || ((y == 0) && (y != edgeEquation4))) {
									if (x == 11)
										System.out.println("x");
									else if (x == 0)
										System.out.print("|");
									else
										System.out.print("-");
								}
								else if (((x == 0) && (y != edgeEquation1)) || ((x == 0) && (y != edgeEquation2)) || ((x == 0) && (y != edgeEquation3)) || ((x == 0) && (y != edgeEquation4))) {
									if (y == 11)
										System.out.print("y");
									else 
										System.out.print("|");
								}
								else if (x < 11) {
									System.out.print(" ");
								}
								else {
									System.out.println(" ");
								}				
							}	
						}
					}
					else {
						
						// Indicate that cannot draw a rectangle
						System.out.println("You can not create a rectangle with this points!");
					}
					break;
					
				// if user selected to draw parabola	
				case 4:
					System.out.print("Parabola formula is y = ax^2 + bx + c\nPlease enter the coefficients a, b and c:");
					a = input.nextDouble();
					b = input.nextDouble();
					c = input.nextDouble();
					
					// Loop structure for parabola
					for (y = 11 ; y >= -10 ; y--) {
						for (x = -10 ; x <=  11 ; x++) {

							// Condition which print star
							if ((y == a * Math.pow(x, 2) + b * x + c) || ((y == 0 ) && (y == a * Math.pow(x, 2) + b * x + c)) && ((x == 0) || (y == a * Math.pow(x, 2) + b * x + c))) {
								if (x==11) {
									System.out.println("*");
								}
								else {
									System.out.print("*");
									}		
							}
							else if ((y == 0) && (y != a * Math.pow(x, 2) + b * x + c)) {
								if (x == 11) 
									System.out.println("x");
								else if (x == 0)
									System.out.print("|");
								else
									System.out.print("-");
							}
							else if ((x == 0) && (y != a * Math.pow(x, 2) + b * x + c)) {
								if (y == 11)
									System.out.print("y");
								else
									System.out.print("|");
							}
							else if (x == 11)
								System.out.println();
							else
								System.out.print(" ");
						}
					}
					break;
					
				// if user selected to draw circle	
				case 5:
					System.out.println("Circle formula is (x-a)^2 + (y-b)^2 = r^2\nPlease enter the coordinates "
					+ " of the center (a,b) and the radius:");
					a = input.nextDouble();
					b = input.nextDouble();
					r = input.nextDouble();
					
					// Loop structure for circle
					for (y = 11 ; y >= -10 ; y--) {
						for (x = -10 ; x <=  11 ; x++) {
							double circleFormula = Math.pow(x - a, 2) + Math.pow(y - b, 2);
							
							// Condition which print star
							if ((Math.pow(r, 2) == circleFormula) || ((y == 0) && (Math.pow(r, 2) == circleFormula)) || ((x == 0) && (Math.pow(r, 2) == circleFormula))) {
								if (x == 11) {
									System.out.println("*");
								}
								else {
									System.out.print("*");
								}	
							}
							else if ((y == 0) && (Math.pow(r, 2) != circleFormula)) {
								if (x == 11)
									System.out.println("x");
								else if (x == 0)
									System.out.print("|");
								else
									System.out.print("-");
							}
							else if ((x == 0) && (Math.pow(r, 2) != circleFormula)) {
								if (y == 11)
									System.out.print("y");
								else 
									System.out.print("|");
							}
							else if (x == 11) {
								System.out.println();
							}
							else {
								System.out.print(" ");
							}				
						}
					}
					break;
					
				// if user selected to exit
				case 6:
					condition = false;
					break;
			}
		}
	}
}