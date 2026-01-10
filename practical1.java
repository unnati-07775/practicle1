import java.util.Scanner;

class Practicle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in meters: ");
        double distance = sc.nextDouble();

        double feet = distance * 3.28084;

        System.out.printf("%.2f meters = %.2f feet%n", distance, feet);

        sc.close();
    }
}
