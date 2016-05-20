package com.company;

import java.util.Scanner;

public class Cc {

    public static void main(String[] args) {
        /*int a;
        float b;*/
        String s;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string");
        s = in.nextLine();

        for (int cryptoChar = 65; cryptoChar < 247; cryptoChar++) {

            System.out.println((char) cryptoChar + " " + cryptoChar);

        }
//        System.out.println((int)firstLetter+" "+ifBigFirstLetter);
//        if (ifBigFirstLetter){
//            System.out.println((char)(ifBigFirstLetter+3));
//        }


//        System.out.println(s);


//        char firstLetter = s.charAt(0);
//        boolean ifBigFirstLetter = firstLetter >= 65 && firstLetter <= 90;
//        if (ifBigFirstLetter == true) {
//            System.out.println((char) (firstLetter + 3));
//        }
//        //Begin small letters!
//
//        boolean ifSmallFirstLetter = firstLetter >= 97 && firstLetter <= 122;
//        if (ifSmallFirstLetter == true) {
//            System.out.println((char) (firstLetter + 3));
//
//
//        }

        String encryptedToString = aTillZ(s);
        System.out.print(encryptedToString);

//Hej
    }

    public static String aTillZ(String s) {
        StringBuilder encryptedSentence = new StringBuilder();

        for (int currentLetter = 0; currentLetter < s.length(); currentLetter++) {

            char originalLetter = (char) (s.charAt(currentLetter)/*+currentLetter*/);
            boolean ifBigLetter = originalLetter >= 65 && originalLetter <= 90;
            boolean ifSmallLetter = originalLetter >= 97 && originalLetter <= 122;
            char encryptedLetter = (char) (originalLetter + 3);
            char finishedEncryptedLetter;
            char backToA;
            if (ifBigLetter == true) {
                finishedEncryptedLetter = (char) (encryptedLetter - 65);
                backToA = (char) (finishedEncryptedLetter % 26 + 65);
                encryptedSentence.append(backToA);
            } else if (ifSmallLetter == true) {
                finishedEncryptedLetter = (char) (encryptedLetter - 97);
                backToA = (char) (finishedEncryptedLetter % 26 + 97);
                encryptedSentence.append( backToA);
            } else {
                encryptedSentence.append(originalLetter);
            }
        }
        return encryptedSentence.toString();
    }

    }

    /*  public static String aTillW(String s) {
        StringBuilder encryptedSentence = new StringBuilder();

        for (int currentLetter = 0; currentLetter < s.length(); currentLetter++) {
            char originalLetter = (char) (s.charAt(currentLetter)*+currentLetter*);
    boolean ifBigLetter = originalLetter >= 65 && originalLetter <= 90;
    boolean ifSmallLetter = originalLetter >= 97 && originalLetter <= 122;
    char encryptedLetter = (char) (originalLetter + 3);
    if (ifBigLetter == true || ifSmallLetter == true) {
        if (ifBigLetter == true) {
            encryptedSentence.append(encryptedLetter);
        }
        //Begin small letters!


        if (ifSmallLetter == true) {
            encryptedSentence.append(encryptedLetter);


        }
    }
    else {
        encryptedSentence.append(originalLetter);
    }
}
return encryptedSentence.toString();
        }*/

//}

/*
BIG:
A 65
B 66
C 67
D 68
E 69
F 70
G 71
H 72
I 73
J 74
K 75
L 76
M 77
N 78
O 79
P 80
Q 81
R 82
S 83
T 84
U 85
V 86
W 87
X 88
Y 89
Z 90

small:
a 97
b 98
c 99
d 100
e 101
f 102
g 103
h 104
i 105
j 106
k 107
l 108
m 109
n 110
o 111
p 112
q 113
r 114
s 115
t 116
u 117
v 118
w 119
x 120
y 121
z 122
*/