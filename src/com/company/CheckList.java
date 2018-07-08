package com.company;

import java.util.Scanner;

public class CheckList {
    public static LinkedListStack_queue myList= new LinkedListStack_queue();

    public static void main(String[] args) {
//        options();
        System.out.println(sortByString("news","views"));

        // write your code here
    }
    public static void options(){
        int quitloop=0;

        do {
            System.out.println("enter command");
            System.out.println("options");
            System.out.println("Type\"add\" to input String to list.");
            System.out.println("Type\"copy\" to re enter last string.");
            System.out.println("type\"delete\" to remove last string.");
            System.out.println("Type\"undo\" to add back removed string.");
            System.out.println("Type\"quit\" to exit program.");

            Scanner scanner= new Scanner(System.in);
            String command= scanner.nextLine();

            command=command.toUpperCase();

            switch (command){
                case "ADD":
                    myList.push();
                    break;
                case "COPY":
                    myList.Copy();
                    break;
                case "DELETE":
                    myList.remove();
                    break;

                case "UNDO":
                    myList.undo();
                    break;

                case "QUIT":
                    System.out.println("ending process");
                    quitloop++;
                    break;

                default:
                    System.out.println("enter valid number");
                    continue;
            }

            myList.printList();



        } while (quitloop==0);
    }
    public static String sortByString(String s, String t){
        String emptyString=" ";
        for (int i = 0; i < t.length(); i++) {
            String charString=String.valueOf(t.charAt(i));
            if (s.contains(charString)){
                emptyString+=charString;
            }
        }
        return emptyString;
    }
}
