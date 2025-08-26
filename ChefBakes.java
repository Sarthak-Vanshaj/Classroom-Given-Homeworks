import java.util.*;

class ChefBakes {

    // Chef Bakes Codechef

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int cakesPerVehicle = y / x;
        int vehiclesNeeded = (n + cakesPerVehicle - 1) / cakesPerVehicle;

        System.out.println(vehiclesNeeded);

        sc.close();
    }

}