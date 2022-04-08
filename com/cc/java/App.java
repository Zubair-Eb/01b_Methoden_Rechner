package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
        ausgabe("---------Test-----------");
        ausgabe("Ergebnis+: "+ addieren(8, 9));
        ausgabe("Ergebnis-: "+ sub(8, 2));
        ausgabe("Ergebnis*: "+ multi(8, 9));
        ausgabe("Ergebnis/: "+ division(8, 0));
    
        ausgabe("---------Rechner-----------");

        ausgabe(rechner(4, 5, "+"));
        ausgabe(rechner(4, 5, "-"));
        ausgabe(rechner(4, 5, "*"));
        ausgabe(rechner(4, 5, ":"));
        ausgabe(rechner(4, 0, ":"));
        ausgabe(rechner(4, 5, "#!?_"));



    }

           

    public static String rechner(double a, double b, String op) {

        switch (op) {
            case "+":
                return "Ergebnis: "+ addieren(a, b);
             case "-":
                return "Ergebnis: "+ sub(a, b);
            case "*":
                return "Ergebnis: "+ multi(a, b);
            case ":":
                return "Ergebnis: "+ division(a, b);
            default:
                return "Irgendwas ging schief!";
        }


    }
    public static void ausgabe(String outputStr) {
        System.out.println(outputStr);
    }

    public static Double addieren(double a,double b) {
        return a + b;
    }
    public static Double sub(double a,double b) {
        return a - b;
    }
    public static Double multi(double a,double b) {
        return a * b;
    }
    public static String division(double a,double b) {
        if (b !=0) {
            return Double.toString(a/b);
        } else {
            return "\"Error!\"";
        }
        
    }        



}

