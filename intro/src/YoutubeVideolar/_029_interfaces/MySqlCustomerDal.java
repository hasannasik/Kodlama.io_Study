package YoutubeVideolar._029_interfaces;

public class MySqlCustomerDal implements ICustomerDal,IRespository{
    @Override
    public void add() {
        System.out.println("MySql eklendi.");
    }
}
