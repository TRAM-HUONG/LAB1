
package thuchanhb1;
import java.util.Scanner;
public class bai3 {
     public static void main(String[] args) {
     double f,c;
               Scanner Chuyen=new Scanner(System.in);
                System.out.print("nhap nhiet do F: "); 
                f=Chuyen.nextDouble();
                c= (f-32)/1.8;
                System.out.print(" nhiet do C la:"+c);
     }
}