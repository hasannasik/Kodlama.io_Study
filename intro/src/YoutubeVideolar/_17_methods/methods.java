package YoutubeVideolar._17_methods;

public class methods {
    public static void main(String[] args) {
        sayiBulmaca();
    }

    public static void sayiBulmaca() {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 2;
        boolean varMi = false;

        for (int sayi : sayilar) {

            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }
        if (varMi) {
            mesajVer("sayi mevcuttur :" + aranacak);
        } else mesajVer("sayi mevcut degildir :" + aranacak);
    }

    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);

    }
}

