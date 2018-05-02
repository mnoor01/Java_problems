package com.company;

import com.sun.javafx.robot.impl.FXRobotHelper;
import jdk.nashorn.api.scripting.JSObject;

import java.text.DecimalFormat;
import java.util.*;

public class CheckMyLinkedList {
    public static MyLinkedList myLinkedList = new MyLinkedList();
//    public static LinkedList<String> miList = new LinkedList<>();

    public static void main(String[] args) {
        HashMap<String, String> nice = new HashMap<>();
        nice.put("hey", "new");
        nice.put("are", "you");
        nice.put("they", "two");
        nice.put("we", "us");
        nice.put("mira", "jollyrancher");
        nice.put("puedo", "jos");
        nice.put("pingo", "pango");
        nice.put("zero", "cero");
        int[] nu = {5, 8, 4, 3, 5};
        System.out.println(Arrays.toString(firstLet(nu)));
//        System.out.println(isSum(nu));
//        selectionSort(nice);
//        System.out.println(sortString("nice"));
//        System.out.println(intToChar("miami"));
//        System.out.println(intToChar("miami"));
//        System.out.println(flex("ooooooooflekfluxflixflmxflkxoooooooo"));
        int[] nums = new int[]{1, 3, 5, 3, 24, 6, 7, 6};
        System.out.println(nBigDifferencs(nums));


//        System.out.println(selectEvenNumbers(nums));
//        System.out.println(Arrays.toString(newEven(nums)));
//        System.out.println(answer("(718)(441)0245"));


        // write your code here
    }

    public static void choices() {
        int n = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("type \" add \" to add a word");
            System.out.println("type \"remove\" to delete last word");
            System.out.println("type \"undo\"to add back deleted word");
            System.out.println("type\"quit\" to exit");
            String userInput = scanner.nextLine();
            userInput = userInput.toUpperCase();

            switch (userInput) {
                case "ADD":
                    myLinkedList.push();
                    break;

                case "REMOVE":
                    myLinkedList.remove();
                    break;

                case "UNDO":
                    myLinkedList.undo();
                    break;

                case "QUIT":
                    System.out.println("Thanks for putting in words");

                default:
                    System.out.println("wrong input");
                    break;
            }
            myLinkedList.printList();
        } while (n == 0);


    }

    public static void selectionSort(HashMap<String, String> map) {
        List<String> mapWords = new ArrayList<>();
        for (String words : map.keySet()) {
            mapWords.add(words);
        }
        for (int i = 0; i < mapWords.size(); i++) {
            int minMax = i;
            for (int j = i; j < mapWords.size(); j++) {
                if (mapWords.get(j).compareTo(mapWords.get(minMax)) < 0) {
                    minMax = j;

                }
                if ((mapWords.get(j).compareTo(mapWords.get(j)) > 0)) {
                    minMax = j;
                }
            }
            String tmp = mapWords.get(minMax);
            mapWords.set(minMax, mapWords.get(i));
            mapWords.set(i, tmp);
        }
        System.out.println(mapWords);


    }

    private static int flex(String word) {
        int count = 0;
        for (int i = 0; i < word.length() - 3; i++) {
            if (word.charAt(i) == 'f' && word.charAt(i + 1) == 'l' && word.charAt(i + 3) == 'x') {
                count += 1;
            }
        }
        return count;
    }

    public static List<Integer> selectEvenNumbers(int[] numbArray) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < numbArray.length; i++) {
            if (numbArray[i] % 2 == 0) {
                integerList.add(numbArray[i]);
            }
        }
        return integerList;
    }

    public static Integer[] removeStuff(int[] input) {
        Set<Integer> set = new HashSet<>();

        for (int num : input) {
            set.add(num);

        }
        return set.toArray(new Integer[set.size()]);

    }

    public static int[] newEven(int[] numbers) {
        int newNumbs;

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            int hey = numbers[i];

            if (hey % 2 == 0) {
                list.add(hey);
            }
            //


        }
        numbers = new int[list.size()];
        for (int j = 0; j < list.size(); j++) {

            newNumbs = list.get(j);
            numbers[j] = newNumbs;
        }

        return numbers;
    }

    //    public static HashMap<Character,Integer> countWrds()
    public static String answer(String phone_number) {
        if (phone_number == null || phone_number.isEmpty() || phone_number.length() < 10) {
            return null;
        }
        String nuevoPhone = "";
        for (int i = 0; i < phone_number.length(); i++) {
            char cut = phone_number.charAt(i);
            if (Character.isDigit(cut)) {
                nuevoPhone += String.valueOf(cut);
            }

        }
        String output = nuevoPhone.substring(0, 3) + "-" + nuevoPhone.substring(3, 6) + "-" + nuevoPhone.substring(6, nuevoPhone.length());
        if (output.length() > 12) {
            return null;
        } else {

            return output;
        }


    }

    public static boolean isSum(int[] numArray) {
        int count = 0;
        for (int i = 0; i < numArray.length; i++) {
            for (int j = i; j < numArray.length; j++) {
                if (numArray[i] + numArray[j] == 7) {
                    return true;
                }

            }
        }
        return false;
    }

    public static String intToChar(String ch) {
        String n = " ";
        for (int i = 0; i < ch.length(); i++) {
            if (Character.isLetter(ch.charAt(i))) {
                n += (char) (ch.charAt(i) + 1);
            } else {
                n += ch.charAt(i);

            }
        }
        return n;
    }

    public static String sortString(String input) {
        int temp = ' ';
        String nice = " ";

        for (int i = 0; i < input.length(); i++) {
            char min = input.charAt(0);
            for (int j = i; j < input.length(); j++) {
                if (min > input.charAt(j)) {
                    min = input.charAt(j);
                    String part=input.substring(0,j);

                }

            }
            nice+=min;

        }
        return nice;
    }
    public static int[] firstLet(int [] numArray){
        ArrayList<Integer> list= new ArrayList<>();
        int[] retArray=new int[numArray.length];
        for (int nume: numArray) {
            list.add(nume);
        }
        for (int i = 0; i < list.size(); i++) {
             int temp=list.get(i);
            list.remove(i);
            int numTemp=1;
            for (int j = i; j < list.size(); j++) {
                numTemp*=list.get(j);

            }
            list.add(temp);

            retArray[i]=numTemp;


        }
        return retArray;

    }
    public static int bigDifference(int[] numbers){
        if (numbers.length==1){
            return numbers[0];
        }
        int smallest=numbers[0];
        int largest=numbers[0];

        for (int i :numbers) {
            smallest=Math.min(i,smallest);
            largest=Math.max(i,largest);
        }
        return largest-smallest;
    }
    public static int nBigDifferencs(int[] numbers){
        return rBigDifference(numbers,numbers[0],numbers[0],0);
    }
    public static int rBigDifference(int[] num,int smallest, int largest,int position){
        smallest= Math.min(num[position],smallest);
        largest=Math.max(num[position],largest);
        if (position==num.length-1){
            return largest-smallest;
        }
        return rBigDifference(num,smallest,largest,position+1);
    }

}
/*
Scenario
You are working as a security expert for an online site, and have noticed an increasing amount of bot activity. You have been tasked with identifying and collecting bot activity.

Your company stores all user accesses to the site in multiple log files. Each line in a log file represents one access of one user, for example:

{"timestamp": 1487722870, "user": "Una", "action": "navigate"}
where the timestamp is the unix time, in seconds.
We declare a user to be a bot if it satifisfies two conditions:

The user performs at least 15 actions within any window of duration 6 minutes; and
Of those accesses, at least 7 correspond to the same action (eg, navigate).
Task
Write a function bot_detection(input_dir, output_dir) to collect all bot accesses. Specifically, the input_dir is the absolute path to a folder containing the accesses of all users (bots and non-bots). The accesses are split between multiple log files, for example:


(input_dir)
|-- log_1.txt
|-- log2
|   `-- log_2.txt
|-- log3
|   `-- log_3.txt
`-- log4

log_1.txt:
    {"timestamp": 1487184625, "user": "Eric", "action": "navigate"}
    {"timestamp": 1487184655, "user": "Bill", "action": "browse"}
    {"timestamp": 1487184685, "user": "Eric", "action": "key press"}
    {"timestamp": 1487184715, "user": "John", "action": "idle"}
    {"timestamp": 1487184755, "user": "Tran", "action": "search"}
    ...

log_2.txt:
    {"timestamp": 1487098049, "user": "Tran", "action": "click"}
    {"timestamp": 1487098079, "user": "Eric", "action": "click"}
    {"timestamp": 1487098109, "user": "Tran", "action": "click"}
    {"timestamp": 1487098139, "user": "Bill", "action": "navigate"}
    {"timestamp": 1487098169, "user": "Tran", "action": "search"}
    {"timestamp": 1487184716, "user": "Tran", "action": "search"}
    {"timestamp": 1487298169, "user": "Tran", "action": "search"}
    ...

log_3.txt:
    {"timestamp": 1487271407, "user": "Bill", "action": "search"}
    {"timestamp": 1487271467, "user": "John", "action": "navigate"}
    {"timestamp": 1487271527, "user": "Dave", "action": "browse"}
    ...
The function bot_detection should find all the bot accesses in input_dir, and place them in output_dir, which is the relative path with respect to the folder /home/candidate/candidate_files/java. For example, if you've established that the user Tran is the only bot in the system, the function should produce an output_dir containing only accesses associated with Tran:


(output_dir)
|-- log_1.txt
|-- log2
|   `-- log_2.txt
|-- log3
`-- log4

log_1.txt:
    {"timestamp": 1487184755, "user": "Tran", "action": "search"}
    ...

log_2.txt:
    {"timestamp": 1487098049, "user": "Tran", "action": "click"}
    {"timestamp": 1487098109, "user": "Tran", "action": "click"}
    {"timestamp": 1487098169, "user": "Tran", "action": "search"}
    {"timestamp": 1487184716, "user": "Tran", "action": "search"}
    {"timestamp": 1487298169, "user": "Tran", "action": "search"}
    ...
In the example above, all bot accesses present in (input_dir)/log_1.txt are copied to (output_dir)/log_1.txt, but non-bot accesses are excluded. Also note that the file (output_dir)/log3/log_3.txt doesn't exist, because the corresponding file (input_dir)/log3/log_3.txt doesn't contain any bot accesses.

Additional requirements
The function bot_detection must return the total number of bots found in input_dir. For example, if the only bot is Tran, the return value should be 1.
If you determine that a user is a bot, then output_dir must retain all accesses of that user.
As exemplified above, the folder structure of output_dir must match that of input_dir, except for the removal of files without bot accesses.
In each file of output_dir, the bot accesses must be sorted by ascending order of timestamps.
Do not modify the input directory in any way.
Assumptions
The input_dir directory is guaranteed to exist and contains only valid log files. However, these files could be in any subdirectories under input_dir.
The output_dir directory is guaranteed to exist and will be empty.
In each log file of input_dir, the user accesses are guaranteed to be sorted by increasing timestamp. Do not make any additional assumptions on the relationship between timestamps in different log files.
Save your code in /home/candidate/candidate_files/java/Answer.java

Please refer to the Debug tab for the instructions on how to test your answer.
 */
