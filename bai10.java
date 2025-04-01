package thuchanhb1;
import java.util.Scanner;
public class bai10 {
     public static void main(String[] args) {
     int n;
               Scanner dem=new Scanner(System.in);
                System.out.print("nhap so n: "); 
                n=dem.nextInt();
                int count =0;
                while(n!=0){
                    count++;
      n=n/10;
                }
        System.out.println("co "+count+" chu so");
     }
}