package TazwarBelal;
import java.util.Scanner;
public class Part2 {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("Enter a number");
        Scanner input= new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        int y=0;
        while (!(y == num)) {
            double x = Math.random();
            y = (int) (x * 101);
            i++;
            if (num > y) {
                System.out.println("your number is too high");
            }
            else if (num < y) {
                System.out.println("your number is too low");
            }

        }
        System.out.println("The computer guessed"+" "+num+" "+ "with"+" "+i+" "+"guesses");

    }
    }


