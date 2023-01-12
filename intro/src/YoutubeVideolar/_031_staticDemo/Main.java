package YoutubeVideolar._031_staticDemo;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager=new ProductManager();
        Product product=new Product();
        product.id=0;
        product.name="hasan";
        product.price=-122;

        productManager.add(product);

        DataBaseHelper.Connection.createConnection();// cok onerilmez
        // bir class sadece bir is yapmasi daha saglikli olur (single responsiblity)
        // bunun yerine connection ve crud adinda 2 class olusturmak daha iyi olur


    }
}
