import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, r, i, j, k, fak = 1, grup = 1, com, fark = 1;

        Scanner inp = new Scanner(System.in);
        System.out.print("C(n,r) bicimindeki n degerini giriniz: ");
        n = inp.nextInt();
        System.out.print("C(n,r) bicimindeki r degerini giriniz: ");
        r = inp.nextInt();

        for (i = 1; i <= n; i++) {
            fak = fak * i;
        }
        for (j = 1; j <= r; j++) {
            grup = grup * j;
        }
        for (k = 1; k <= (n - r); k++) {
            fark = fark * k;
        }

        com = fak / (grup * fark);
        System.out.println("C(" + n + "," + r + ") = " + com);


    }
}