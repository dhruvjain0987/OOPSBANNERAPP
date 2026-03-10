package src;

import java.util.HashMap;
import java.util.Map;

public class OopsBannerApp {

    public static Map<Character, String[]> createBannerMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                "  ***  ",
                " *   * ",
                "*     *",
                "*     *",
                "*     *",
                " *   * ",
                "  ***  "
        });

        map.put('P', new String[]{
                "*****  ",
                "*   *  ",
                "*   *  ",
                "*****  ",
                "*      ",
                "*      ",
                "*      "
        });

        map.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ****  ",
                "     * ",
                "     * ",
                "*****  "
        });

        return map;
    }

    public static void main(String[] args) {

        Map<Character, String[]> bannerMap = createBannerMap();

        char[] word = {'O', 'O', 'P', 'S'};

        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (char c : word) {
                line.append(bannerMap.get(c)[i]).append("  ");
            }

            System.out.println(line);
        }
    }
}