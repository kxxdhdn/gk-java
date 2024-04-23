package org.example.facileIntermediaire.apparition;

import java.util.*;

public class Solution {

    public static int[] countFrequencies(String[] words) {

        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        List<String> sortedWords = new ArrayList<>(frequencyMap.keySet());
        Collections.sort(sortedWords);

        int[] result = new int[sortedWords.size()];
        for (int i = 0; i < sortedWords.size(); i++) {
            result[i] = frequencyMap.get(sortedWords.get(i));
        }

        Arrays.sort(result);

        return result;
    }

    public static void main(String args[]) {
        String[] input = new String[]{"toto", "titi", "tutu", "toto"};
        int[] expected = new int[]{1, 1, 2};
        int[] output = countFrequencies(input);

        if (Arrays.equals(expected, output)) {
            System.out.println("OK");
        } else {
            System.out.println("ERROR");
            for (int i : output) {
            }
        }

    }

}
