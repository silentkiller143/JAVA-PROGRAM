
import java.util.Scanner;
public class bill_of_gst {
    public static void main(String[] args) {
        System.out.println("enter the price of a pencil");
        Scanner sc= new Scanner(System.in);
        float pencil = sc.nextFloat();
        System.out.println("enter the value of of the pen");
        float pen = sc.nextFloat();
        System.out.println("enter the value of the eraser");
        float eraser=sc.nextFloat();

System.out.println("total cost of the item is ");



float total=pencil+pen+eraser;
System.out.println("toatal price of item is ="+total);

float gst=(total*18)/100;
float fi = gst+total;

System.out.println("after gst the final total price"+fi);



    }
}
