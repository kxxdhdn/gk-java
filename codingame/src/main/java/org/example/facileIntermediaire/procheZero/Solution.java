package org.example.facileIntermediaire.procheZero;

import java.util.Arrays;

public class Solution {

    static int closestToZero(int[] ints) {

        if (ints == null || ints.length == 0) {
            return 0;
        }

        Arrays.sort(ints);

        int closest = ints[0];
        for (int i = 1; i < ints.length; i++) {
            int currentAbs = ints[i] < 0 ? -ints[i] : ints[i];
            int closestAbs = closest < 0 ? -closest : closest;

            if (currentAbs < closestAbs || (currentAbs == closestAbs && ints[i] > closest)) {
                closest = ints[i];
            }
        }

        return closest;
    }

    public static void main(String[] args) {
        int[] arr = {-5, 2, -1, -8, 1};
        int result = closestToZero(arr);
        System.out.println("Le nombre le plus proche de zéro est : " + result);
        if(result == 1){
            System.out.println("OK");
        }else {
            System.out.println("Error");
        }
    }
}
