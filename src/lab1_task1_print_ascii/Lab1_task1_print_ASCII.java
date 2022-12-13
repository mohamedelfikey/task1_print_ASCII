/*
 * print the character of ASCII
 * mohamed ahmed elsayed elfikey 
 * id 1900306
 */
package lab1_task1_print_ascii;
import java.util.Scanner;


public class Lab1_task1_print_ASCII {

    
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        System.out.println("please enter the ASCII :");
        int ASCII=input.nextInt();
        // casting from int to char
        char character=(char)ASCII;
        System.out.println("Character= "+(character)+" is the ASCII of "+(ASCII));
        
        
        
        
    }
    
}
