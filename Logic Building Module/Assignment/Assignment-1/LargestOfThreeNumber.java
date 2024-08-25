import java.util.*;

public class LargestOfThreeNumber{

public static void main(String[] args){

Scanner scan=new Scanner(System.in);
System.out.println("Enter the First Number:");
int num1=scan.nextInt();

System.out.println("Enter the Second Number:");
int num2=scan.nextInt();


System.out.println("Enter the Third Number:");
int num3=scan.nextInt();

if(num1>num2 && num1>num3){

System.out.println(num1+" is a largest number");

}else if(num2>num3 && num2>num1){

System.out.println(num2+" is a largest number");

}else{

System.out.println(num3+" is a largest number");

}

}
}