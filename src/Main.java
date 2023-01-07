import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a , b , c , kenarToplami;
        Double u , alan ;

        Scanner input = new Scanner(System.in);
        System.out.print("a kenarını giriniz: ") ;
        a = input.nextInt();
        System.out.print("b kenarını giriniz: ");
        b = input.nextInt();
        System.out.print("c kenarını giriniz: ");
        c = input.nextInt();
        kenarToplami = (a + b + c);
        u = (double) (kenarToplami/2);
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Üçgenin Alanı= "+ alan);

    }
}