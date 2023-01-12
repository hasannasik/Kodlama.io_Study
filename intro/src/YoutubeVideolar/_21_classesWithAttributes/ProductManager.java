package YoutubeVideolar._21_classesWithAttributes;

public class ProductManager {
    public void Add(Product product){
        //JDBC ile veri tabanina kayit yapacagiz
        System.out.println("urun eklendi. "+product.getName());
    }
    public void Add2(int id,String name,String description,int stockAmount,double price,String color)
    {

    }
}
