

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
//can't figure out how to take out first character and run final array?



public class LinkedListPractice {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        LinkedList<Character> linkedList = new LinkedList<>();
        for (char i = 1; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                linkedList.add(s.charAt(i));
                System.out.println(linkedList);
            }
            }
        }
    }



