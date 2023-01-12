package YoutubeVideolar._Y_oopVideo;

public class Program {
    public static void main(String[] args) {

        CustomerManager customerManager=new CustomerManager(new Customer(),new TeacherCreditManager());
        customerManager.giveCredit();

        CustomerManager customerManager1=new CustomerManager(new Company(),new MilitaryCreditManager());
        customerManager1.giveCredit();

        CustomerManager customerManager2=new CustomerManager(new Company(), new CarCreditManager());
        customerManager2.giveCredit();


    }
}
