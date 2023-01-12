package YoutubeVideolar._029_interfaces;

public class Main {
    public static void main(String[] args) {

        // ICustomerDal iCustomerDal=new ICustomerDal(); interface classlar new islemi olmaz ( abstract gibi )
        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());

        customerManager.add();

        CustomerManager customerManager1= new CustomerManager(new OracleCustomerDal());

        customerManager1.add();


    }
}
