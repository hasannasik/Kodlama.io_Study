package YoutubeVideolar._029_interfaces;

public class CustomerManager  {
    private ICustomerDal customerDal;
    public CustomerManager(ICustomerDal customerDal)
    {
        this.customerDal = customerDal;
    }

    public void add()
    {
        customerDal.add();
        // is kodlari yazilir.
    }
}
