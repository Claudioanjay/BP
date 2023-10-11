
package tugasperulangan;
import java.util.Scanner;

public class GanjilWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Bilangan Ganjil While");
        System.out.print("Masukkan Nilai N = ");
        int N = s.nextInt();
        int i = 0;

        System.out.println("Bilangan ganjil dari 0 hingga " + N + " :");
        while (i <= N) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}




