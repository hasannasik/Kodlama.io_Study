package YoutubeVideolar._027_abstractClasses;

public class Main {
    public static void main(String[] args) {
        WomanGameCalculator womanGameCalculator=new WomanGameCalculator();
        womanGameCalculator.calculate();
        womanGameCalculator.gameOver();

        // GameCalculator gameCalculator=new GameCalculator(); bu sekilde new lenmez
        GameCalculator gameCalculator=new ManGameCalculator();


    }
}
