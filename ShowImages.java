import java.util.Scanner;

public class ShowImages {
    public static void main(String[] args) {
        int choice = 1;
        Scanner sc = new Scanner(System.in);

        while (choice!=0){
            System.out.println("MENU: ");
            System.out.println("  1.Print the rectangle");
            System.out.println("  2.Print the square triangle");
            System.out.println("  3.Print triangle");
            System.out.println("  4.Print isosceles triangle");
            System.out.println("  0.Exit");
            System.out.println("enter you want: ");
            choice = sc.nextInt();


            switch (choice) {
                case 1:
                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= 5; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    } break;
                case 2:
                    for (int i=1; i<=5;i++ ){
                        for(int j=1; j<=i;j++ ){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }break;
                case 3:
                    for(int i=5;i>=1;i--){
                        for(int j=1;j<=i;j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }break;
                case 4 :
                    int k =0;
                    for (int i= 1; i <=5; ++i, k=0){
                        for (int j = 1; j<=5-i;++j ){
                            System.out.print(" ");
                        }
                        while (k!=1*i-1){
                            ++k;
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                case 0:
                    System.exit(0);
                default:
                    System.out.println("no choice");
            }
        }
    }
}
