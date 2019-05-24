
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Random; 

public class Main {

    public static void main(String[] args ){
        Scanner scnr = new Scanner(System.in);
        Random rando = new Random();
        int answer = rando.nextInt(100) + 1;
        int lastGuess;
        int count = 1;
        
        System.out.println("Guess a number between 1 and 100 (inclusive)");
        int guess = scnr.nextInt();
        
        while (guess != answer) {
           
            if (guess < answer) {
                System.out.println("Too small");
            } else {
                System.out.println("Too large");
            }
            
            System.out.println("Current number of guesses: " + count);
            
            lastGuess = guess;
            guess = scnr.nextInt();
            
            if (lastGuess != guess){
                count++;
            } 
        }
        System.out.println("That's correct! It only took you " + count + " guesses. Thanks for playing!");
    }
}

