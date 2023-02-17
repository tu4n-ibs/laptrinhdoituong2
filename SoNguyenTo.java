public class SoNguyenTo {
    public static void main(String[] args) {
        int n;
        int count = 0;
        int N = 2;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter a number prime: ");
//        n = scanner.nextInt();
//        if (n >= 1) {
//            System.out.println(n + " 20 number first prime:");
//        }
        for ( int i = 2 ; i <= 20 ;  ) {
            for ( int j = 2 ; j <= Math.sqrt(N) ; j++ ) {
                if ( N % j == 0 ) {
                    count = 0;
                    break;
                }
            }
            if ( count != 0 ) {
                System.out.println(N);
                i++;
            }
            count = 1;
            N++;
        }
        }
    }


