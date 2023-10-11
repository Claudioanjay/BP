
package tugasperulangan;
import java.util.Scanner;

public class GanjilDoWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Bilangan GanjilDo While");
        System.out.print("Masukkan nilai X = ");
        int X = s.nextInt();
        int i = 0;
        
        System.out.println("Bilangan ganjil dari 0 hingga " + X + " :");
        do{
            if (i % 2 != 0){
                System.out.println(i);
            }
            i++;
        }while (i <= X);        
    }
    
}


