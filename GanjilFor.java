
package tugasperulangan;
import java.util.Scanner;

public class GanjilFor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Bilangan Ganjil For");
        System.out.print("Masukkan Nilai Y = ");
        int Y = s.nextInt();
        
        for (int i = 0; i <= Y; i++){
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
    
}


