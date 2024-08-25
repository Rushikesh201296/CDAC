 
import java.util.*;
class DaysOfTheWeek{

public static void main(String[] args){

Scanner scan=new Scanner(System.in);
System.out.println("Enter the Day");

int day=scan.nextInt();

switch(day){

case 1:

System.out.println("Monday");
if(day<=5){
System.out.println("Monday is a weekday");
}

break;

case 2:

System.out.println("Tuesday");
if(day<=5){
System.out.println("Tuesday is a weekday");
}

break;

case 3:

System.out.println("Wednesday");
if(day<=5){
System.out.println("Wednesday is a weekday");
}

break;

case 4:

System.out.println("Thursday");
if(day<=5){
System.out.println("Thursday is a weekday");
}

break;

case 5:

System.out.println("Friday");
if(day<=5){
System.out.println("Friday is a weekday");
}

break;

case 6:

System.out.println("Saturday");
if(day>=6 && day<=7){
System.out.println("Saturday is a weekend");
}

break;

case 7:

System.out.println("Sunday");
if(day>=6 && day<=7){
System.out.println("Sunday is a weekend");
}

break;

}

}
}