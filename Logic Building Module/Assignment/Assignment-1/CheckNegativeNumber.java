import java.util.*;

public class CheckNegativeNumber{

public static void main(String[] args){

Scanner scan=new Scanner(System.in);
System.out.println("Enter the number :");

int num=scan.nextInt();

if(num<0){

System.out.println(num+" is a negative number");
}
}
}