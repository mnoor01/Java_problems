package com.company;

import java.util.*;

public class LinkListTest {
 public static void main(String[] args){
//     String numb="15739847982375hgh";
//     Object nice="lkdlfj";
//     System.out.println(nice);
//     Object view=5453423;
//     System.out.println(view);
//List<Integer> list= new ArrayList<>();
//      Object hi=list;


//     System.out.println(Integer.parseInt(numb));
//     char[] you={'a','y','e'};
//     System.out.println(nice(you));
//     System.out.println(fromCharToDecimal('k'));
//     int[] they={1,2,3,5,9,80};
//     System.out.println(removeStuff(they));
//     System.out.println(countTheLetters("elephant"));
//     System.out.println(code("codecodecodecodecooooo"));
//     System.out.println(countTheLetters("tiiimee"));
     int[] hey={5,6,1,5,7,9};
//     System.out.println(sumOfArray(hey));
     System.out.println(longestWord("how are you doing"));
//     System.out.println(ch('c'));


    }

    public void returnAllElementsInThisArray(int[] array){

    }

    public int sumOfInt(int a, int b){
        int c=a+b;
         return c;
    }
    public static String nice(char[] characters){
        StringBuilder stringBuilder= new StringBuilder();
        for (int i = 0; i <= characters.length -1; i++) {
            stringBuilder.append(characters[i]);

        }
        return stringBuilder.toString();
    }
    public static int fromCharToDecimal(char input){

        return Character.getNumericValue(input);
    }
    //encaaspulated dealswith getters and setter
    //arrays are immutable and arraylists are not
    //difference between abstract class and concrete class is that abstract class can't be instantiated but instead extended by a concrete class

    public static HashMap<String,Integer> countTheLetters(String input){
        HashMap<String,Integer > countMap= new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            String letter=Character.toString(input.charAt(i));
            if (countMap.get(letter)==null) {
                countMap.put(Character.toString(input.charAt(i)), 1);//I began when the hashmap is empty then I do the else statement
            }else {
                int timeSeen=countMap.get(letter);
                countMap.put(Character.toString(input.charAt(i)),timeSeen=timeSeen+1);
            }
        }
        return countMap;
    }

    public static int code(String myString){
        int count=0;
        for (int i = 0; i < myString.length()-3; i++) {//if I don't put myString.length()-3 then will gw
            if (myString.charAt(i)=='c'&& myString.charAt(i+1)=='o'&& myString.charAt(i+3)=='e'){
                count++;
            }
        }
        return count;
        }
    public static int sumOfArray(int[ ] numbs){
        int init=0;
        for (int i = 0; i < numbs.length ; i++) {
            init+=numbs[i];

        }
        return init;
    }
    public static String longestWord(String word){
        String what="";
        for (int i = 0; i < word.length(); i++) {
            char nic=word.charAt(i);
            if (!Character.isDigit(nic)){
                word.replace(nic,' ');
               String[] wordArray=word.split(" ");
                for (String max:wordArray) {
                    if (max.length()>what.length()){
                        what=max;
                    }

                }

            }
        }
        return what;

    }

}
/*10+"15"="1015" it prints out as a string
Concurrency allows one thread to run at a time, parallelism allows many threads to run at a time.
Don't make the same mistake twice,
don;t make the same mistake twice.
singly list link the head is the firs node
singly list link is where the head is the first node.
queue is a process where elements are taken from the front of it, and newer elements are added to the back of it:
I learn through repetition
I learn through repetition
I learn through reptition
 */
