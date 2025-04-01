package thuchanhb1;
import java.util.Scanner;
public class bai8 {
     public static void main(String[] args) {
     int n;
               Scanner Tim=new Scanner(System.in);
                System.out.print("nhap so n: "); 
                n=Tim.nextInt();
                int chusodau= n;
                while(chusodau>=10){
         chusodau=n/10;
     }
               int chusocuoi=n%10; 
        System.out.println("Chu so dau la: "+chusodau);
        System.out.println("Chu so cuoi la: "+chusocuoi);
     }
}