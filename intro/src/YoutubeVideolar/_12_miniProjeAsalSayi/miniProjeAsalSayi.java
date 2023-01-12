package YoutubeVideolar._12_miniProjeAsalSayi;

public class miniProjeAsalSayi {
    public static void main(String[] args) {
        int number = 19;
        int remainder = number % 2;
        // System.out.println(remainder);
        boolean isPrime = true;

        if (number==1)
        {
            System.out.println("sayi asal degildir.");
            return;
        }

        if (number<1){
            System.out.println("gecersiz sayi girildi");
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        if (false){
            System.out.println("sayi asaldir");
        }
        else {
            System.out.println("sayi asal degildir");
        }



    }
}
