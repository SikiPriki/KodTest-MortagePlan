package com.codetest;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.regex.Pattern;


public class ReadFile {
    public String name="";
    public float  y;
    public float  u;
    float b;
    //https://www.baeldung.com/java-file-to-arraylist
    public ArrayList<String> stringtoArray = new ArrayList<>();

    public  ReadFile() {

        List<String> name = new ArrayList<String>();
        List<Float> interest = new ArrayList<Float>();
        List<Float> loan = new ArrayList<Float>();
        List<Float> year = new ArrayList<Float>();
        System.out.println("Yellow1");

        //https://www.reddit.com/r/learnprogramming/comments/at2s9u/hard_time_figuring_out_how_to_split_my_text_file/
        try {
            System.out.println("inTry");
            File findFile = new File("./paymentInfo.txt");
            //File findFile = new File("./procpects.txt");
            String forbidden="";
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

                System.out.println(fileData[allInfo.size() - 1]);

                for(int i=0; i<(allInfo.size()-1); i++){
                    System.out.println(i);
                    String [] split =fileData[i].split(Pattern.quote(","));
                    name.add(split[0]);
                    loan.add(Float.parseFloat(split[1]));
                    interest.add(Float.parseFloat(split[2]));
                    year.add(Float.parseFloat(split[3]));
                    System.out.println("fileDataFor: "+fileData[i]);
                    //String toFloat=(split[1]);
                    //String toFloat=(split[1]);

                   // interest.add(split[2]);
                    //interest.add(Float.parseFloat(split[1]));

                }
                String[] nameData = name.toArray(new String[0]);
                Float [] loanData=loan.toArray(new Float[0]);
                Float [] interestData=interest.toArray(new Float[0]);
                Float [] yearData=year.toArray(new Float[0]);

                //To test
                System.out.println(nameData[2]);


                readFile.close();
                new CalculateTheMortage().CalculateTheMortage(interestData,loanData,yearData,nameData);
            } else {
                System.out.println("The file does not exist.");
            }

            System.out.println("Em");

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


           /*     while (readFile.hasNextLine()) {

                    fileData+=readFile.nextLine()+"|";
                }

        //System.out.println(fileData);
        String originalData = fileData;
        String [] splitData= originalData.split(Pattern.quote("|"));

        //Getting the name and then separating name: and the customer name
        String [] nameSplit= splitData[0].split(Pattern.quote(": "));
        name= nameSplit[1];

        //getting the intrest
        String [] bSplit = splitData[1].split(Pattern.quote(": "));
        String [] bSplitTwo= bSplit[1].split(Pattern.quote("%"));
        b = Float.parseFloat(bSplitTwo[0]);

        String [] loanSplit = splitData[2].split(Pattern.quote(": "));
        String [] loanSplitTwo = loanSplit[1].split(Pattern.quote("€"));
        u = Float.parseFloat(loanSplitTwo[0]);

        String [] yearSplit= splitData[3].split(Pattern.quote(": "));
        y = Float.parseFloat(yearSplit[1]);

        new CalculateTheMortage().CalculateTheMortage(b,u,y,name);
*/
    }
}
