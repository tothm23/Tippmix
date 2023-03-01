package h_06;

import static java.lang.System.out;

/**
 *
 * @author Tóth Milán
 *
 */
public class Feladat1 {

    private static String[][] meccsek = {
        {"u36", "FC Barcelona-Real Madrid", "D"},
        {"b51", "Ferencváros-Bayern München", "H"},
        {"a48", "Magyarország-Manchester United", "V"},
        {"p99", "Chelsea-Juventus", "H"},
        {"f88", "Arsenal-Lombard Pápa", "V"},
        {"y46", "AC Milan-RealMadrid", "D"},
        {"g87", "Spanyolország-Borussia Dortmund", "H"},
        {"xl5", "Manchester City-Debreceni VSC", "D"},
        {"o78", "Inter-Paris St. Germain", "V"},
        {"i98", "Atlético Madrid-Németország", "V"}
    };

    private static String[] userTipp = {"o78", "D"};

    private static String[][] userTipp2 = {
        {"u36", "D"},
        {"b51", "H"},
        {"a49", "V"},
        {"p99", "H"}
    };

    private static Double[][] odds = {
        {2.2, 3.1, 1.82},
        {2.2, 3.1, 1.82},
        {2.2, 3.1, 1.82},
        {2.2, 3.1, 1.82}
    };

    public static void main(String[] args) {
        out.println("1. feladat");
        jatek1(userTipp, meccsek);
        out.println("\n2. feladat");
        jatek2(userTipp2, meccsek);
        out.println("\n3. feladat");
        jatek3(userTipp2, meccsek, odds, 1000);
    }

    public static void jatek1(String[] userTipp, String[][] meccsek) {

        boolean ervenyesTipp = false;
        String eredmeny = "";

        for (int i = 0; i < meccsek.length; i++) {

            // Ha van ilyen sorszámú meccs
            if (meccsek[i][0].equalsIgnoreCase(userTipp[0])) {
                ervenyesTipp = true;
                eredmeny = meccsek[i][2];
                break;
            }
        }

        if (ervenyesTipp) {
            out.println("A tipp érvényes, a meccs kimenetele: " + eredmeny);
        } else {
            out.println("A tipp érvénytelen");
        }

    }

    public static void jatek2(String[][] userTipp2, String[][] meccsek) {

        for (int i = 0; i < userTipp.length; i++) {

            // Ha van ilyen sorszámú meccs
            if (meccsek[i][0].equalsIgnoreCase(userTipp2[i][0])) {
                out.println("A tipp érvényes, a meccs kimenetele: " + meccsek[i][0]);
            } else {
                out.println("A tipp érvénytelen");
            }
        }

    }

    public static void jatek3(String[][] userTipp2, String[][] meccsek, Double[][] odds, Integer tet) {

        int helyesTippek = 0;
        for (int i = 0; i < userTipp2.length; i++) {

            // Ha van ilyen sorszámú meccs és megegyeznek a tippek
            if (meccsek[i][0].equalsIgnoreCase(userTipp2[i][0]) && meccsek[i][2].equalsIgnoreCase(userTipp2[i][1])) {
                out.println("A tipp érvényes és jó tipp");
            } else {
                out.println("A tipp érvénytelen");
            }
        }
    }
}
