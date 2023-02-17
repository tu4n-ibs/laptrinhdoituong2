import java.util.Scanner;

public class TimUocChung {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a: ");
        a = sc.nextInt();
        System.out.println("enter b: ");
        b = sc.nextInt();

        if (a == 0 || b == 0 ){
            System.out.println("no greatest common factor");
        }
        while (a != b){
            if (a>b){
                a = a-b;

            }else {
                b = b-a;

            }
            System.out.println("greatest common factor: " + a);
            break;
        }
    }
}
