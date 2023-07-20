import java.sql.SQLOutput;
import java.util.Scanner;

public class Practise {



    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 !=0 ) || ( year % 400 ==0) ;
    }

    public static void main(String[] args) {

        System.out.println("Enter the Year anc check it is leap or not ");
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
       if(isLeapYear(year)){
           System.out.println("this is leap year");
       }
       else {
           System.out.println("this is not leap year");
       }
    }
}


