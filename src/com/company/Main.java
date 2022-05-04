package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        try(FileReader fr = new FileReader("input.txt"); FileWriter fw = new FileWriter("output.txt")){
            StringBuilder text = new StringBuilder();
            char i;
            while((i = (char) fr.read())!=(char) 65535){
                text.append(i);
            }
            String output = text.toString().replaceAll("(((\\<)(.*)(\\>))|((\\<)(.*)\r\n(.*)(\\>)))","");
            fw.write(output);
        }
        catch (IOException ex){
            ex.getMessage();
        }
    }
}
