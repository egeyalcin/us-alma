import java.util.Scanner;

public class UsAlma {
    static int usAlma() {
        int result;
        int sabit = 1;
        int taban,us;
        Scanner inp = new Scanner(System.in);
        System.out.println("Taban degeri giriniz :");
        taban = inp.nextInt();
        System.out.println("Us degeri giriniz :");
        us = inp.nextInt();
        for (int i = 0;i < us;i++) {
            result = taban * sabit;
            sabit = result;
            System.out.println("Result :" + result);
        }
        return usAlma();
    }
    public static void main(String[] args) {
        usAlma();
    }
}
