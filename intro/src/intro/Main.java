package intro;

public class Main {
    public static void main(String[] args) {

        //Don't repat yourself!!
        String internetSubeButonu = "İnternet Şubesi";
        double dolarDun = 8.15;
        double dolarBugun = 8.10;
        int vade = 36;
        boolean dustuMu = false;


        System.out.println(internetSubeButonu);

        if (dolarBugun < dolarDun){
            System.out.println("Dolar Düştü resmi");
        }else if(dolarBugun > dolarDun){
            System.out.println("Dolar yükseldi resmi");
        }
        else{
            System.out.println("Dolar eşittir resmi");
        }

        /*
        String kredi1 = "Hızlı Kredi";
        String kredi2 = "mutlu emekli Kredi";
        String kredi3 = "konut Kredi";
        String kredi4 = "çiftçi Kredi";
        String kredi5 = "msb Kredi"; */

        String[] krediler =
                {      "Hızlı Kredi",
                        "mutlu emekli Kredi",
                        "konut Kredi",
                        "çiftçi Kredi",
                        "msb Kredi",
                        "Kültür Bakanlığı Kredisi"
                };

        //foreach döngüsü
        for (String kredi : krediler){
            System.out.println(kredi);
        }

        for (int i = 0; i < krediler.length; i++){
            System.out.println(krediler[i]);
        }

        int[] sayilar1 = {1,2,3,4};
        int[] sayilar2 = {10,20,30,40};

        sayilar1 = sayilar2;
        sayilar2[2] = 5;
        System.out.print(sayilar1[2]);

        for(int sayi : sayilar1){
            System.out.print(sayi);
        }

        String sehir1 = "Ankara";
        String sehir2 = "İstanbul";
        sehir1 = sehir2;
        sehir2 = "İzmir";
        System.out.println(sehir1);




    }
}
