package YoutubeVideolar._11_stringsDemo;

public class stringsDemo {
    public static void main(String[] args) {
        String mesaj = "Bugun hava cok guzel.";
        System.out.println(mesaj);



        /*System.out.println("Eleman sayisi : " + mesaj.length());
        System.out.println("5. eleman : " + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yasasin"));
        System.out.println(mesaj.startsWith("A"));
        System.out.println(mesaj.endsWith("."));
        char[] karakterler=new char[5];
        mesaj.getChars(0,5,karakterler,0);
        // 0 dan baslayarak 0. karakterden 4(dahil degil). karaktere kadar karakterler dizisine ata
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("av"));
        // ilk buldugunda aramayi bitirir
        System.out.println(mesaj.lastIndexOf("a"));
        // sondan aramaya baslar ama index sagdan baslar */

        String yeniMesaj=mesaj.replace(' ','-');
        System.out.println(mesaj.replace(' ','-'));
        System.out.println("-----------------");
        System.out.println(yeniMesaj);
        System.out.println(mesaj);

        System.out.println(mesaj.substring(2));
        System.out.println(mesaj.substring(2,5));

        for (String kelime : mesaj.split(" "))
        {
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());


    }
}
