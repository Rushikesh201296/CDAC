import java.util.*;

public class AreaOfRectangle{

public static void main(String[] args){

Scanner scan=new Scanner(System.in);
System.out.println("Enter the Length :");
int length=scan.nextInt();

System.out.println("Enter the Breadth :");
int breadth=scan.nextInt();

int area=length*breadth;

System.out.println("Area of Rectangle :"+area);

}
}