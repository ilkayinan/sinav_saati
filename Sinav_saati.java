/* 
1. Oku: sinavin adi, baslangic saati,baslangic dakikasi, sinav suresi
2. Sinav bitis saati ve dakikasi hesapla
  2.1 Baslangic dakikasi ve sinav suresini topla.
  2.2 Baslangıc dakikasi ve sinav suresi toplamini 60 a bol ve asagi yuvarla. Ciktiyi sinav baslangic saatine ekleyip, sinav bitis saatini bul.
    2.2.1 Sinav bitis saati 24'ten buyukse sinav bitis saatinden 24 cikarip, sinav bitis saatini tekrar hesapla.
  2.3 Baslangic dakikasi ve sinav suresi toplamini mod 60 ta hesaplayip kalani bul sinav bitis dakikasina esitle.
 3. Sinav adi, baslangıc saati ve dakikasini, sinav bitis saati ve dakikasini yazdir.

*/

package sinav_saati;

import java.util.Scanner;
public class Sinav_saati {

    public static void main(String[] args) {
System.out.println("Sinav adi giriniz");
	    Scanner girdi = new Scanner(System.in);
            String sinav_adi = girdi.next();
		
		
System.out.println("Sinav baslangic saati giriniz");
	    Scanner girdi_1 = new Scanner(System.in);
            int sinav_baslangic_saati = girdi_1.nextInt();

		
System.out.println("Sinav baslangic dakikasi giriniz");
	    Scanner girdi_2 = new Scanner(System.in);
            int sinav_baslangic_dakikasi = girdi_2.nextInt();
                
                
System.out.println("Sinav suresi giriniz");
	    Scanner girdi_3 = new Scanner(System.in);
            int sinav_suresi = girdi_3.nextInt();
int a;
int sinav_bitis_saati;
int sinav_bitis_dakikasi;
        a =  sinav_baslangic_dakikasi + sinav_suresi;
        double b = (a/60);
        sinav_bitis_saati = sinav_baslangic_saati + (int)(Math.floor(b));
        if (sinav_bitis_saati>=24){
            sinav_bitis_saati =sinav_bitis_saati - 24;
        }
        sinav_bitis_dakikasi = a%60;

        System.out.println(sinav_adi+ " sinavi "+sinav_baslangic_saati+":"+sinav_baslangic_dakikasi+"'da baslayip "+sinav_bitis_saati+":"+sinav_bitis_dakikasi+"'da bitecektir.");
    }
    
}
