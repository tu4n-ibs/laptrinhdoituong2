import java.util.Scanner;

public class TestNumberPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number test prime: ");
        int number = sc.nextInt();
        if (number<2){
            System.out.println(number + "is not a prime: ");
        }else {
            int i = 2;
            while (i < number){
                if (number % i == 0){
                    System.out.println(number + " is not a prime");
                    break;
                }else if (number % i == 1){
                    System.out.println(number + " is a prime");
                }else {
                    System.out.println("enter again");
                }
            }
        }
        }
    }

