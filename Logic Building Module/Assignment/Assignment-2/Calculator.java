import java.util.*;

class Calculator{

public static void main(String[] args) throws Exception{

Scanner scan=new Scanner(System.in);

System.out.println("Enter the First Number :");
int num1=scan.nextInt();

System.out.println("Enter the Second Number :");
int num2=scan.nextInt();

System.out.println("Enter the choice you want to calculate :");
int choice=scan.nextInt();

switch(choice){

case 1:

int addition=num1+num2;
System.out.println("Addition of Number :"+(num1+num2));
break;

case 2:

int subtraction=num1-num2;
System.out.println("Subtraction of Number :"+(num1-num2));
break;

case 3:

int multiplication=num1*num2;
System.out.println("Multiplication of Number :"+(num1*num2));
break;

case 4:

int division=num1/num2;
System.out.println("Division of Number :"+(num1/num2));
break;

case 5:

if(num1/num2==0){

System.out.println("Division by 0 is attempted...");

}else{

System.out.println("Error");
}

}
} 
}