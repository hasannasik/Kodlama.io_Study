package YoutubeVideolar._031_staticDemo;

public class ProductValidator {

    static {
        System.out.println("Static yapici blok eklendi.");
    }
    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    public void bisey()
    {
        // bu class calismasi icin new productValidator olusturmak gerek
    }

    public static class BaskaBirClass
    {
        public static void Sil()
        {
            // inner class denir
            // classi bolumlenduirmek icin yapililir
        }
    }
}
