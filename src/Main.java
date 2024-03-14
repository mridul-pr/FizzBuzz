import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        Integer Number = scanner.nextInt();

        if(Number%5==0 && Number%3==0){
            System.out.println("FizzBuzz");
        } else if (Number%5==0) {
            System.out.println("Fizz");
        } else if (Number%3==0) {
            System.out.println("Buzz");
        }
        else
            System.out.println(Number);
    }
}