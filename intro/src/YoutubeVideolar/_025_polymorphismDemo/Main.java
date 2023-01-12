package YoutubeVideolar._025_polymorphismDemo;

public class Main {
    public static void main(String[] args) {
//        EmailLogger logger1 = new EmailLogger();
//        logger1.Log("Log Mesaji");
//
//        DatabaseLogger logger2=new DatabaseLogger();
//        logger2.Log("Log mesaji");

//
        CustomerManager customerManager=new CustomerManager(new DatabaseLogger());
        customerManager.add();
        CustomerManager customerManager1=new CustomerManager(new EmailLogger());
        customerManager1.add();
        CustomerManager customerManager3=new CustomerManager(new FileLogger());
        customerManager.add();
        CustomerManager customerManager4=new CustomerManager(new ConsoleLogger());
        customerManager1.add();




    }
}
