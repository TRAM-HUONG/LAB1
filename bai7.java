
package THUCHANHB1;
import java.util.Scanner;
public class bai7 {
     public static void main(String[] args) {
         double a,b,c,d,e;
               Scanner TINHD=new Scanner(System.in);
                System.out.print("Ly:"); 
                a=TINHD.nextDouble();
                System.out.print("Hoa: ");
                b=TINHD.nextDouble();
                 System.out.print("Sinh:");
                c=TINHD.nextDouble();
                 System.out.print("Toan:");
                d=TINHD.nextDouble();
                 System.out.print("Maytinh:");
                e=TINHD.nextDouble();   
        double tb=((a+b+c+d+e)/5);
                if (tb >= 9.0) {
                     System.out.print("hạng của bạn là A ");
              }
                else if (tb >= 8.0) {
            System.out.println("hạng của bạn là B ");
        } 
                else if (tb >= 7.0) {
         System.out.println("hạng của bạn là C ");
        } 
                else if (tb >= 6.0) {
         System.out.println("hạng của bạn là D ");
        } 
                else if (tb >= 4.0) {
         System.out.println("hạng của bạn là E ");
        } 
                else {
           System.out.println("hạng của bạn là F");
        }
     }
}
