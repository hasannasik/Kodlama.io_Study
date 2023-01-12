package YoutubeVideolar._14_mukemmelSayi;

public class mukemmelSayi {
    public static void main(String[] args) {
        int number=28;
        int bolenToplam=0;
        for (int i = 1; i < number; i++) {

            if (number%i==0)
            {
                bolenToplam+=i;
            }

        }
        if (bolenToplam==number)
        {
            System.out.println("Sayi mukemmel sayidir.");
        }
        else System.out.println("Sayi mukemmeel sayi degildir");
    }
}
