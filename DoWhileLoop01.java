package day13loopsarrays;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        //EX 1: kullanıcıdan bir sayı alınız, sayi 100den küçük ise ekrana "kazandın" yazdırınız.
        //aksi halde ekrana "kaybettin" yazdırınız. kullanıcı kazandıkça oyun devam etmeli.
        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        do {
            System.out.println("Bir Sayı Giriniz");

             sayi = scan.nextInt();

            if (sayi<100){
                System.out.println("Kazandınız!");
            }
        }while(sayi<100);
        System.out.println("Kaybettiniz :(");

        //Kullanıcadan isimler alınız. ilk harfin büyük olup olmadığını kontrol ediniz.


        do {
            System.out.println("Lutfen isim giriniz");
            char ilkHarf = scan.next().charAt(0);

            if (ilkHarf>='A' && ilkHarf<='Z'){
                System.out.println("İsmi Başarıyla Girdiniz");
            }else {
                System.out.println("İsmi yanlış girdiğiniz için işleminiz iptal edilmiştir");
                break;
            }


        }while (true);

        //çift sayı giren kazansın tek sayı giren kaybetsin tarzı oyunlar yapıp kod yazınız.

        //infinite loop : Sonsuz döngü
        //out of memory otomatik durur. tehlike bir şeydir.
        //Artırma azaltama kısmında hata olursa ya da artırma azaltma kısmı olmazsa infinite loop hatası alırsnız.




    }
}
