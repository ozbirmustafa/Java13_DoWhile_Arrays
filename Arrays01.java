package day13loopsarrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Arrays01 {
    public static void main(String[] args) {

        //aynı data tipinde çoklu datayı depolamak için javanın oluşturduğu yapılar vardır
        //bu yapılardan birisi de "array"lerdir.

        int[] stdAges = new int[7]; //[0, 0, 0, 0, 0, 0, 0]

        System.out.println(Arrays.toString(stdAges));

        //Arraylere elemanlar nasıl eklenir (elements)

        stdAges [0] = 12;
        stdAges [1] = 11;
        stdAges [2] = 13;
        stdAges [3] = 14;
        stdAges [4] = 10;
        stdAges [5] = 12;
        stdAges [6] = 12;


        System.out.println(Arrays.toString(stdAges));


        //Array deki herhangi bir elemanı nasıl yazdırabiliriz.
        System.out.println(stdAges[4]);

        //Ex 1 : Arraydeki en küçük ve en büyük elemanın toplamını ekrana yazdırınız.

        Arrays.sort(stdAges);
        System.out.println(Arrays.toString(stdAges));

        int ilk = stdAges[0];
        // "length()" parantezli şekilde stringlerde kullanılır.
        // "length" parantezsiz array lerde kullanılır
        int son = stdAges[stdAges.length-1];
        System.out.println(ilk + son);


        //EX 2: stdAges içindeki tüm elemanlaın toplamını yazdıran kodu yaziniz.
        int sum = 0;

        for ( int i = 0 ; i<stdAges.length ; i++  ){

            sum = sum + stdAges[i];
        }
        System.out.println(sum);

        //2.Yol

        int i = 0;
        int top = 0;

        while (i<stdAges.length){

            top = top + stdAges[i];
            i++;
        } System.out.println(top);
        int k = 0;
        int summary = 0;
        do {
           summary = summary + stdAges[k];
           k++;
        }while (k<stdAges.length);
        System.out.println(summary);

        //4.Yol : for each loop Array lerde ve Collections larda kullanılır.
        //array data tipi
        int toplam = 0;
        for (int w :stdAges){
            toplam = toplam + w;
        }
        System.out.println(toplam);
        System.out.println("-------------------");

        //EX 3: String bir array oluşturunuz. bu array e 5 tane isim yerleştiriniz.//ali tom veli kemal can//

        String[] stdNames = new String[5];
        stdNames [0] = "Ali";
        stdNames [1] = "Tom";
        stdNames [2] = "Veli";
        stdNames [3] = "Kemal";
        stdNames [4] = "Can";
        System.out.println(Arrays.toString(stdNames));
        System.out.println(stdNames[2]);

        int karakterSayilarininToplami = 0;
        for ( String w: stdNames) {
            karakterSayilarininToplami = karakterSayilarininToplami + w.length();
        }
        System.out.println(karakterSayilarininToplami);

        //EX 4: char bir array oluşturunuz

        char ch [] = {'a','c','A','D','M'};
        for (char w: ch) {
            if (w>='A' && w<='Z'){
                System.out.print(w + " ");
            }

        }







    }
}
