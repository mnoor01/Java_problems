package com.company;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;
import sun.jvm.hotspot.runtime.Thread;
import sun.plugin2.jvm.RemoteJVMLauncher;

import javax.security.auth.callback.Callback;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    private static HashMap<Integer, Integer> memorizationMap = new HashMap<>();

    public static void main(String[] args) {
        int[] onix = {4, 5, 3, 235, 50, 77, 99, 99};
        sortInteg(onix);
        System.out.println(removeDupes(onix));
        System.out.println(reuse("que"));
        String s1=giveMeSomeData();
        function2(new SomeCallBack() {
            @Override
            public void call(String s) {
                System.out.println(s1);


            }
        });

        // write your code here
//        Dog dog = new Dog();
//        dog.beFriendly();
//        byte ni;
//        ni=6;
//        System.out.println(reverse("hoojojojojiwfde"));
//        System.out.println(parenthesis(4));
//        System.out.println("fib(0)=" + fin(0));
//        System.out.println("fib(1)=" + fin(1));
//        System.out.println("fib(2)=" + fin(2));
//        System.out.println("fib(3)=" + fin(3));
//        System.out.println("fib(4)=" + fin(4));
//        System.out.print(fin(10));
//        List<Object> list= new ArrayList<>();
//        list.add(new Object());
//        System.out.println(countItems(list));
        String nuet = "nnnisindinscidsn";
        System.out.println(countLets(nuet));
//        System.out.println(mapVals.get(6));
//        System.out.println(inSleep(true,false));
//        System.out.println(reverseString("onomoto"));
//        System.out.println(frontBack("code"));
//        System.out.println(sum(6));
//        sortKeys(mapVals);

//        sortValues(mapVals);
//        sortKeys(mapVals);
//        List<Integer> theMArks = new ArrayList<>();
//        theMArks.add(55);
//        theMArks.add(65);
//        theMArks.add(92);
//        theMArks.add(74);
//        theMArks.add(81);
//        String coding="codenicecodenicecode";
//        System.out.println(countCode(coding));
//        String aceMyExam="qnwknqkenwaknkankannsdnknednjana";
//        System.out.println(countA(aceMyExam));
//        char[] ovo = {'c', 'o', 'c', 'a', 'i', 'n', 'e', '-', 'c', 'o', 'c', 'a', 'i', 'n', 'e'};
//        System.out.println(wordChar(ovo));
//        System.out.println(sum(5));
//        System.out.println(factorial(4));

//        System.out.println(fellowGrades(theMArks));


    }

    private static String giveMeSomeData() {
        return "How Are you?";
    }


//    public static String reverse(String str) {
//        if (str.length() <= 1) {
//            return str;
//        } else {
//            char lastLetter = str.charAt(str.length() - 1);
//            String restOfString = str.substring(0, str.length() - 1);
////            return lastLetter + reverse(restOfString);
//        }
//        return " ";
//    }

    public static String parenthesis(int number) {
        if (number == 0) {
            return "";
//        } else {
//            if ()
//            return "(" +")"+ parenthesis(number - 1);
//
//        }
            //it doesn;t have a stack because it doesn;t return anything


        }
        return "";
    }

    //fibonacci sequence:1,1,2,3,5,8,13
    public static int fin(int n) {
        if (n <= 1) {
            return 1;

        } else {
            int first;
            //checke to see if you have already done the work
            if (memorizationMap.containsKey(n - 1)) {
                first = memorizationMap.get(n - 1);
            } else {
                first = fin(n - 1);
                memorizationMap.put(n - 1, first);
            }
            int second;
            if (memorizationMap.containsKey(n - 2)) {
                second = memorizationMap.get(n - 2);
            } else {
                second = fin(n - 2);
                memorizationMap.put(n - 2, second);
            }
            return first + second;
        }

    }

    public static int countItems(List<Object> list) {
        if (list.isEmpty()) {
            return 0;
        }
        List subList = list.subList(1, list.size());
        return countItems(subList);
    }

    public static boolean removeDupes(int[] dupeArray) {
        HashMap<Integer, Integer> intMap = new HashMap<>();
        List<Integer> mapList = new ArrayList<>();

        for (int i = 0; i < dupeArray.length; i++) {
            if (!intMap.containsKey(dupeArray[i])) {
                intMap.put(dupeArray[i], 1);
            } else {
                intMap.put(dupeArray[i], intMap.get(dupeArray[i]) + 1);


            }


        }
        for (Integer numbers : intMap.keySet()) {
            if (intMap.get(numbers) > 1) {
                return false;


            }

        }
        return true;

    }

    public static void sortArray(int[] arr) {
        for (int i = arr.length; i > 0; i--) {
            int largest = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[largest]) {
                    largest = j;
                }

            }
            int temp = arr[largest];
            arr[largest] = arr[i - 1];
            arr[i - 1] = temp;
        }
    }

    public static void myNew(int[] newArray) {
        sortArray(newArray);
        System.out.println(newArray);
    }

    public static void sortList(List<Integer> myList) {
        for (int i = myList.size(); i > 0; i--) {
            int biggest = 0;
            for (int j = 0; j < i; j++) {

                if (myList.get(j).compareTo(myList.get(biggest)) < 0) {
                    biggest = j;
                }


            }
            int larga = myList.get(biggest);
            myList.set(biggest, myList.get(i - 1));
            myList.set(i - 1, larga);


        }

    }

    public static void sortValues(HashMap<Integer, Integer> mapOfMine) {
        List<Integer> vals = new ArrayList<>();

        for (int intVals : mapOfMine.values()) {
            vals.add(intVals);

        }
        for (int i = vals.size(); i > 0; i--) {//now I am going to sort the list using sorting
            //I am going to use this for loop and and iterate through each item in the loop.
            //before I do that I am going to have an datatype of type int and
            //assign it to a value of 0.
            //the inside the for loop i will create a if statement where
            //I will compare the value at each iteration and the value at the index of
            //the object int.
            int muyLarga = 0;
            for (int j = 0; j < i; j++) {
                if (vals.get(j).compareTo(vals.get(muyLarga)) < 0) {
                    muyLarga = j;
                }
            }
            int theLargest = vals.get(muyLarga);
            vals.set(muyLarga, vals.get(i - 1));
            vals.set(i - 1, theLargest);


        }
        for (int j = 0; j < vals.size(); j++) {
            System.out.println(vals.get(j));

        }

    }

    public static void sortKeys(HashMap<Integer, Integer> keyMap) {
        List<Integer> mapkeys = new ArrayList<>();

        for (int keys : keyMap.keySet()) {//the for each loop puts in a unique key or value from a hashmap
            mapkeys.add(keys);

        }
        for (int i = mapkeys.size(); i > 0; i--) {
            int initValarga = 0;
            for (int j = 0; j < i; j++) {
                if (mapkeys.get(j).compareTo(mapkeys.get(initValarga)) > 0) {
                    initValarga = j;
                }
            }
            int theGrande = mapkeys.get(initValarga);
            mapkeys.set(initValarga, mapkeys.get(i - 1));
            mapkeys.set(i - 1, theGrande);

        }
        for (int i = 0; i < mapkeys.size(); i++) {
            System.out.print(mapkeys.get(i) + " ");
        }
    }

    public static HashMap<Character, Integer> fellowGrades(List<Integer> grades) {
        HashMap<Character, Integer> miGrades = new HashMap<>();

        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) <= 55) {
                miGrades.put('F', grades.get(i));
            } else if (grades.get(i) > 55 && grades.get(i) < 65) {
                miGrades.put('D', grades.get(i));
            } else if (grades.get(i) >= 65 && grades.get(i) < 75) {
                miGrades.put('C', grades.get(i));
            } else if (grades.get(i) >= 75 && grades.get(i) < 85) {
                miGrades.put('B', grades.get(i));

            } else if (grades.get(i) >= 85 && grades.get(i) < 100) {
                miGrades.put('A', grades.get(i));
            } else {
                System.out.println("input does not exist");
            }

        }
        return miGrades;

    }

    //for a give string count how many time code is in it.
    public static int countCode(String input) {
        int count = 0;
        for (int i = 0; i < input.length() - 3; i++) {
            if (input.charAt(i) == 'c' && input.charAt(i + 1) == 'o' && input.charAt(i + 2) == 'd' && input.charAt(i + 3) == 'e') {
                count++;
            }

        }
        return count;
    }

    //count the number of a' in a string using a hashmap
    public static HashMap<Character, Integer> countA(String ace) {
        HashMap<Character, Integer> intCharMap = new HashMap<>();
        int count = 0;
        for (int i = 0; i < ace.length(); i++) {
            if (ace.charAt(i) == 'a') {
                count++;
                intCharMap.put(ace.charAt(i), count);
            }

        }
        return intCharMap;
    }

    //take the letters in a charArray an put them together and then split
    public static HashMap<String, Integer> wordChar(char[] lets) {
        HashMap<String, Integer> inStr = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(lets);
        String newSb = stringBuilder.toString();
        System.out.println(newSb);
        String[] nice = newSb.split("-");//Splits string into a String array.
        for (String s : nice) {
            System.out.println(s);
        }
        int count = 0;
        for (int i = 0; i < nice.length; i++) {

            if (nice[i].equals("cocaine")) {
                count++;
                inStr.put(nice[i], count);
            } else {
                inStr.put(" ", 0);
            }
        }

        return inStr;
    }

    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);

    }

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static String reverse(String sentence) {
        if (sentence.length() == 1) {
            return sentence;
        } else {
            char lastLetter = sentence.charAt(sentence.length() - 1);

            String restOfString = sentence.substring(0, sentence.length() - 1);
        }
        return " ";
    }

    public static String niceMove(String wingWu) {
        switch (wingWu) {
            case "wo":
                return "watza";

            case "ni":
                return "matzu";

            default:
                return null;
        }
    }

    public static String reverseString(String miWordo) {
        char let = ' ';
        StringBuilder sb = new StringBuilder();

        for (int i = miWordo.length() - 1; i > 0; i--) {
            sb.append(miWordo.charAt(i));


        }
        return sb.toString();

    }

    public static boolean inSleep(boolean isWeekday, boolean inVaca) {
        if (!isWeekday || inVaca) {
            return true;

        }
        return false;

    }

    public static String frontBack(String str) {
        char lastChar = str.charAt(str.length() - 1);
        char firstChar = str.charAt(0);
        String finalString;


        finalString = lastChar + str.substring(1, str.length() - 1) + firstChar;

        return finalString;//you just want it to switch and not iterate;

    }

    public static int sumNums(int n) {
        return 0;
    }

    public static void sortInteg(int[] wow) {
        List<Integer> quahoa = new ArrayList<>();
        for (int i = 0; i < wow.length; i++) {
            quahoa.add(wow[i]);
        }
        for (int i = quahoa.size(); i > 0; i--) {
            int largest = 0;
            for (int j = 0; j < i; j++) {
                if (quahoa.get(j).compareTo(quahoa.get(largest)) > 0) {
                    largest = j;
                }

            }
            int tempo = quahoa.get(largest);
            quahoa.set(largest, quahoa.get(i - 1));
            quahoa.set(i - 1, tempo);
            System.out.println(quahoa.get(i - 1));
        }
    }

    public static HashMap<Character, Integer> countLets(String nice) {
        HashMap<Character, Integer> miMapo = new HashMap<>();
        int timeSeen = 0;
        for (int i = 0; i < nice.length(); i++) {
            char unoLet = nice.charAt(i);

            if (miMapo.containsKey(unoLet)) {

                miMapo.put(unoLet, miMapo.get(unoLet) + 1);


            } else {
                miMapo.put(unoLet, 1);
            }

        }
        return miMapo;
    }
    public static String reuse(String s){
        String c="";
        for (int i=s.length()-1;i>=0;i--){
            c+=s.charAt(i);
        }

        return c;
    }
    static String decode(String str) {
        Stack<Integer> integerstack = new Stack<>();
        Stack<Character> stringstack = new Stack<>();
        String temp = "", result = "";

        // Traversing the string
        for (int i = 0; i < str.length(); i++)
        {
            int count = 0;

            // If number, convert it into number
            // and push it into integerstack.
            if (Character.isDigit(str.charAt(i)))
            {
                while (Character.isDigit(str.charAt(i)))
                {
                    count = count * 10 + str.charAt(i) - '0';
                    i++;
                }

                i--;
                integerstack.push(count);
            }

            // If closing bracket ']', pop elemment until
            // '[' opening bracket is not found in the
            // character stack.
            else if (str.charAt(i) == ']')
            {
                temp = "";
                count = 0;

                if (!integerstack.isEmpty())
                {
                    count = integerstack.peek();
                    integerstack.pop();
                }

                while (!stringstack.isEmpty() && stringstack.peek()!='[' )
                {
                    temp = stringstack.peek() + temp;
                    stringstack.pop();
                }

                if (!stringstack.empty() && stringstack.peek() == '[')
                    stringstack.pop();

                // Repeating the popped string 'temo' count
                // number of times.
                for (int j = 0; j < count; j++)
                    result = result + temp;

                // Push it in the character stack.
                for (int j = 0; j < result.length(); j++)
                    stringstack.push(result.charAt(j));

                result = "";
            }

            // If '[' opening bracket, push it into character stack.
            else if (str.charAt(i) == '[')
            {
                if (Character.isDigit(str.charAt(i-1)))
                    stringstack.push(str.charAt(i));

                else
                {
                    stringstack.push(str.charAt(i));
                    integerstack.push(1);
                }
            }

            else
                stringstack.push(str.charAt(i));
        }

        // Pop all the elmenet, make a string and return.
        while (!stringstack.isEmpty())
        {
            result = stringstack.peek() + result;
            stringstack.pop();
        }

        return result;
    }
    public static String returnString(){
        return "someString";
    }

    public static String callBack(Callback callback){
        return callback.toString();

    }
    public static void function2(SomeCallBack callback){
        callback.call("someString");//A callback doesn't necessarily have to be a functional interface.
    }




}
interface SomeCallBack{
    void call(String s);//Callback is an interface and could return an output.
}
