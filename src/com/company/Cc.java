package com.company;

import java.util.Scanner;

public class Cc {

    public static void main(String[] args) {
        String s;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string");
        s = in.nextLine();

        for (int cryptoChar = 65; cryptoChar < 247; cryptoChar++) {

            System.out.println((char) cryptoChar + " " + cryptoChar);

        }

        String encryptedToString = aTillZ(s);
        System.out.print(encryptedToString);

    }

    static String aTillZ(String s) {
        StringBuilder encryptedSentence = new StringBuilder();

        for (int currentLetter = 0; currentLetter < s.length(); currentLetter++) {

            char originalLetter = s.charAt(currentLetter);
            boolean isBigLetter = originalLetter >= 65 && originalLetter <= 90;
            boolean isSmallLetter = originalLetter >= 97 && originalLetter <= 122;
            char encryptedLetter = (char) (originalLetter + 3);
            char finishedEncryptedLetter;
            char backToA;
            if (isBigLetter) {
                finishedEncryptedLetter = (char) (encryptedLetter - 65);
                backToA = (char) (finishedEncryptedLetter % 26 + 65);
                encryptedSentence.append(backToA);
            } else if (isSmallLetter) {
                finishedEncryptedLetter = (char) (encryptedLetter - 97);
                backToA = (char) (finishedEncryptedLetter % 26 + 97);
                encryptedSentence.append(backToA);
            } else {
                encryptedSentence.append(originalLetter);
            }
        }
        return encryptedSentence.toString();
    }

}