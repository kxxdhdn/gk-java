package org.example.facileIntermediaire.palindrome;

/*
 Écrivez une méthode qui prend un mot en entrée et renvoie vrai si ce mot est un palindrome
 (il est le même que vous le lisez de gauche à droite ou de droite à gauche), et faux sinon.
 */
public class Exercice {

    public static boolean isPalindrome(String word) {
        return false;
    }


    public static void main(String[] args) {
        String word = "radar";
        boolean isPal = isPalindrome(word);
        if (isPal) {
            System.out.println(word + " est un palindrome.");
        } else {
            System.out.println(word + " n'est pas un palindrome.");
        }
    }
}
