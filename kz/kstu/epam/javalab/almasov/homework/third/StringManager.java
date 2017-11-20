package kz.kstu.epam.javalab.almasov.homework.third;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StringManager {

    public static List<String> divTextToStrings(String text) {

        String[] stringsArr = text.split("\r\n"); 

        List<String> listOfStrings = new ArrayList<>();

        listOfStrings.addAll(Arrays.asList(stringsArr));

        return listOfStrings;
    }

    public static List<String> removeWordsCertainLength(List<String> strings, int minLength, int maxLength) {

        List<String> result = new ArrayList<>();

        for (String string : strings) {
            
            String[] wordsArr = string.split(" ");

            List<String> listOfWords = new ArrayList<>();

            listOfWords.addAll(Arrays.asList(wordsArr));
            
            List<String> wordsToRemove = new ArrayList<>();
            
            for(int i = 0; i < listOfWords.size(); i++){
                
                int length = listOfWords.get(i).length();

                if (length >= minLength && length <= maxLength) {
                    
                    wordsToRemove.add(listOfWords.get(i));
                    
                }
                
            }

            int removeWordsNumber = 0;
            
            if(wordsToRemove.size() % 2 == 0){
                removeWordsNumber = wordsToRemove.size();
            } else{
                removeWordsNumber = wordsToRemove.size()-1;
                wordsToRemove.remove(removeWordsNumber);
            }
            
            listOfWords.removeAll(wordsToRemove);

            String resultString = new String();

            for (String word : listOfWords) {

                resultString += " " + word;

            }

            result.add(resultString);

        }

        return result;

    }

}
