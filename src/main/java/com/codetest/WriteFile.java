package com.codetest;
import java.io.*;
import java.io.FileWriter;

public class WriteFile {


    public  void WriteFile(String [] name, Float [] total, Float[] year, Float[] monthly)  {

        try {
            //Writing file. If the file exsicts then one can get an error. In that case try to run the code again and
            //it should be working.
            PrintWriter writeFile = new PrintWriter(new FileWriter("./answer.txt"));

            //Write as many lines as there is information
            for (int i = 0; i < name.length; i++) {
                writeFile.write(
                        "Prospect " + (i + 1) + ": " + name[i] + " wants to borrow "
                                + total[i] + "€ for a period of " + year[i] + " years and pay "
                                + monthly[i]+ "€ each month."+"\n");
            }

            writeFile.close();

        } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
        }
    }


}
