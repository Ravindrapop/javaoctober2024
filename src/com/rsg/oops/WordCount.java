package com.rsg.oops;
import java.util.*;
import java.util.stream.*;

public class WordCount {
    public static void main(String[] args) {
        String input = "hello world hello stream hello java stream java";

        // Split the string into words and count occurrences using Streams
        Map<String, Long> wordCounts = Arrays.stream(input.split("\\s+")) // Split by whitespace
            .collect(Collectors.groupingBy(
                word -> word,          // Group by the word itself
                Collectors.counting()  // Count occurrences
            ));

        // Print the result
        System.out.println(wordCounts);
    }
}
