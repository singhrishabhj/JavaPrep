/*
1.8 ( Area and Parameter of a Circle )
    Write a program that displays the area and perimeter of a circle that has a radius of 3.7 using the formula:
      perimeter = 2 x radius x Π (pie)
      area = radius x radius x Π
*/

public class AreaPerimeterOfACircle{
 public static void main (String []args){
   double radius = 3.7;
   System.out.println("The perimeter is (perimeter = 2 x radius x Π ) : " + (2 * radius * Math.PI )); //Math.PI provides the value of π (Pi) in Java.
   System.out.println(" The area of a circle is (area = radius x radius x Π) : " + (radius * radius * Math.PI));
 }
}
