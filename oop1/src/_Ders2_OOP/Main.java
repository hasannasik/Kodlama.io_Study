package _Ders2_OOP;
public class Main{
    public static void main(String[] args) {
    String mesaj = "Vade oranı ";

    Product product1 = new Product();
    product1.setName("Delonghi Kahve Makinesi");
    product1.setDiscount(7);
    product1.setUnitPrice(8000);
    product1.setUnitsInStock(10);
    product1.setImageUrls("image1.jpg");

    Product product2 = new Product();
    product2.setName("Smeg Kahve Makimesi");
    product2.setDiscount(10);
    product2.setUnitPrice(7750);
    product2.setUnitsInStock(1);
    product2.setImageUrls("image2.jpg");


    Product product3 = new Product();
    product2.setName("ABC Kahve Makimesi");
    product2.setDiscount(12);
    product2.setUnitPrice(5000);
    product2.setUnitsInStock(1);
    product2.setImageUrls("image3.jpg");


    Product[] products = {product1, product2, product3};

    System.out.println("<ul>");
    for (Product product : products) {
        System.out.println("<li>" + product.getName() + "</li>");

    }
    System.out.println("</ul>");

    IndividualCustomer individualCustomer=new IndividualCustomer();
    individualCustomer.setId(1);
    individualCustomer.setCustomerNumber("123456");
    individualCustomer.setPhone("05372759395");
    individualCustomer.setFirstName("hasan");
    individualCustomer.setLastName("asik");

    CorporateCustomer corporateCustomer=new CorporateCustomer();
    corporateCustomer.setId(2);
    corporateCustomer.setCompanyName("Kodlama.io");
    corporateCustomer.setPhone("02121587455");
    corporateCustomer.setTaxNumber("12121212");
    corporateCustomer.setCustomerNumber("543210");

    Customer[] customers={individualCustomer,corporateCustomer};






}
}
