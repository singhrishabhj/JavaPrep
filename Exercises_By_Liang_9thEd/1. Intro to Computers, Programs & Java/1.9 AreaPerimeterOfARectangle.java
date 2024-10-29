/* 
1.9 (Area and Perimeter of a rectangle )
    Write a program that displays the area and perimeter of a rectangle with a width of 6.5 and height of 8.7 using the following formula:
    area = width x height 
    perimeter = 2 x ( width + height )
*/

public class AreaPerimeterOfARectangle{
 public static void main (String[] args ){
   double width = 6.5;
   double height = 8.7;
   System.out.println("The perimeter of a rectangle is [perimeter = 2 x ( width + height ) ]:" + (2 * ( width + height )));
   System.out.println("The area of a rectangle is [area = width x height ] :" + ( width * height ));
 }
}
