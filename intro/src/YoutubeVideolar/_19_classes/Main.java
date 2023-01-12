package YoutubeVideolar._19_classes;

public class Main {
    public static void main(String[] args) {
        // class'lar referance type'dir
        CustomerManager customerManager=new CustomerManager();
        CustomerManager customerManager2=new CustomerManager();
        customerManager=customerManager2;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        //value
        int sayi1=10;
        int sayi2=20;
        sayi2=sayi1;
        sayi1=30;
        System.out.println(sayi2);
        // int deger tiptir.Deger tip ile alakali bir sey tanimlandigi zaman heap ile alakasi yoktur orada nesne olsutrmaz
        // bu yuzden sayi2 yi 1 e esitledigimiz anda sadece degerini esitlemis oluyoruz.Yani sayi1 in degeri sayi 2 nin yeni degeri olup sayi1 ile alakasi kalmiyor.
        // deger transferi gibi denebilir.
        // sayi1 e yeni bir deger atandiginda sayi2 bundan etkilenmez

        int[] sayilar1=new int[]{1,2,3};
        int[] sayilar2=new int[]{4,5,6};
        sayilar2=sayilar1;
        sayilar1[0]=10;
        System.out.println(sayilar2[0]);

        // burada yukarindan farkli bir durum soz konusu
        // Stack bolgesinde sayilar 1 ve sayilar2 heap bolgesinde bu nesnelerin degerleri olusuyor
        // sayilar2=sayilar1 dendigi zaman artik sayilar2 nin degerleri sayilar1 in degerleri oluyor.
        // ikiside ayni nesneye sahip olmus oluyor
        // sayilar1 den yapilan bir degisiklik sayilar2 yi etkiliyor.

    }
}

