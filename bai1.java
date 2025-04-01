
package thuchanhb1;
import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
     Scanner Xuat = new Scanner(System.in);
     System.out.print("Nhap ho ten: ");
     String hoten = Xuat.nextLine();
     System.out.print("Nhap ngay sinh: ");
     String ngaysinh = Xuat.nextLine();
     System.out.print("Nhap MSSV: ");
     String MSSV = Xuat.nextLine();
      
     System.out.println("Ho ten: "+hoten);
     System.out.println("Ngay sinh: "+ ngaysinh);
     System.out.println("MSSV: "+ MSSV );
    } 
}
