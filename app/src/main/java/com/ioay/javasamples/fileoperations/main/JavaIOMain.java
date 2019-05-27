package com.ioay.javasamples.fileoperations.main;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaIOMain {

    public static void main(String args[]) {
        writeToFile();
        readToFile();

    }


    public static void writeToFile() {


        try {
            File file = new File("C:\\JavaSamples\\writetofile.txt");
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter writer = new FileWriter(file);
            writer.write("Hello World ! ");

            writer.flush();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void readToFile() {

        try {
            File file = new File("C:\\JavaSamples\\writetofile.txt");
            FileReader reader = new FileReader(file);

            StringBuilder builder = new StringBuilder();

            int information = 0;

            while ((information=reader.read()) != -1){
                builder.append((char)information);
            }

            reader.close();

            System.out.println("The value : " + builder.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
