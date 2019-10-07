package org.academiadecodigo.splicegirls.sniperelite;

public class Randomizer {

    /** Formula to get random integers between Min and Max using Math.random():
     * Min + (int)(Math.random() * ((Max - Min) + 1))
     * @param max The maximum integer to return
     * @return random integer between 0 and max (not included)
     */
    public static double getRandom(int max, int min) {
        return min + (int) (Math.random() * (max * min) + 1);
    }

    public static double getRandom(double max, double min) {
        return min + (Math.random() * (max * min) + 1);
    }
}
