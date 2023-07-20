import java.util.Scanner;

public class Mulitple {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int muti = in.nextInt();
        for(int i  = 1 ; i <= 10 ;i++){
             int table = muti * i ;
            System.out.println(table);
        }

    }

}
