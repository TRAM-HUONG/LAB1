package thuchanhb1;
import java.util.Scanner;
public class bai9 {
     public static void main(String[] args) {
     int n;
               Scanner Tinh=new Scanner(System.in);
                System.out.print("nhap so n: "); 
                n=Tinh.nextInt(); 
                int tong=0;
                int tich=1;
          
     
                while(n>0){
                   int tach = n%10;
                tong =tong +tach;
                tich=tich*tach;
                n=n/10;
     }
         
        System.out.println("tong cac chu so la: "+tong);
        System.out.println("tich cua cac chu so la: "+tich);
     }
}