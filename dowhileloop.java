
import java.util.*;

public class dowhileloop {

    public static void main(String[] args){

        Scanner scobj = new Scanner(System.in);

        char ch;

        do {

            System.out.println("enter a character");

            ch = scobj.next().charAt(0);

            System.out.println("ch =" + ch);

        }while((ch == 'A') || (ch == 'E') || (ch =='I')|| (ch =='o') || (ch == 'u'));

        System.out.println("sorry incorrect");??????

	}
}


