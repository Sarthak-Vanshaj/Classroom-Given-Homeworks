import java.util.*;

class GoodSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int length = 0;
            int lastParity = -1;

            for (int i = 0; i < n; i++) {
                int currentParity = sc.nextInt() % 2;
                if (length == 0 || currentParity != lastParity) {
                    length++;
                    lastParity = currentParity;
                }
            }
            System.out.println(length);
        }
        sc.close();
    }
}