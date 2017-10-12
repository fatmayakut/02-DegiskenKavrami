/**
 * Created by fyakut on 12.10.2017.
 * değişken; bellekte saklamak istediğimiz verilerin isimlendirilmesidir.
 * bellekte ben "5 " sayısısnı saklamak istiyor isem a=5 dediğimde değişkenim "a" olmaktadır.
 * Ayni tiptekiler aynı değişkene atanabilir.
 */
public class Degiskenler {
    public static void main(String[] args){
        int a=5;
        int ilkSayim=10;
        int ikinciSayim=15;
        System.out.println(a);
        System.out.println(a+7);
        System.out.println(8+7);
        System.out.println("fatma yakut java dersleri");
        System.out.println(ikinciSayim+ilkSayim);
        System.out.println("Byte" +Byte.MAX_VALUE+Byte.MIN_VALUE+Byte.SIZE);
        System.out.println("int" +Integer.MAX_VALUE+Integer.MIN_VALUE+Integer.SIZE);

        /**java 7 ile gelen özellik boşluk yada tireleri görmezden gelip birleştirme yapar
         */
        int Enbuyukdeger=2_565_123_56;
        System.out.println("enbuyukdeğer"+Enbuyukdeger);
        System.out.println("float" +Float.MAX_VALUE+Float.MIN_VALUE+Float.SIZE);
        float sayi=9.264f;//sonuna f yazılmalıdır
        double sayi2=9.1;
        System.out.println("double" +Double.MAX_VALUE+Double.MIN_VALUE+Double.SIZE);
        System.out.println("float:"+sayi);
        System.out.println("double:"+sayi2);

       char harf='A';
       int sayi1=harf;
        System.out.println("char harf:"+harf+"sayi1:"+sayi1);
//bir değişkene aynı veri tipteki veriler atılabilir. char olan veriyi int olan değişkende tutulmamalı
    }
}
