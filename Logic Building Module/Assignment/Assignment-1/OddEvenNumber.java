import java.util.*;

public class OddEvenNumber{

public static void main(String[] args){

Scanner scan=new Scanner(System.in);
System.out.println("Enter the Number :");

int num=scan.nextInt();

if(num%2==0){

System.out.println(num+" is a Even number");

}else{

System.out.println(num+" is a Odd number");

}

}
}