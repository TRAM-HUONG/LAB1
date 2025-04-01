package thuchanhb1;
import java.util.Scanner;
public class bai13 {
     public static void main(String[] args) {
               Scanner demtu=new Scanner(System.in);
                System.out.print("nhap mot cau : "); 
                String chuoi=demtu.nextLine();
        String[]tu=chuoi.trim().split("\\s+");
       System.out.println("SO TU CUA NO LA: " +tu.length);
     }
}
