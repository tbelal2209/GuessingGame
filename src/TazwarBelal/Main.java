package TazwarBelal;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Enter a number");
            Scanner input= new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
            int sum = 0;
            int i = 0;
            while(num >= i){
                sum = sum + i;
                i++;
            }
           System.out.println(sum);


        }
    }

