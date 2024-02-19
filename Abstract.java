import java.util.Scanner;
abstract class Shape{
int m , n ;
abstract void printArea();
}

class Rectangle extends Shape{
void printArea(){
System.out.println("The area of rectangle is :"+(m*n));
}
}

class Circle extends Shape{
void printArea(){
System.out.println("The area of circle is :"+((22.0/7)*m*m));
}
}


class Triangle extends Shape{
void printArea(){
System.out.println("The area of triangle is :"+((1/2.0)*m*n));
}
}

class Abstract{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
Rectangle r = new Rectangle();
Circle c = new Circle();
Triangle t=new Triangle();
while(true){
System.out.println("Enter your choice : \n 1.Rectangle \n 2.Circle \n 3.Triangle \n 4.Exit ");
int choice = s.nextInt();
switch(choice)
{
case 1 : System.out.println("Enter The breadth and height of the rectangle :");
	 r.m=s.nextInt();
	 r.n=s.nextInt();
	 r.printArea();
	 break;

case 2 : System.out.println("Enter the radius of the circle :");
	 c.m=s.nextInt();
	 c.printArea();
	 break;

case 3 : System.out.println("Enter The height and base of the triangle :");
	 t.m=s.nextInt();
	 t.n=s.nextInt();
	 t.printArea();
	 break;

case 4 :System.exit(0);

default :System.out.println("Invalid choice . Enter again");
	 break;
}
}
}
}