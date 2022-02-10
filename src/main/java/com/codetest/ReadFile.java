package com.codetest;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.regex.Pattern;


public class ReadFile {

    public  ReadFile() {

        //Array lists
        List<String> name = new ArrayList<String>();
        List<Float> interest = new ArrayList<Float>();
        List<Float> loan = new ArrayList<Float>();
        List<Float> year = new ArrayList<Float>();

        try {

            //Getting the file
            //File findFile = new File("./paymentInfo.txt");
            File findFile = new File("./procpects.txt");

            //Seeing if the file exists
            if (findFile.exists()) {

                Scanner readFile = new Scanner(findFile);
                List<String> allInfo = new ArrayList<String>();

                //Add all information to the array list "allInfo"
                while (readFile.hasNextLine()) {

                        String text=readFile.nextLine();

                        //If the line is not empty. Like this we get rid of the empty lines
                        if(!text.isEmpty()){
                            allInfo.add(text);
                        }

                }
                //Removing the: Customer,Total loan,Interest,Years from Array List.
                allInfo.remove(0);
                String[] fileData = allInfo.toArray(new String[0]);

                for(int i=0; i<(allInfo.size()); i++){

                    if ((!fileData[i].matches("[^\"]*"))){

                        System.out.println("Forbidden character in the: "+(i+1)+"th input. Check for \"");

                    }else{

                        //Looking if the lines have or do not have , in them (Like that we will get rid of the dot
                        if(!fileData[i].matches("[^,]+")) {

                            String[] split = fileData[i].split(Pattern.quote(","));

                            //Adding data to the lists
                            name.add(split[0]);
                            loan.add(Float.parseFloat(split[1]));
                            interest.add(Float.parseFloat(split[2]));
                            year.add(Float.parseFloat(split[3]));

                        }else{
                            System.out.println("Eroor occured. Make sure that columns are separated with , ");
                        }
                    }
                }

                //Arraylist to arrays
                String[] nameData = name.toArray(new String[0]);
                Float [] loanData=loan.toArray(new Float[0]);
                Float [] interestData=interest.toArray(new Float[0]);
                Float [] yearData=year.toArray(new Float[0]);

                readFile.close();

                //Calculation
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
