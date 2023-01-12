package YoutubeVideolar._15_arkadasSayilar;

public class arkadasSayilar {
    public static void main(String[] args) {
        int sayi1=220;
        int sayi2=284;
        int total1=0;
        int total2=0;

        for (int i = 1; i < sayi1 ; i++) {

            if (sayi1%i==0)
            {
                total1+=i;
            }

        }
        System.out.println(total1);

        for (int i = 1; i < sayi2 ; i++) {

            if (sayi2%i==0)
            {
                total2+=i;
            }

        }
        System.out.println(total2);

        if (total1==sayi2 && total2==sayi1)
        {
            System.out.println("Bu sayilar arkadas sayilardir");
        }
        else System.out.println("Bu sayilar arkadas sayi degildir");




    }
}
