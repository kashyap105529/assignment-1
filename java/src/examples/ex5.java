package examples;
//an example to calculate the area of a circle.
import java.lang.System;
import java.lang.String;
import static java.lang.Math.*;

public class ex5 {
public static void main(String args[]) {
	float radius,area;
	radius= Float.parseFloat(args[0]);
	area = (float)PI * radius * radius;
	System.out.println("The Area of a Circle is " + area);
	}
}