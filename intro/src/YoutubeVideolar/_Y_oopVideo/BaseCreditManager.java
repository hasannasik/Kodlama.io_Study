package YoutubeVideolar._Y_oopVideo;

abstract class BaseCreditManager implements ICreditManager{
    @Override
    public abstract void Calculate();

    @Override
    public void Save() {
        System.out.println("Kaydedildi");
    }
}
