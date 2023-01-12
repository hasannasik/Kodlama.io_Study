package YoutubeVideolar._027_abstractClasses;

public abstract class GameCalculator {
    public abstract void calculate();
    public final void gameOver()
    {
        System.out.println("Game Over");
    }

    // abstract kullanim zorunlulugu manasina gelir.
    // inherite edilen classlar absract edilen metodu doldurmak zorundadirlar.
    // abstact classlar new lenemez
    // inherite edilen classlar uzeinden new lenebilir
    //final ise kullanim zorunlulugu ama abstract in aksina yazilan metod degistirilemez

}
