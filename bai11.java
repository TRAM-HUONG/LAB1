package thuchanhb1;
import java.util.Scanner;
public class bai11 {
     public static void main(String[] args) {
     int n;
               Scanner daonguoc=new Scanner(System.in);
                System.out.print("nhap so n: "); 
                n=daonguoc.nextInt();
                int dao =0;
                while(n!=0){
                dao= dao*10 + n%10;
                n=n/10;
                }
        System.out.println("so dao nguoc la"+ dao);
     }
}