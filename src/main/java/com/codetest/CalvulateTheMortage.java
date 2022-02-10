package com.codetest;
import java.util.ArrayList;
import java.util.List;

class CalculateTheMortage {

    public float e(float u, float bDecimal, float pPower){
        //the end calculation
        return (u * ((bDecimal) * pPower) / (pPower - 1));
    }


    public void CalculateTheMortage(Float [] b, Float[] u, Float[] y, String[] name) {

        List<Float> answetToArray = new ArrayList<Float>();


        for (int i = 0; i < name.length; i++) {

            //Change year to total payments
            float p = y[i] * 12;

            //change interest from % to decimal and then calculate the monthly interest
            float bDecimal = ((b[i] / 100) / 12);

            float pPower = 1;
            float b1 = (1 + (bDecimal));

            //Calculating the ((1+b)^p) part of the calculation
            for (float j = p; j != 0; j--) {
                pPower = (pPower * b1);
            }

            //Getting the answer
            float answer=e(u[i],bDecimal,pPower);

           //Writing out the result in system.out
            System.out.println(
                    "****************************************************************************************************\n"
                            + "Prospect " + (i + 1) + ": " + name[i] + " wants to borrow "
                            + u[i] + "€ for a period of " + y[i] +
                            " years and pay " + answer+ "€ each month.\n" +
                    "****************************************************************************************************");

            //Adding answer to the list
            answetToArray.add(answer);
        }

        //Send data to WriteFile
        Float [] answerA=answetToArray.toArray(new Float[0]);
        new WriteFile().WriteFile(name,u,y,answerA);

    }



}
