package com.codetest;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.regex.Pattern;


public class ReadFile {

    public  ReadFile() {

        List<String> name = new ArrayList<String>();
        List<Float> interest = new ArrayList<Float>();
        List<Float> loan = new ArrayList<Float>();
        List<Float> year = new ArrayList<Float>();

        try {
            //File findFile = new File("./paymentInfo.txt");
            File findFile = new File("./procpects.txt");
            if (findFile.exists()) {
                Scanner readFile = new Scanner(findFile);
                List<String> allInfo = new ArrayList<String>();

                while (readFile.hasNextLine()) {
                        String text=readFile.nextLine();
                        if(!text.isEmpty()){
                            allInfo.add(text);
                        }

                }
                //Removing the: Customer,Total loan,Interest,Years from Array List
                allInfo.remove(0);
                String[] fileData = allInfo.toArray(new String[0]);

                for(int i=0; i<(allInfo.size()); i++){
                    System.out.println(i);
                    if ((!fileData[i].matches("[^\"]*"))){
                        System.out.println("Forbidden character in the: "+(i+1)+"th input. Check for \"");
                    }else{
                        if(!fileData[i].matches("[^,]+")) {
                            String[] split = fileData[i].split(Pattern.quote(","));
                            name.add(split[0]);
                            loan.add(Float.parseFloat(split[1]));
                            interest.add(Float.parseFloat(split[2]));
                            year.add(Float.parseFloat(split[3]));
                            System.out.println("fileDataFor: " + fileData[i]);
                        }else {
                            System.out.println("Eroor occured. Make sure that columns are separated with , ");
                        }
                    }
                }
                String[] nameData = name.toArray(new String[0]);
                Float [] loanData=loan.toArray(new Float[0]);
                Float [] interestData=interest.toArray(new Float[0]);
                Float [] yearData=year.toArray(new Float[0]);

                readFile.close();
                new CalculateTheMortage().CalculateTheMortage(interestData,loanData,yearData,nameData);
            } else {
                System.out.println("The file does not exist.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
