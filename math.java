
package bank.mathproject;
import java.util.*;

public class Mathproject {

    public static void main(String[] args) {
       Scanner save = new Scanner(System.in);
        Random r = new Random(100);
        int number1 =r.nextInt();
        
        int number2 =r.nextInt();
     
        System.out.println("What is "+ number1+ "+"+number2);
        int answer = save.nextInt();
        int sum = number1+number2;
        
        if(sum == answer){
            System.out.println("Answer is true");
        }
        else
            System.out.println("Answer is false");
        
    }
}
