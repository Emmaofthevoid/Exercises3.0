package com.company;

public class Straßenbahn {
    public static void main(String[] args) {
    welcheHaltestelle(1);
    }
    public static void welcheHaltestelle(int haltestelle) {
        int i = haltestelle;
        for (i = haltestelle; haltestelle <= 6; haltestelle++) {
            if (haltestelle == 1) {
                System.out.println("20 mns to destination");
            } else if (haltestelle == 2) {
                System.out.println("16 mns to destination");
            } else if (haltestelle == 3) {
                System.out.println("15 mns to destination");
            } else if (haltestelle == 4) {
                System.out.println("10 mns to destination");
            } else if (haltestelle == 5) {
                System.out.println("3 mns to destination, please get ready");
            } else if (haltestelle == 6) {
                System.out.println("GO OUT, GO OUT!!");
            }
        }
    }
}
