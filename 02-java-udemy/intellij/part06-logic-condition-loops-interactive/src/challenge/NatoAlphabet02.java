package challenge;

import java.util.Scanner;

public class NatoAlphabet02
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a letter (A-E): ");
        char letter = sc.next().toUpperCase().charAt(0);

        switch (letter)
        {
            case 'A':
                System.out.println("A is able");
                break;
            case 'B':
                System.out.println("B is barker");
                break;
            case 'C':
                System.out.println("C is charlie");
                break;
            case 'D':
                System.out.println("D is dog");
                break;
            case 'E':
                System.out.println("E is easy");
                break;
            default:
                System.out.println("Letter " + letter + " was not found in the switch");
        }

        sc.close();
    }
}