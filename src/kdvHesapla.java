import java.util.Scanner;
public class kdvHesapla {
    public static void main (String[] args){
        double tutar, cokkdv=0.18,azkdv=0.08,kdvTutar,kdvliTutar;
        Scanner girdi= new Scanner(System.in);
        System.out.print("ücreti giriniz: ");
        tutar=girdi.nextDouble();

        if (tutar>0 && tutar<1000){
            kdvTutar=tutar * cokkdv;
            kdvliTutar= tutar+kdvTutar;
            System.out.println("KDV'SİZ TUTAR: "+tutar);
            System.out.println("KDV ORANI:"+cokkdv);
            System.out.println("KDV TUTARI: "+kdvTutar);
            System.out.println("KDVLİ TUTAR: "+kdvliTutar);
        }
        else if (tutar>1000)
        {
            kdvTutar=tutar * azkdv;
            kdvliTutar= tutar+kdvTutar;
            System.out.println("KDV'SİZ TUTAR: "+tutar);
            System.out.println("KDV ORANI:"+azkdv);
            System.out.println("KDV TUTARI: "+kdvTutar);
            System.out.println("KDVLİ TUTAR: "+kdvliTutar);
        }

    }
}
