import java.util.Scanner;
public class Vki{
    public static void main(String[] args){
        Scanner Input = new Scanner (System.in);
        Double Boy, Kilo, Vki ;
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
        Boy = Input.nextDouble();
        System.out.print("Lütfen kilonuzu (kilogram cinsinde) giriniz :");
        Kilo = Input.nextDouble();
        Vki = Kilo / Math.pow (Boy, Boy);
        System.out.print("Vücut Kitle İndeksiniz :" + Vki);
    }
}



    /*Vücut Kitle İndeksi Hesaplama     Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
        Formül
        Kilo (kg) / Boy(m) * Boy(m)

        Çıktısı
        Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
        Lütfen kilonuzu giriniz : 105
        Vücut Kitle İndeksiniz : 35.49215792320173*/
