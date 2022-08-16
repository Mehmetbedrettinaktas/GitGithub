package day2;

public class day2GitGithub {

    /*
    1) git init  --> Local repo olusturmak icin yani .git ile klasorumuzun
    icindeki dosyalari iliskilendirmek icin kullanilir

    2) git add .  --> Wrking space'den (yani yerel) dosyalarimi staging area'ya
    (yani commitlemek icin beklenen yer) gonderilir

    3) git status --> Working space'deki ve staging area 'daki durumu gosterir

    4) git commit -m"mesaj" ---> staging area dan commt storra dosyalarimi gondermek icin kullanilir
    ( commit yani versiyon yani surum olusturmus olurum)

    5) gir push ---> uzak repo'ya(yani remote - GitHub) gondermek icin kullandigimiz kod
    Yalniz git push  komutunu kullanmak istersek 1 kez
               git remote add origin  adress(github)taki adresimiz-
               git pus -u origin master (bizim brancimizin adi)
      Not: Yukardaki  iki komutu tek seferde kullandiktan sonra ikinci commit'lerim icin sadece
      git push kullaniriz


<<<<<<< HEAD

     not: git add . yapmadan  git commit -a -m"V5" --> seklinde yazabiliriz.
      ama bir defa  git add . yapmis olmamiz lazim

      surekli calis

      Not: Github ogrendim
      6) git pull ---> Remote(yani uzak repo) dosyalarimizi guncellemek icin kullanilir

      Not: git log --oneline --> Commitlerimdeki yani versionlarimdaki hash kodlarimin durumunu goruyorum



     */
    public static void main(String[] args) {
        System.out.println("Brach  1. deneme ");
        System.out.println("Master 1. deneme ");

    }
}
