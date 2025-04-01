package thuchanhb1;
import java.util.Scanner;
public class bai12 {
     public static void main(String[] args) {
     int n;
               Scanner daonguoc=new Scanner(System.in);
                System.out.print("nhap so n: "); 
                n=daonguoc.nextInt();
                int sodao =0;
                int doixung=n;
          
            while(n!=0){
                sodao= sodao*10 + n%10;
                n=n/10;
                }
            if(doixung==sodao){
       System.out.println("n la so doixung");
     } else 
            {
       System.out.println("n khong phai la so doi xung"); 
            }
}
}