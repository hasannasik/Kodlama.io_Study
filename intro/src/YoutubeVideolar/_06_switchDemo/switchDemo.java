package YoutubeVideolar._06_switchDemo;

public class switchDemo {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("mukemmel");
                break;
            case 'B':
                System.out.println("cok iyi");
                break;
            case 'C':
                System.out.println("iyi");
                break;
            case 'D':
                System.out.println("Fena degil");
                break;
            case 'F':
                System.out.println("Kaldiniz");
                break;
            default:
                System.out.println("gecersiz not girdiniz");
        }
    }
}