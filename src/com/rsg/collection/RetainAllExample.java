package com.rsg.collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RetainAllExample {
    public static void main(String[] args) {
        // List 1
        List<String> list1 = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));

        // List 2
        List<String> list2 = Arrays.asList("B", "D", "E");

        // Retain elements in list1 that are also in list2
        list1.retainAll(list2);

        // Print the modified list1
        System.out.println("Modified List1: " + list1); // Output: [B, D]
    }
}
