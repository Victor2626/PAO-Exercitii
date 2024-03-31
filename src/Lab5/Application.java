package Lab5;

import java.util.regex.*;
import java.util.Arrays;

public class Application {
    public static void main(String[] args)
    {
        String text = "Odata creat un sir de caractere cu continutul sau nu mai poate fi modificat.";

        System.out.println("1. Lungimea stringului: " + text.length());

        boolean onlyLetters = text.matches("[a-zA-Z]+");
        System.out.println("2. Contine doar litere: " + onlyLetters);

        String[] words = text.split("\\s+");
        int middleIndex = words.length / 2;
        String middleWords = words[middleIndex];
        if (words.length % 2 == 0) {
            middleWords += " " + words[middleIndex - 1];
        }
        System.out.println("3. Cuvintele de la mijloc: " + middleWords);

        StringBuilder reversedText = new StringBuilder(text).reverse();
        System.out.println("4. Stringul inversat: " + reversedText);

        String ex1="c",ex2="x",ex3="a",ex4="B",ex5="aB",ex6="baccbacb",ex7="",ex8="abcbc",ex9="cbabcabcaacbbcccabca",ex10="bbbcacab";
        System.out.println(ex1.matches("[abc]"));
        System.out.println(ex2.matches("[^abc]"));
        System.out.println(ex3.matches("[a-z]"));
        System.out.println(ex4.matches("[a-zA-Z]"));
        System.out.println(ex5.matches("[a-z][A-Z]"));
        System.out.println(ex6.matches("[abc]+"));;
        System.out.println(ex7.matches("[abc]*"));
        System.out.println(ex8.matches("[abc]{5}"));
        System.out.println(ex9.matches("[abc]{5,}"));
        System.out.println(ex10.matches("[abc]{5,10}"));

        String test="Odata creat un sir de caractere cu continutul sau nu mai poate fi modificat.",aux=test;
        //1)
        System.out.println(test.length());
        //2)
        test=test.replaceAll("[ ]","");
        test=test.replaceAll("[.]","");
        System.out.println(test.matches("[a-zA-Z]+"));
        //3)
        String[] cuv=aux.split("[ ]");
        System.out.println(cuv[cuv.length/2-1]);
        //4)
        StringBuilder s=new StringBuilder(aux);
        s=s.reverse();
        System.out.println(s);

    }
}
