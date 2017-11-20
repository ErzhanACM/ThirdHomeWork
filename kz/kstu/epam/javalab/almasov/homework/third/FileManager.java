package kz.kstu.epam.javalab.almasov.homework.third;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileManager {

    public static String readFromFile(String filePath) {

        StringBuilder textFromFile = new StringBuilder();

        int symbol;

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)))) {
            
            while ((symbol = bufferedReader.read()) != -1) {
                textFromFile.append((char)symbol);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return textFromFile.toString();

    }

}
