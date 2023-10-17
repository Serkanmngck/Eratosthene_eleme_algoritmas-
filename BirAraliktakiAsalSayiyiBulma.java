import java.util.ArrayList;
import java.util.Scanner;

class AsalBulma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int baslangicDeger = 0, sonDeger = 0;
        // kullanıcıdan aralik değer alıyoruz fakat önce kücük değeri girmez ise
        // dongunun içinde tutuyoruz.
        while (true) {
            System.out.println("Asal sayilari ogrenemk istediginiz araligi sirasiyla giriniz (n,m) ");
            baslangicDeger = scanner.nextInt();
            sonDeger = scanner.nextInt();
            if (baslangicDeger > sonDeger) {
                System.out.println("baslangic deger son degerden buyuk olamaz");
                continue;
            } else {
                break;
            }
        }

        boolean[] asallarSorgu = new boolean[sonDeger + 1];// poolean turunde bir dizi alıyoruz
        for (int i = 0; i < sonDeger + 1; i++) {// dizimizi son araliktaki değere true atıyoruz.
            asallarSorgu[i] = true;
        }
        int i = 2;
        for (; i <= sonDeger; i++) {// 2 den son degere kadar sayıları alıyoruz
            for (int j = 2; j * i <= sonDeger; j++) {// her i degerinin katlarını alarak dizimizdeki o elamana false
                                                     // degeri atıyoruz
                asallarSorgu[i * j] = false;
            }
        }
        System.out.println(baslangicDeger + " - " + sonDeger + " Araligindaki asal sayilar");
        for (i = baslangicDeger; i <= sonDeger; i++) {// asal elamanları yazdırma.
            if (asallarSorgu[i]) {
                System.out.println(i);
            }
        }

    }

}