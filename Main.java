import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        double msf, yas, yon, ucret, yas12Ucret, yas24Ucret, yas65Ucret, gitGelUcret, gitGel12Ucret,
        gitGel24YasUcret,gitGel65YasUcret;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kaç km? ");
        msf = inp.nextDouble();
        System.out.print("Yaş kaç? ");
        yas = inp.nextDouble();
        System.out.print("1)Tek Yön mü\n2)Gidiş-Dönüş mü ?\n[1/2]: ");
        yon = inp.nextDouble();

        ucret = msf*0.1;
        yas12Ucret = ucret/2;
        yas24Ucret = ucret*0.9;
        yas65Ucret = ucret*0.7;

        gitGelUcret = (ucret*0.8)*2;
        gitGel12Ucret = (yas12Ucret*0.8)*2;
        gitGel24YasUcret = (yas24Ucret*0.8)*2;
        gitGel65YasUcret = (yas65Ucret*0.8)*2;

        if (yas<12){
            if(yon == 1){
                ucret  = yas12Ucret;
                System.out.println("Toplam Tutar: "+ucret);
            }
            else if (yon == 2){
                ucret = gitGel12Ucret;
                System.out.println("Toplam Tutar: "+ucret);
            }
            else {System.out.println("Hatalı Veri Girdiniz!");}
        }
        else if (yas > 12 && yas < 24){
            if(yon == 1){
                ucret = yas24Ucret;
                System.out.println("Toplam Tutar: "+ucret);
            }
            else if (yon == 2) {
                ucret = gitGel24YasUcret;
                System.out.println("Toplam Tutar: "+ucret);
            }
            else {System.out.println("Hatalı Veri Girdiniz!");}
        }
        else if (yas > 65){
            if(yon == 1){
                ucret = yas65Ucret;
                System.out.println("Toplam Tutar: "+ucret);
            }
            else if (yon == 2){
                ucret = gitGel65YasUcret;
                System.out.println("Toplam Tutar: "+ucret);
            }
            else {System.out.println("Hatalı Veri Girdiniz!");}
        }
        else{
            if(yon == 1){
                ucret = ucret;
                System.out.println("Toplam Tutar: "+ucret);
            }
            else if (yon == 2){
                ucret = gitGelUcret;
                System.out.println("Toplam Tutar: "+ucret);
            }
            else {System.out.println("Hatalı Veri Girdiniz!");}   
        }
    }
}