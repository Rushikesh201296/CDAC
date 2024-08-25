import java.util.*;

public class GoodMorningMsg{

public static void main(String[] args){

Scanner scan=new Scanner(System.in);
System.out.println("Enter the time:");

int time=scan.nextInt();

if(time>=5 && time<=12){

System.out.println("Good Morning");
}
}
}