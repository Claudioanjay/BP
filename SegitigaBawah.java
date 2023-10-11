

package tugasperulangan;
import java.util.Scanner;

public class SegitigaBawah {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Segitiga Bawah Urut");
        System.out.print("Masukkan Nilai A = ");
        int A = s.nextInt();
        for (int i = 1; i <= A; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j+" ");
                
            }
            System.out.println("");
        }
    }   
}

