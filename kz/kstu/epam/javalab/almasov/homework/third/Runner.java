package kz.kstu.epam.javalab.almasov.homework.third;

import java.util.List;

public class Runner {
    
    /*﻿из файла удалить все слова содержащие от трех до пяти символов но при этом
      из каждой строки должно быть удалено только максимальное четное
      количество таких слов*/

    public static void main(String[] args) {
        
        String filePath = "D:\\Erzhan\\Learning\\Проекты\\Java\\ThirdHomeWork\\src\\text.txt";
        
        String textFromFile = FileManager.readFromFile(filePath);
        
        System.out.println("Text from file:\n" + textFromFile);
        
        List<String> strings = StringManager.divTextToStrings(textFromFile);
        
        List<String> result = StringManager.removeWordsCertainLength(strings, 3, 5);
        
        System.out.println("Result:");
        
        for(String resultString : result){
            
            System.out.println(resultString);
            
        }
    }
    
}
