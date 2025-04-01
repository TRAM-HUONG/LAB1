package thuchanhb1;
import java.util.Scanner;
public class bai14 {
     public static void main(String[] args) {
               Scanner tachten=new Scanner(System.in);
                System.out.print("nhap ho va ten : "); 
                String hovaten=tachten.nextLine();
        String[]tach=hovaten.split("\\s+");
        String tendem=" ";
         for (int i=1;i< tach.length-1;i++){
           tendem +=tach[i]+" ";
        }
       System.out.println("ho: "+ tach[0]);
        System.out.println("tendem: "+ tendem);
        System.out.println("ten: " + tach[tach.length-1]);
     }
     }
     