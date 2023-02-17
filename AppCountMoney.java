import java.util.Scanner;

public class AppCountMoney {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double laixuat = 1.0;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter money you want; ");
        money = sc.nextDouble();

        System.out.println("enter number month; ");
        month = sc.nextInt();

        System.out.println("enter lai xuat cua ban: ");
        laixuat = sc.nextDouble();

        double moneylai = 0;
        moneylai += money * (laixuat/100)/12 * month;

        System.out.println( "tien lai cua ban la: " + moneylai );
    }
}
