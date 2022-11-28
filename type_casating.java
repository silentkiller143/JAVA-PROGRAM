
import java.util.Scanner;

public class type_casating {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
    
/* 
float a= 34.45f;
int b= (int)a;
System.out.println(b);

*/


float a = sc.nextFloat();
int b = (int) a;                    /* this is type casting conversion or expilicit conversion */
 System.out.println(b); 


char ch = 'a';
int n = ch;                    /*character to integer conversion */
System.out.println(n);



    }
    
}
