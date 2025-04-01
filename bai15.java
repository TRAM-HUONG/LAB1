package thuchanhb1;
import java.util.Scanner;
public class bai15 {
     public static void main(String[] args) {
               Scanner ngaytach=new Scanner(System.in);
                System.out.print("nhap vao ngay: "); 
                String ngay=ngaytach.nextLine();
        String[]tach=ngay.split("/");
       System.out.println("ngay "+ tach[0]);
       System.out.println("thang "+ tach[1]);
        System.out.println("nam "+ tach[2]);
     }
}

