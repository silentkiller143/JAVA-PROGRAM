import java.util.Scanner;

public class area_of_circle {
public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
    System.out.println("Enter the radios of the circle");
    float r= sc.nextFloat();
    float a= 3.14f*r*r;

    System.out.println("The radious of the circle is ");
    System.out.println(a);
}
    
}
