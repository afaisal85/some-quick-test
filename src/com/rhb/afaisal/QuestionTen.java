package com.rhb.afaisal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Question 10 - Write a program to read a text file from first record until last record, and for each record, display one of the fields in the record on the listing report
 */
public class QuestionTen {
    public static void main(String[] args) {
        URL pathToFile = QuestionTen.class.getResource("textfile.txt");
        List<String[]> records = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(pathToFile.getFile()))) {
            for (String line = br.readLine(); line != null; line = br.readLine()) {
                String[] row = line.split(",");
                records.add(row);
            }
        } catch (IOException ex) {
            System.out.println("Oops an error has occurred.");
            System.out.println(String.format("See the following error message to learn more:\n%s", ex));
        }

        if (!records.isEmpty()) {
            System.out.println("Displaying the value from the first column for each row");
            for (String[] record : records) {
                System.out.println(record[0]);
            }
        }
    }
}
