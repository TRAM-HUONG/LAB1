package thuchanhb1;
import java.util.Scanner;
public class bai5 {
     public static void main(String[] args) {
     double a,b,c;
               Scanner Tim=new Scanner(System.in);
                System.out.print("nhap so thu nhat: "); 
                a=Tim.nextDouble();
                System.out.print("nhap so thu 2: ");
                b=Tim.nextDouble();
                System.out.print("nhap so thu 3: ");
                c=Tim.nextDouble();
                
double Min = Math.min(a,Math.min(b,c));
System.out.print("Gia tri nho nhat giua 3 so la: "+Min);
     }
}