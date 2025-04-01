
package thuchanhb1;
import java.util.Scanner;
public class bai2 {
     public static void main(String[] args) {
     double a,b;
               Scanner Tinh=new Scanner(System.in);
                System.out.print("nhap chieu cao a="); 
                a=Tinh.nextDouble();
                System.out.print("nhap chieu rong b=");
                b=Tinh.nextDouble();
                double s= a*b;
                System.out.print(" dien tich la :"+s);
     }
}