import java.util.Scanner;

public class fangfa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int temp;
        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        float mid;
        int d;
        if (n % 2 == 0) {
            mid = (a[n / 2] + a[n / 2 - 1]) / (float) 2;
            if (mid % 1 == 0) {
                d = (a[n / 2] + a[n / 2 - 1]) / 2;
                System.out.print(a[0] + " " + d + " " + a[n - 1]);
            } else {
                System.out.print(a[0] + " ");
                System.out.print(String.format("%.1f", mid));
                System.out.print(" " + a[n - 1]);
            }
        } else {
            d = a[n / 2];
            mid = a[n / 2];
            System.out.print(a[0] + " " + d + " " + a[n - 1]);
        }
    }
}