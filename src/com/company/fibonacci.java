package com.company;

import java.util.*;

import static com.company.Main.countItems;

public class fibonacci {
    private static HashMap<Integer, Integer> memoizationMap = new HashMap<>();
    public static void main(String[] args) {
        // write your code here
        System.out.println("Fib(100) = " + fib(100));

        ArrayList<String> oneParen = parens(1);

        System.out.println("Printing one paren");
        for (String combo : oneParen) {
            System.out.println(combo);
        }

        ArrayList<String> twoParen = parens(2);

        System.out.println("Printing two paren");
        for (String combo : twoParen) {
            System.out.println(combo);
        }

        ArrayList<String> threeParen = parens(3);

        System.out.println("Printing three paren");
        for (String combo : threeParen) {
            System.out.println(combo);
        }

        ArrayList<String> fourParen = parens(4);

        System.out.println("Printing four paren");
        for (String combo : fourParen) {
            System.out.println(combo);
        }

        System.out.println("parens(4) has " + fourParen.size() + " combos");
        System.out.println("parens(5) has " + parens(5).size() + " combos");

        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(new Object());

        System.out.println("Tail Count of [] == " + countItems(Collections.emptyList()));
        System.out.println("Head Count of [] == " + countItems(Collections.emptyList(), 0));

        System.out.println("Tail Count of [1] == " + countItems(arrayList));
        System.out.println("Head Count of [1] == " + countItems(arrayList,0));

        arrayList.add(new Object());
        System.out.println("Tail Count of [2] == " + countItems(arrayList));
        System.out.println("Head Count of [2] == " + countItems(arrayList, 0));

        arrayList.add(new Object());
        System.out.println("Tail Count of [3] == " + countItems(arrayList));
        System.out.println("Head Count of [3] == " + countItems(arrayList,0));

        arrayList.add(new Object());
        System.out.println("Tail Count of [4] == " + countItems(arrayList));
        System.out.println("Head Count of [4] == " + countItems(arrayList,0));

        arrayList.add(new Object());
        System.out.println("Tail Count of [5] == " + countItems(arrayList));
        System.out.println("Head Count of [5] == " + countItems(arrayList,0));

    }

    public static int fib(int n) {
        if (n <= 1) {
            return 1;
        } else {
            int first;

            // Check to see if you've already done the work
            if (memoizationMap.containsKey(n - 1)) {
                first = memoizationMap.get(n - 1);
            } else {
                // Need to compute
                first = fib(n - 1);
                // Save your work
                memoizationMap.put(n - 1, first);
            }

            int second;
            if (memoizationMap.containsKey(n - 2)) {
                second = memoizationMap.get(n - 2);
            } else {
                // Need to compute
                second = fib(n - 2);
                // Save your work
                memoizationMap.put(n - 2, second);
            }

            return first + second; // fib(n-1) + fib(n-2)
        }
    }

    public static ArrayList<String> parens(int n) {
        return parensHelper(n, new ArrayList<>());
    }

    public static ArrayList<String> parensHelper(final int parens, final List<String> combos) {
        if (parens == 1) {
            ArrayList<String> singleCombo = new ArrayList<>();
            singleCombo.add("()");
            return singleCombo;
        } else {
            ArrayList<String> prevCombos = parensHelper(parens - 1, combos);

            HashSet<String> newComboSet = new HashSet<>();

            // Generate new combos based on old combos
            for (String parenCombo : prevCombos) {
                newComboSet.add("()" + parenCombo);
                newComboSet.add(parenCombo + "()");
                newComboSet.add("(" + parenCombo + ")");

                // Insert the ")(" pattern into every possible index of the combo
                for (int i = 0; i <= parenCombo.length(); i++) {

                    String firstHalf = parenCombo.substring(0, i);
                    String secondHalf = parenCombo.substring(i);

                    String middleInsert = firstHalf + ")(" + secondHalf;

                    // Only insert valid closed paren combos
                    if (isClosed(middleInsert)) {
                        newComboSet.add(middleInsert);
                    }
                }
            }

            ArrayList<String> newComboList = new ArrayList<>();
            newComboList.addAll(newComboSet);

            return newComboList;
        }
    }

    // Helper function to determine if all the parens in a string are matched/closed
    public static boolean isClosed(String parens) {
        if (parens.length() == 0) {
            return true;
        }

        // Remove all instances of "()"
        String closedParensRemoved = parens.replaceAll("\\(\\)", "");

        // For example, removing "()" from ")" results in the same string
        if (closedParensRemoved.length() == parens.length()) {
            return false;
        }

        return isClosed(closedParensRemoved);
    }


    // Tail Recursion - Less memory efficient because you have to hold onto all the stackframes
    public static int countItems(List<Object> list) {
        if (list.isEmpty()) {
            return 0;
        }

        List subList = list.subList(1, list.size());

        return 1 + countItems(subList);
    }

    // Head Recursion - more memory efficient because you don't have to retain anything from previous stack frames
    public static int countItems(List<Object> list, int counter) {
        if (list.isEmpty()) {
            return counter;
        }

        return countItems(list.subList(1, list.size()), ++counter);
    }
}
