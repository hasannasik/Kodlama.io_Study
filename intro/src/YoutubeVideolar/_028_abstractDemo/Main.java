package YoutubeVideolar._028_abstractDemo;

public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager=new CustomerManager();
        customerManager.databaseManager=new MySQLDatebaseManager();
        customerManager.getCustomers();
        // sisteme yeni bir ozellik getirildiginde bir kod degismemeli

    }

}
