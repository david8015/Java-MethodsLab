package com.Methods.Labs;

import java.util.ArrayList;
import java.util.List;

public class MethodsLab {

    public double maxOfTwoNumbers(double a, double b){
        if (a >b )
            return a;
        else
            return b;
    }

    public double maxOfThree(double a, double b, double c){

       if(a > b && a > c){
           return a;
       }

       if (b > a && b > c){
           return b;
       }

       else
           return c;

    }

    public boolean isCharacterAVowel(char x){

        return x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' ||
                x == 'A' || x == 'B' || x == 'C' || x == 'O' || x == 'U';

    }

    public int numOfArguments(String... args){
        return args.length;
    }

    public String reverseString(String a){
        String result = "";

        for(int i = a.length()-1; i >= 0; i--){
            result += a.charAt(i);
        }
        return result;
    }

    public StringBuilder reverseAnotherString(StringBuilder a){
        return a.reverse();
    }

    public String findLongestWord(String [] a){
        String longestWord = a[0];


        for(int i=1; i < a.length; i++){
          if ( a[i].length() > longestWord.length()){
              longestWord = a[i];
          }
        }

        return longestWord;

    }

    public String [] filterLongWords(String [] a, int b) {

//        arrays have a fixed length. In this case it will have null values

        String [] c = new String [a.length];

        for (int i = 0; i < a.length; i++) {
            if (a[i].length() > b) {
                c[i] = a[i];
                System.out.println(a[i]);

            }
        }
        return c;

    }

    public List filterMoreLongWords(String [] a , int b){
        List<String> c = new ArrayList<>();

        for (int i =0; i < a.length; i++){
            if(a[i].length() > b){
                c.add(a[i]);
            }
        }

        return c;
    }


    public static void main(String[] args) {
        MethodsLab z = new MethodsLab();

       double result =  z.maxOfTwoNumbers(10.23,20.34);
        System.out.println("maxOfTwoNumbers: "+ result);

        double result1 = z.maxOfThree(234,34,343.34);
        System.out.println("maxOfThree: " + result1);

        boolean result2 = z.isCharacterAVowel('e');
        System.out.println("is character a vowel: " + result2);

        int result3 = z.numOfArguments("hello", "there", "sir");
        System.out.println("number of arguments: " + result3);

        String result4 = z.reverseString("hello world");
        System.out.println("from reverse string method: " + result4);

        StringBuilder test = new StringBuilder("hello world");
        StringBuilder result5 = z.reverseAnotherString(test);
        System.out.println("from StringBuilder object: " + result5);

        String [] a = {"hello", "how", "testing", "christmas"};

        String result6 = z.findLongestWord(a);
        System.out.println("longest word in array: " + result6);

        String [] b = {"Monday", "Tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};
        int c = 7;

        //logs words bigger than int c in array
        String [] result7 = z.filterLongWords(b, c);

//        foreach to use non null values
        for (String string: result7
             ) {
            if(string != null){
                System.out.println("longest word array: " + string);
            }

        }

        // with List
        List<String> d = z.filterMoreLongWords(b,c);
        System.out.println("list: " + d);


    }
}
