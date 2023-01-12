package YoutubeVideolar._Y_oopVideo;

public class CustomerManager {
    private Customer customer;
    private ICreditManager iCreditManager;
    public CustomerManager(Customer customer,ICreditManager iCreditManager){
        this.customer=customer;
        this.iCreditManager=iCreditManager;
    }
    public void Save()
    {
        System.out.println("Musteri kaydedildi : ");
    }
    public void Delete()
    {
        System.out.println("Musteri silindi : ");
    }
    public void giveCredit()
    {
        iCreditManager.Calculate();
        System.out.println("Kredi verildi.");

    }
}
