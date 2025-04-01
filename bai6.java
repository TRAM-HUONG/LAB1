package thuchanhb1;
import java.util.Scanner;
public class bai6 {
     public static void main(String[] args) {
     double a,b,c;
               Scanner kiemtra =new Scanner(System.in);
                System.out.print("nhap so thu nhat: "); 
                a=kiemtra.nextDouble();
                System.out.print("nhap so thu 2: ");
                b=kiemtra.nextDouble();
                System.out.print("nhap so thu 3: ");
                c=kiemtra.nextDouble();
 if (a+b>c && a+c>b && b+c>a){
     System.out.print("No la mot hinh tam giac");
 }else {
System.out.print("No khong phai la mot tam giac");
     }
     }
}
